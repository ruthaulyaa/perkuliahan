go 
--LATIHAN SQL PROGRAMMING--
go
use Northwind
go --exercise 1--
select ProductName, CategoryName, UnitPrice
from Products inner join Categories
on Products. CategoryID=Categories. CategoryID;

select ProductName, CategoryName, UnitPrice,
case 
	when UnitPrice <= 20 then 'Widihh Murah Banget'
	when UnitPrice > 20 and UnitPrice <= 50 then 'Produk Murah Aja'
	when UnitPrice > 50 and UnitPrice <= 100 then 'Agak Mahal nih'
	when UnitPrice > 100 and UnitPrice <= 150 then 'Fix Mahal!!'
	when UnitPrice > 150 then 'Khusus Sultan'
	else 'Not Yet Priced'
end as [Price Category]
from Products inner join Categories
on Products. CategoryID=Categories. CategoryID;
go --exercise 2--
use TennisDB
DECLARE @CharTown Char(1),
@Town Char(11);
SET @CharTown = 'E' ;
SET @Town =
CASE @CharTown
WHEN 'S' THEN 'Stratford'
WHEN 'I' THEN 'Inglewood'
WHEN 'E' THEN 'Eltham'
WHEN 'M' THEN 'Midhurst'
WHEN 'D' THEN 'Douglas' 
END;

SELECT * FROM PLAYERS
WHERE TOWN=@Town;

declare @CharTown char(1),
@Town char(11);
set @CharTown = 'E' ;
if @CharTown = 'S' set @Town= 'Stratford'
else if @CharTown = 'I' set @Town= 'Inglewood'
else if @CharTown = 'E' set @Town= 'Eltham'
else if @CharTown = 'M' set @Town= 'Midhurst'
else if @CharTown = 'D' set @Town= 'Douglas'

SELECT * FROM PLAYERS
WHERE TOWN=@Town;

select PLAYERS.PLAYERNO, PLAYERS.NAME, count(*) "nr_won"
from PLAYERS, MATCHES
where PLAYERS.PLAYERNO=MATCHES.PLAYERNO
group by PLAYERS.PLAYERNO, PLAYERS.NAME
having count(*)>1
-----------ubah ke not in grid-----------
declare @p_id char(11)
declare @pno char(30), @pname char(30), @nrwon char (30)
set rowcount 0
select PLAYERS.PLAYERNO, PLAYERS.NAME, count(*) "nr_won" into #mytemp
from PLAYERS, MATCHES
where PLAYERS.PLAYERNO=MATCHES.PLAYERNO
group by PLAYERS.PLAYERNO, PLAYERS.NAME
having count(*)>1

set rowcount 1
select @p_id = PLAYERNO from #mytemp

while @@ROWCOUNT <> 0
begin 
	set rowcount 0
	select @pno = PLAYERNO, @pname = NAME, @nrwon = nr_won
	from  #mytemp 
	where PLAYERNO = @p_id

	print 'Player No:' + @pno + ' Name: ' + @pname + ' nrwon: ' + @nrwon
	delete #mytemp
	where PLAYERNO = @p_id

	set rowcount 1
	select @p_id = PLAYERNO
	from #mytemp
end
drop table #mytemp
go --exercise 3--
go 
--LATIHAN STORED PROCEDURE--
go
--LATIHAN FUNCTION--
go
use tempdb
create table Product(
Prod_nr	int	not null
constraint pk_product primary key (prod_nr),
Name varchar(30) not null,
Price money not null,
Type varchar(30) not null)
drop table Product

insert Product (prod_nr, name, price, type)
	values	(1, 'tv', 500, 'electronics')
insert Product (prod_nr, name, price, type)
	values (2, 'radio', 100, 'electronics')
insert Product (prod_nr, name, price, type)
	values (3, 'ball', 100, 'sports')
insert Product (prod_nr, name, price, type)
	values (4, 'racket', 200, 'sports')
select * from Product
go --exercise 1--
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

select dbo.fn_stok('tv') "product"
select dbo.fn_stok('book') "product"
go --exercise 2--
select avg(price) "AVG_PRICE"
from Product
where type = 'sports'
--create function--
create function fng_avg_price_sport (@avg int)
returns char(50)
as begin
declare @out char(50), @rata int;
set @rata = avg(price);
if @rata < 400 set @out = 'The average price of sports products is less than 400'
else if @rata = 150 set @out = 'The average price of sports products is equal 150'
else if @rata > 100 set @out = 'The average price of sports products is greater than 100'
/*select avg(price),
case
	when (avg(price) < 400) then 'The average price of sports products is less than 400'
	when (avg(price) = 150) then 'The average price of sports products is equal 150'
	when (avg(price) > 100) then 'The average price of sports products is greater than 100'
end
from product*/
end

drop function fng_avg_price_sport

select dbo.fng_avg_price_sport (100)
select dbo.fng_avg_price_sport (150)
select dbo.fng_avg_price_sport (400)
go --exercise 3--
