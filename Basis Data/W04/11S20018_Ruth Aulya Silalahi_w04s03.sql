CREATE DATABASE ENTERPRISE_11S20018
GO
USE ENTERPRISE_11S20018
GO --1
CREATE TABLE DEPARTEMENT
(DEPT_ID		INT			NOT NULL,
DEPT_NAME		VARCHAR(20)	NOT NULL,
DEPT_LOCATION	VARCHAR(15)	NOT NULL,
PRIMARY KEY (DEPT_ID));
GO
CREATE TABLE EMPLOYEES
(EMP_ID		INT				NOT NULL,
DEPT_ID		INT				NOT NULL,
EMP_NAME	VARCHAR(15)		NOT NULL,
JOB_NAME	VARCHAR(10)		NOT NULL,
MANAGER_ID	INT						,
HIRE_DATE	DATE			NOT NULL,
SALARY		DECIMAL(10,2)	NOT NULL,
COMMISSION	DECIMAL(7,2)			,
PRIMARY KEY (EMP_ID),
FOREIGN KEY (DEPT_ID)
	REFERENCES DEPARTEMENT (DEPT_ID));
GO
CREATE TABLE SALARY_GRADE
(GRADE		INT		NOT NULL,
MIN_SAL		INT		NOT NULL,
MAX_SAL		INT		NOT NULL,
PRIMARY KEY	(GRADE));
GO --2
INSERT INTO DEPARTEMENT (DEPT_ID,DEPT_NAME,DEPT_LOCATION) 
	VALUES	(1001, 'FINANCE', 'SYDNEY'),
			(2001, 'AUDIT', 'MELBOURNE'),
			(3001, 'MARKETING', 'PERTH'),
			(4001, 'PRODUCTION', 'BRISBANE');
SELECT * FROM DEPARTEMENT
GO
INSERT INTO EMPLOYEES (EMP_ID,DEPT_ID,EMP_NAME,JOB_NAME,MANAGER_ID,HIRE_DATE,SALARY,COMMISSION)
	VALUES	(68319, 1001, 'KAYLING', 'PRESIDENT', NULL, '1991-11-18', 6000.00, NULL),
			(69324, 1001, 'MARKER', 'CLERK', 67832, '1992-01-23', 1400.00, NULL),
			(67832, 1001, 'CLARE', 'MANAGER', 68319, '1991-06-09', 2550.00, NULL),
			(65646, 2001, 'JONAS', 'MANAGER', 68319, '1991-04-02', 2957.00, NULL),
			(64989, 3001, 'ADELYN', 'SALESMAN', 66928, '1991-02-20', 1700.00, 400.00),
			(65271, 3001, 'WADE', 'SALESMAN', 66928, '1991-02-22', 1350.00, 600.00),
			(67858, 2001, 'SCARLET', 'ANALYST', 65646, '1997-04-19', 3100.00, NULL);
SELECT * FROM EMPLOYEES
GO
INSERT INTO SALARY_GRADE (GRADE,MIN_SAL,MAX_SAL)
	VALUES	(1, 800, 1300),
			(2, 1301, 1500),
			(3, 1501, 2100),
			(4, 2101, 3100),
			(5, 3101, 9999);
SELECT * FROM SALARY_GRADE
GO --3
INSERT INTO EMPLOYEES (EMP_ID,DEPT_ID,EMP_NAME,JOB_NAME,MANAGER_ID,HIRE_DATE,SALARY,COMMISSION)
	VALUES (68454, 3001, 'TUCKER', 'SALESMAN', 66928, '1991-09-08', 1600.00, NULL);
SELECT * FROM EMPLOYEES
GO --4
UPDATE EMPLOYEES
SET MANAGER_ID = 67832
WHERE EMP_ID = 68319;
SELECT * FROM EMPLOYEES
GO --5
UPDATE DEPARTEMENT
SET DEPT_LOCATION = 'AUCKLAND'
WHERE DEPT_ID= 4001;
SELECT * FROM DEPARTEMENT
GO --6
DELETE FROM EMPLOYEES WHERE MANAGER_ID = 68319;
SELECT * FROM EMPLOYEES
GO --7
ALTER TABLE EMPLOYEES 
	ADD STATUS VARCHAR(10);
	--AFTER COMMISSION;
SELECT * FROM EMPLOYEES
GO
--8
ALTER TABLE EMPLOYEES
	DROP COLUMN STATUS;
SELECT * FROM EMPLOYEES
GO --9
SELECT EMP_NAME, SALARY
FROM EMPLOYEES;
GO --10
SELECT DEPT_ID, JOB_NAME
FROM EMPLOYEES;
GO --11
UPDATE SALARY_GRADE
SET MIN_SAL = 3102, MAX_SAL = 9000
WHERE GRADE = 5;
SELECT * FROM SALARY_GRADE
GO --12
SELECT * FROM EMPLOYEES
WHERE DEPT_ID = 3001;