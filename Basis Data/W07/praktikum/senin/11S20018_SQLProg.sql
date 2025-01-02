go
---PROGRAMMING SQL---
go
--a)batches
use ENTERPRISE_11S20018
select * from EMPLOYEES
	--example
	use tempdb
	create table dbo.t3(a int);
	insert into dbo.t3 values (1);
	insert into dbo.t3 values (1,1);
	insert into dbo.t3 values (3);
	select * from dbo.t3
--b)variable
use tempdb
declare @Charge int
declare @myvar char(20)
set @myvar = 'This is a test'
select @myvar
--c)local variable
use PresDB
declare @president_name char(16),
		@party char(11),
		@yrs_serv int
set @president_name = 'Roosevelt T'

select @party = PARTY, @yrs_serv = YRS_SERV 
from PRESIDENT
where PRES_NAME = @president_name

print 'President ' + rtrim(@president_name) + ' from ' + @party + ' party served for ' +
cast(@yrs_serv as varchar(5)) + ' years'
--d)cast and convert
	--cast
select 9.5 as original, cast (9.5 as int) as in_integer,
cast(9.5 as decimal(6,4)) as in_decimal;
	--convert
select 9.5 as original, convert(int, 9.5) as in_integer,
convert(decimal(6,4), 9.5) as in_decimal;
--e)Printing Message
declare @myname char(50)
select @myname = 'Ruth Aulya Silalahi'
print @myname
--f)Dynamically Constructing Statements
declare @dbname varchar(30), @tblname varchar(30)
set @dbname = 'PresDB'
set @tblname = 'President'

execute
('USE ' + @dbname + ' SELECT * FROM ' + @tblname)
--g)Using Transaction
	--example
/*	begin transaction
	update savings set amount = (amount -100)
	where custid = 78910
		<Rollback transaction if error>
	update checking set amount = (amount + 100)
	where custid = 78910
		<Rollback transaction if error>
	commit transaction	*/
--h)If...Else Statement
declare @party char(11)
set @party = 'Republican'
if @party = 'Republican'
	select * from PRESIDENT where PARTY = @party
else
	select * from PRESIDENT
--i)begin...end block
declare @party char(11)
set @party = 'Republican'
if @party = 'Republican'
	select * from PRESIDENT where PARTY = @party
else
	begin
	set @party = 'Democratic'
	select * from PRESIDENT where PARTY = @party
	end
--j)case
declare @CharParty char(1),
		@Party char(11);
set @CharParty = 'F';
set @Party =
	case @CharParty
		when 'D' then 'Democratic'
		when 'DR' then 'Demo-Rep'
		when 'F' then 'Federalist'
		when 'W' then 'Whig'
	end;
select * from PRESIDENT
where PARTY = @Party;
--k)while
declare @intFlag int
set @intFlag = 1
while (@intFlag <= 5)
begin
	print @intFlag
	set @intFlag = @intFlag + 1
end
use Northwind
while (select avg(UnitPrice) from Products) < $300
begin 
	update Products
		set UnitPrice = UnitPrice * 2
	select max(UnitPrice) from Products
	if (select max(UnitPrice) from Products) > $500
		break
	else
		continue
end
go
---STORED PROCEDURE---
go
--buatlah SP untuk menampilkan nama produk, tanggal pembelian, dan jumlah produk yang dibeli setiap customer
create procedure sp_check_penjulan_perCust (@cust varchar(100))
--declare @cust varchar(100)
--set @cust = 'Godos Cocina Típica'
as
select Products.ProductName, Orders.OrderDate, [Order Details].Quantity
from [orders]	inner join [Order Details] on Orders.OrderID = [Order Details].OrderID
				inner join Customers on Orders.CustomerID = Customers.CustomerID
				inner join Products on [Order Details].ProductID = Products.ProductID
where CompanyName like @cust
drop procedure sp_check_penjulan_perCust
exec sp_check_penjulan_perCust @cust = 'Godos Cocina Típica'
exec sp_check_penjulan_perCust @cust = 'Hanari Carnes'

--menggunakan database dan tabel yang sama
--menampilkan total pembelian perbulan untuk customer tertentu di tahun tertentu
create procedure sp_tampilkan_penjualan_perbulan (@compname nvarchar(50), @tahun int)
--declare @compname nvarchar(50)
--declare @tahun int
--set @compname = 'Alfreds Futterkiste'
--set @tahun = 1998
as
select Customers.CompanyName, year (OrderDate) Tahun, month (OrderDate) Bulan, sum([Order Details].Quantity) "TotalPembelian"
from Orders, [Order Details], Customers
where Orders.OrderID = [Order Details].OrderID
	and Orders.CustomerID = Customers.CustomerID
	and Customers.CompanyName like @compname
	and year (OrderDate) = @tahun 
group by Customers.CompanyName, year (OrderDate), month (OrderDate)
order by Customers.CompanyName

exec sp_tampilkan_penjualan_perbulan @compname = 'Alfreds Futterkiste', @tahun = 1998
go
---FUNCTION---
go
select * from [dbo].Products

--menambahkan kolom kategori produk "Murah" dan "Mahal"
create function udf_harga(@price int)
returns nvarchar(10)
as
begin
--declare @price int = 80
declare @kategori nvarchar(10)
	if (@price < 10) set @kategori = 'Murah'
	else if (@price > 50) set @kategori = 'Mahal'
	else set @kategori = 'Normal'

	return @kategori
end
--tipe scalar
select dbo.udf_harga(50) "Kategori"
select dbo.udf_harga(6) "Kategori"
select dbo.udf_harga(80) "Kategori"

--tipe table
create function udf_cust (@CompanyName nvarchar(100))
returns table
as
return (
select CustomerID, CompanyName, ContactName
from Customers
where CompanyName like @CompanyName)

select * from udf_cust ('Alfreds Futterkiste')