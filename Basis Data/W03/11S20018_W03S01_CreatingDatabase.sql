CREATE DATABASE PresDB
ON
	PRIMARY
		(NAME = PresidentDBPrimary,
		FILENAME = 'D:\IT Del\Perkuliahan\semester 3\basis data\week 3\21-22\SQL\PresDB.mdf',
		SIZE=10MB,
		MAXSIZE=20MB,
		FILEGROWTH=20%),
		 (NAME = PresidentDBSecondary,
		FILENAME = 'D:\IT Del\Perkuliahan\semester 3\basis data\week 3\21-22\SQL\PresDB.ndf',
		SIZE=5MB,
		MAXSIZE=10MB,
		FILEGROWTH=20%)
	LOG ON
		(NAME = PresidenDBLog,
		FILENAME = 'D:\IT Del\Perkuliahan\semester 3\basis data\week 3\21-22\SQL\PresDB.ldf',
		SIZE=30MB,
		MAXSIZE=50MB,
		FILEGROWTH=20%)
GO
USE PresDB
GO
ALTER DATABASE PresDB 
	MODIFY FILE 
	(NAME = PresidenDBLog,
	MAXSIZE=60MB)
GO
ALTER DATABASE PresDB
	MODIFY FILE
	(NAME = PresidenDBLog,
	MAXSIZE=50MB)
GO
ALTER DATABASE PresDB
	ADD FILE
	(NAME = PresidentDBSecondary2,
	FILENAME = 'D:\IT Del\Perkuliahan\semester 3\basis data\week 3\21-22\SQL\PresDB2.ndf',
	SIZE=5MB,
	MAXSIZE=10MB,
	FILEGROWTH=20%)
GO
ALTER DATABASE PresDB
	ADD FILEGROUP PresidentGroup;
GO
ALTER DATABASE PresDB
	ADD FILE
	(NAME = PresDB_1,
	FILENAME = 'D:\IT Del\Perkuliahan\semester 3\basis data\week 3\21-22\SQL\PresDB_1.ndf',
	SIZE=5MB,
	MAXSIZE=10MB,
	FILEGROWTH=1MB),
	(NAME = PresDB_2,
	FILENAME = 'D:\IT Del\Perkuliahan\semester 3\basis data\week 3\21-22\SQL\PresDB_2.ndf',
	SIZE=5MB,
	MAXSIZE=10MB,
	FILEGROWTH=1MB)
	TO FILEGROUP PresidentGroup
GO
ALTER DATABASE PresDB 
	REMOVE FILE PresDB_2