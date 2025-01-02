use Northwind
go
--exercise 1--
/*Create a simple procedure with a simple select to create a
stored procedure to list in alphabetic order the names of company
who has name have an ‘a’ as second character. */
/*select Customers.CompanyName, Suppliers.CompanyName, Shippers.CompanyName
from Customers, Suppliers, Shippers
where Customers.CompanyName like '_a%' or Suppliers.CompanyName like '_a%' or Shippers.CompanyName like '_a%'
order by Customers.CompanyName asc;*/
create procedure sp_cust_comp
as
select CompanyName
from Customers
where CompanyName like '_a%'
order by CompanyName asc;
drop procedure sp_cust_comp;
exec sp_cust_comp;
--------------------------
create procedure sp_supp_comp
as
select CompanyName
from Suppliers
where CompanyName like '_a%'
order by CompanyName asc;
drop procedure sp_supp_comp;
exec sp_supp_comp;
---------------------------
create procedure sp_ship_comp
as
select CompanyName
from Shippers
where CompanyName like '_a%'
order by CompanyName asc;
drop procedure sp_ship_comp;
exec sp_ship_comp;
go
--exercise 2--
/* Create a simple procedure with a complex select A. Create
a stored procedure to list all company data (name, birth_date, and
total number of their won). Order by name ascending order and
secondly by birth_date.*/
use tennisdb
create procedure sp_name_won
as
select NAME, BIRTH_DATE, count(*) "nr_won" 
from PLAYERS inner join MATCHES 
on PLAYERS.PLAYERNO=MATCHES.PLAYERNO
group by NAME, BIRTH_DATE
order by NAME, BIRTH_DATE asc;

drop procedure sp_name_won;
exec sp_name_won;
go
--exercise 3--
/*Create a stored procedure to list Employee data
(EmployeeID, Title, Employee Name (first name + last name),
Age(current date-birthdate)). */
use Northwind
create procedure sp_Employee
as
select EmployeeID, Title, (FirstName+' '+LastName) "Employee Name", (2021-year(BirthDate)) "Age" 
from Employees;

drop procedure sp_Employee;
exec sp_Employee;
go 
--exercise 4--
/*: Create a stored procedure to list all Orders data (OrderId,
CustomerId, ProductId, TotalPrice, ContactName) from a specific
customer. Total price is a sum of (Unit Price * Quantity) for all product
in specific order. Use customer contact name as procedure paramater
with default value is null. If procedure parameter is null then display
all Orders data.*/
use Northwind
select OrderID, CustomerID, ProductID, sum(UnitPrice*Quantity) "TotalPrice", ContactName
	from [Order Details], Customers
	group by OrderID, CustomerID, ProductID, ContactName
---create procedure---
create procedure sp_pesanan (@contname nvarchar(50) = null) --default value is null
as
---vaidasi parameter---
if @contname is null
begin 
	select distinct OrderID, CustomerID, sum(UnitPrice*Quantity) "TotalPrice", ContactName
	from [Order Details], Customers
	group by OrderID, CustomerID, ContactName
	return
end
select distinct OrderID, CustomerID, sum(UnitPrice*Quantity) "TotalPrice", ContactName
from [Order Details], Customers
where ContactName like @contname
group by OrderID, CustomerID, ContactName
return

drop procedure sp_pesanan;
exec sp_pesanan @contname = 'Maria Anders';