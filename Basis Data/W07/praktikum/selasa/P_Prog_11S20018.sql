--exercise 1--
use Northwind
select ProductName, CategoryName, UnitPrice
from Products inner join Categories
on Products.CategoryID = Categories.CategoryID;

/*Use Case…End statement to create t-sql query to display the products’ price and category as Not
Yet Priced, Cheap Products, Medium, and Expensive. The condition for categorization is as
follows:
If certain products not priced (the value in column price is empty/null), then ‘Not
Yet Priced’.
If less than or equal 20, then ‘Widihh Murah Banget’.
If 20<price< =50, then ‘Produk Murah Aja.
If 50<price< =100, then ‘Agak Mahal nih.
If 100<price< =150, then ‘Fix Mahal!!’.
If >150 then ‘Khusus Sultan!’.*/

--use case
select ProductName, CategoryName, UnitPrice,
	case
		when UnitPrice <= 20 then 'Widihh Murah Banget'
		when UnitPrice < 20 and UnitPrice <= 50 then 'Produk Murah Aja'
		when UnitPrice < 50 and UnitPrice <= 100 then 'Agak Mahal nih'
		when UnitPrice < 100 and UnitPrice <= 150 then 'Fix Mahal!!'
		when UnitPrice > 150 then 'Khusus Sultan!'
		else 'Not Yet Priced'
	end "Price Category"
from Products inner join Categories
on Products.CategoryID = Categories.CategoryID;
go 
--exercise 2--
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
--Modify the SQL statement above using IF…Then…Else….Statement.
declare @CharTown char(1),
		@Town char(11);
set @CharTown = 'E';
	if @CharTown = 'S' set @Town= 'Stratford'
	else if @CharTown = 'I' set @Town = 'Inglewood'
	else if @CharTown = 'E' set @Town = 'Eltham'
	else if @CharTown = 'M' set @Town = 'Midhurst'
	else if @CharTown = 'D' set @Town =  'Douglas'
SELECT * FROM PLAYERS
WHERE TOWN=@Town;

/*Task -2 Use TennisDB Database. Display in text field (not in grid), the information (playerno,name,
nr_won) about the player who won more than 1 matches.*/
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
go
--exercise 3--
/*Attach the AdventureWorks database (Databases -> Right Click -> Attach -> Click Add ->
Choose location of “AdventureWorksLT2008_Data” -> Click OK -> Click OK).
Execute sql statement below: */
use AdventureWorksLT2008
Select * FROM SalesLT.Customer
--Then, find the average of ListPrice:
Select AVG(ListPrice) FROM SalesLT.Product
/*Then result are 744.5952. Consider the condition below and use while to build PL/SQL statement
for the condition. If the average ListPrice of product is less than $1000, use WHILE to :
	*doubles the ListPrice for every products and
	*If the maximum ListPrice is less than or equal to $4000, then WHILE loop restarts and
	doubles the prices again. This loop continues doubling the prices until the maximum price
	is greater than $4000, and then exits the WHILE loop and prints a message.*/
while (Select AVG(ListPrice) FROM SalesLT.Product) < $1000
	--AVG(ListPrice) < $1000 maka ListPrice*2 
begin
	update SalesLT.Product
		set ListPrice = ListPrice * 2
	select max(ListPrice) from SalesLT.Product
	if (select max(ListPrice) from SalesLT.Product) <= $4000
		--max(ListPrice) <= $4000 maka ListPrice*2 
		continue 
		/* continue: melakukan while kembali jika nilai max(ListPrice) <= $4000
		update SalesLT.Product
		set ListPrice = ListPrice * 2 
		*/
	if (select max(ListPrice) from SalesLT.Product) > $4000	
		--Jika max(ListPrice) > $4000 maka berhenti secara paksa
		break
end