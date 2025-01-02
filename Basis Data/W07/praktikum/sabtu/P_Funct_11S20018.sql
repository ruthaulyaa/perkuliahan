use tempdb
create table Product(
Prod_nr	int	not null
constraint pk_product primary key (prod_nr),
Name varchar(30) not null,
Price money not null,
Type varchar(30) not null)
--drop table Product

insert Product (prod_nr, name, price, type)
	values	(1, 'tv', 500, 'electronics')
insert Product (prod_nr, name, price, type)
	values (2, 'radio', 100, 'electronics')
insert Product (prod_nr, name, price, type)
	values (3, 'ball', 100, 'sports')
insert Product (prod_nr, name, price, type)
	values (4, 'racket', 200, 'sports')
select * from Product
go 
--exercise 1--
/*
Create a function with an input parameter the name of the product. Based on this input,
the function should return or print a message like this: ‘There are (the name of the
product) in stock’ or ‘There are no (the name of the product) in stock’. 
*/
create function fn_stok (@prod char(30))
returns char(50)
as begin
declare @out char(50)
if exists(select prod_nr from Product where name=@prod)
begin
	set @out= 'There are ' + @prod + 's in stock'
end
else
begin
	set @out= 'There are NO ' +@prod + 's in stock'
end
return @out
end
--drop function fn_stok
select dbo.fn_stok('tv') "product"
select dbo.fn_stok('book') "product"
go 
--exercise 2--
/*
Create a function with a numeric input parameter. Based on this input, the function should
return or print a message like this: ‘the average price of sport products is greater or equal
or less than (the value of the input)’ when that is the case in the database.
*/
select avg(price) "AVG_PRICE"
from Product
where type = 'sports';
-----------------------
create function fng_avg_price_sport (@price int)
returns nvarchar(50)
as 
begin
declare @out nvarchar(50)
if (@price >= 100 and @price < 150)
begin
	set @out = 'The average price of sports product is greater than 100'
end
else if (@price = 150)
begin 
	set @out = 'The average price of sports products is equal 150'
end
else if (@price > 150 and @price <= 400)
begin
	set @out = 'The average price of sports products is less than 400'
end
return @out
end
--drop function fng_avg_price_sport
select [dbo].[fng_avg_price_sport] (100);
select [dbo].[fng_avg_price_sport] (150);
select [dbo].[fng_avg_price_sport] (400);
go 
--exercise 3--
declare @rata int
select @rata = avg(price) from Product
where type = 'sports'
select @rata
while (@rata<500)
begin
	select 'looping 1 average awal=' + cast(@rata as char(3))
	update Product
	set Price = Price + Price * 0.1 

	select @rata = avg(price) from Product
	where type = 'sports'
	select 'menjadi ' + cast(@rata as char(3))
end

select * from Product
--------function------------
create function fnupdt()
returns @Product table	(Prod_nr	int,
						Name varchar(30),
						Price money,
						Type varchar(30)) 
as 
begin
declare @rata int
select @rata = avg(price) from Product
where Type = 'sport'
while (@rata<500)
begin
	--select 'looping 1 average awal=' + cast(@rata as char(3))
	update Product
		set Price = Price + Price * 0.1 
	select @rata = avg(price) from Product
	--select 'menjadi' + cast(@rata as char(3))
end
return
end
select * from fnupdt
go
--exercise 4--
/*
Create a function CheckModulo11, that checks if a given accountNr is a valid number.
Ex. 972428577 is valid, because:
9*9+8*7+7*2+6*4+5*2+4*8+3*5+2*7+1*7)%11 =0 Use this function in a check
clause in a table with a column that represents an accountNr.
You need to create a table to store the accountNr by adding
constraint and try to insert data into this table.
*/
create function CheckModulo11 (@accountNr int)
returns @Modulo11 table(
    number_mod int,
    number int,
    total int,
    status char(9)
)
as
begin

	declare @Table table(number_mod int,
						 number int,
						 total int,
						 status char(9))

	declare @panjang int, @nomor int = 1, @nilai int, @total int = 0, @changeNums char(10);
    set @changeNums = convert(char(10), @accountNr);
    set @panjang = len(@changeNums);
    while @panjang > 0
    begin
        set @nilai = convert(int,substring(@changeNums, @nomor, 1))
        insert into @Table
        (number_mod, number, total, status) values
        (@nomor, @nilai, (@nomor * @nilai), '-');
        set @total = @total + (@nomor * @nilai);
        set @panjang = @panjang - 1;
        set @nomor = @nomor + 1; 
    end

    if @total % 11 = 0
        insert into @Table (number_mod, number, total, status) values ('', '', @total, 'valid');
    else
        insert into @Table (number_mod, number, total, status) values ('', '', @total, 'not valid');

insert into @Modulo11
select * from @Table
return
end

select * from dbo.CheckModulo11 (972428577)
go
--exercise 5--
create function fnTableSundays(@dateFrom datetime, @dateTo datetime)
returns @tblSunday table(nummer smallint, date datetime)
as begin
declare @num as int
declare @day_num as int
declare @day as datetime
set @num = 1; set @day = @dateFrom
while (@day <= @dateTo)
begin 
	select @day_num = DATEPART(DW, @day)
	if @day_num = 1
	begin 
		insert @tblSunday(nummer, date)
		values (@num, @day)
		set @num = @num + 1
	end
	set @day = DATEADD(DAY, 1, @day)
end
return
end
--drop function dbo.fnTableSundays
select * from dbo.fnTableSundays('2008-03-08', '2008-05-09');