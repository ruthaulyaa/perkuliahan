CREATE TABLE FAKULTAS
(Kode_Unik VARCHAR(10) NOT NULL primary key,
dekan		varchar(60)	not null);
--drop table fakultas
select * from fakultas

CREATE TABLE DOSEN
(NIDN				VARCHAR(10)		NOT NULL,
Nama				VARCHAR(60)		NOT NULL,
Jenis_Kelamin		CHAR(1)			NOT NULL,
Umur				int				not null,
Skor_Kredit			INT				NOT NULL,
Kode_Unik			VARCHAR(10)		NOT NULL,
Program_Studi		VARCHAR(4)		NOT NULL,
Jabatan_Kerja		VARCHAR(15)		NOT NULL,
Status_Aktivitas	VARCHAR(12)		NOT NULL,
Pengalaman_Kerja	VARCHAR(20)		,
PRIMARY KEY (NIDN),
FOREIGN KEY (Kode_Unik)
	REFERENCES FAKULTAS (Kode_Unik));
--drop table dosen
select * from dosen

create table STATUS_KEAKTIFAN
(Status_Aktivitas	varchar(12)	not null,
Umur	int	not null,
Jabatan	varchar(15)) primary key;
--drop table status_keaktifan

create table SK_KEPANGKATAN
(NIDN	VARCHAR(10)		NOT NULL primary key,
Nama	VARCHAR(60)		NOT NULL,
Skor_Kredit int	not null,
Unit_Kerja	varchar(4)	not null,
Jabatan_Kerja		VARCHAR(15)		NOT NULL,
Penelitian_flag	char(1),	
Pengabdian_Masyarakat_flag char(1),
Pendidikan_flag char(1),
Tanggal_Jabatan date,
foreign key (NIDN)
 	references dosen (NIDN));
--drop table sk_kepangkatan
select * from SK_KEPANGKATAN

create table angka_kredit
(Komponen kegiatan varchar(100),
Bukti_kegiatan varchar(100),
Batas_maksimal_diakui varchar(50),
Angka_kredit int);

create table Tridharma_Perguruan_Tinggi
(NIDN	VARCHAR(10)	NOT NULL,
Penelitian	varchar(200),	
Pengabdian_Masyarakat varchar(50),
Pendidikan varchar(50),
foreign key (NIDN)
	references SK_Kepangkatan (NIDN));
--drop table tridharma_perguruan_tinggi
select * from Tridharma_Perguruan_Tinggi

create table Jabatan_Fungsional
(Angka_Kredit_Minimal int not null,
Kualifikasi_Pendidikan	varchar(30),
Jabatan varchar(20)	primary key);
--drop table Jabatan_Fungsional
select * from Jabatan_Fungsional

create table FITE
(Kode_Unik VARCHAR(10) NOT NULL,
Kaprodi varchar(60) not null,
Program_Studi varchar(15)	not null,
Profil_Lulusan	varchar(200),
Jumlah_mahasiswa int,
foreign key (Kode_Unik)
	references Fakultas (kode_unik));
--drop table fite
select * from fite

create table Fakultas_Bioteknologi
(Kode_Unik VARCHAR(10) NOT NULL,
Kaprodi varchar(60) not null,
Program_Studi varchar(15)	not null,
Profil_Lulusan	varchar(200),
jumlah_mahasiswa int,
foreign key (Kode_Unik)
	references Fakultas (kode_unik));
--drop table Fakultas_Bioteknologi
select * from Fakultas_Bioteknologi

create table Fakultas_Teknik_Industri
(Kode_Unik VARCHAR(10) NOT NULL,
Kaprodi varchar(60) not null,
Program_Studi varchar(15)	not null,
Profil_Lulusan	varchar(200),
Jumlah_mahasiswa	int,
foreign key (Kode_Unik)
	references Fakultas (kode_unik));
--drop table Fakultas_Teknik_Industri
select * from Fakultas_Teknik_Industri

create table Jenjang_Pangkat
(Jabatan varchar(20) not null primary key,
Angka_Kredit_Minimal int not null,
Golongan varchar(25)	not null,
foreign key (jabatan)
	references jabatan_fungsional (jabatan));
-- drop table Jenjang_Pangkat
select * from jenjang_pangkat

create table Kepengurusan
(NIDN	VARCHAR(10)	NOT NULL,
Angka_Kredit int not null,
Jabatan varchar(20) not null,
Publikasi varchar(200),
Riwayat_pendidikan varchar(50),
Riwayat_pengajaran varchar(50),
Tanggal_pengajuan date,
foreign key (NIDN)
	references Dosen (NIDN),
foreign key (Jabatan)
	references Jabatan_fungsional (Jabatan),
foreign key (NIDN)
	references sk_kepangkatan (NIDN));
select * from kepengurusan

insert into fakultas (kode_unik, dekan)
	values	('FITE', 'AA'),
			('FTB', 'BB'),
			('FTI', 'CC');
select * from FAKULTAS

insert into dosen (NIDN, Nama, Jenis_kelamin, Umur, skor_kredit, kode_unik, program_studi, jabatan_kerja, status_aktivitas, Pengalaman_Kerja)
	values	('0112039001', 'Dr. Fitriani Tupa Ronauli Silalahi, S.Si, M.Si', 'P', 32, 205, 'FITE', 'TRPL', 'Asisten Ahli', 'Aktif', ''),
			('0927028002', 'Arie Satia Dharma, S.T, M.Kom.', 'L', 34, 213, 'FITE', 'IF', 'Lektor', 'Aktif', ''),
			('0117027901', 'Dr. Arlinta Christy Barus, ST., M.InfoTech.', 'P', 42, 350,'FITE', 'IF', 'Lektor Kepala', 'Aktif', ''),
			('0124108201', 'Rosni Lumbantoruan, Ph.D.', 'P', 35, 250, 'FITE', 'SI', 'Lektor', 'Aktif', ''),
			('0108037605', 'Tiurma Lumban Gaol, SP., M.P', 'P', 48, 176, 'FITE', 'TI', 'Asisten Ahli', 'Aktif', '');
select * from dosen

insert into status_keaktifan (status_aktivitas, umur, jabatan)
	values	('Pensiun', 65, 'Asisten Ahli'),
			('Pensiun', 65, 'Lektor'),
			('Pensiun', 65, 'Lektor Kepala'),
			('Pensiun', 70, 'Guru Besar');
--drop table status_keaktifan
select * from STATUS_KEAKTIFAN

insert into SK_KEPANGKATAN (NIDN, Nama, Skor_Kredit, Unit_Kerja, Jabatan_Kerja, Penelitian_flag, Pengabdian_Masyarakat_flag, pendidikan_flag)
	values	('0112039001', 'Dr. Fitriani Tupa Ronauli Silalahi, S.Si, M.Si', 205, 'FITE', 'Asisten Ahli', '1', '1', '1'),
			('0927028002', 'Arie Satia Dharma, S.T, M.Kom.', 213, 'FITE', 'Lektor', '1', '1', '1'),
			('0117027901', 'Dr. Arlinta Christy Barus, ST., M.InfoTech.', 350, 'FITE', 'Lektor Kepala', '1', '1', '1'),
			('0124108201', 'Rosni Lumbantoruan, Ph.D.', 250, 'FITE', 'Lektor', '1', '1', '1'),
			('0108037605', 'Tiurma Lumban Gaol, SP., M.P', 176, 'FITE', 'Asisten Ahli', '1', '1', '1');
select * from SK_KEPANGKATAN			

insert into Tridharma_Perguruan_Tinggi (NIDN, Penelitian, Pengabdian_Masyarakat, Pendidikan)
	values	('0112039001', 'Numerical solution of Laplace equation for ship problem in the sea using finite difference method', 'laporan AA', 'Institut Teknologi Bandung'),
			('0927028002', 'Analisis Algoritma Approximate String Matching pada Fitur Autocorrect dalam Pencarian Data, Seminar Nasional Teknologi Informasi dan Komunikasi di Daerah Rural (SNaTIKRa) 2017, 22 November 2017', 'Laporan CC', 'Universitas Sumatera Utara'),
			('0117027901', 'STUDI PERBANDINGAN ALAT PENGUJIAN OTOMATIS UNTUK APLIKASI ANDROID', 'Laporan DD', 'University of Wollongong and Communication'),
			('0124108201', 'Formative Assessment and Learning Analytics Diploma Program', 'Laporan EE', ' University of Applied Sciences'),
			('0108037605', 'Pustakawan Tangguh pada Era Digital, Prosiding  Peranan Jejaring Perpustakaan dalam Meningkatkan Kompetensi Perpustakaan, FPPTI Jatim', 'Laporan FF', 'Insitut Teknologi Bogor');
select * from Tridharma_Perguruan_Tinggi
	
insert into jabatan_fungsional (Angka_kredit_minimal, Kualifikasi_Pendidikan, Jabatan)
	values	(150, 'memiliki ijazah s2', 'Asisten Ahli'),
			(200, 'jurnal terpublikasi', 'Lektor'),
			(400, 'publikasi jurnal iternasional', 'Lektor Kepala'),
			(850, 'memperoleh ijazah S3', 'Guru Besar');
select * from Jabatan_Fungsional
			
insert into FITE (kode_unik, kaprodi, program_studi, profil_lulusan, Jumlah_mahasiswa)
	values	('FITE', 'DD', 'IF', 'Full Stack Developer, User Interface Designer', 245),
			('FITE', 'RR', 'SI', 'IT Manager, IT Auditor', 250),
			('FITE', 'FF', 'TE', 'Tenaga profesional Teknik Kendali dan Internasional', 157),
			('FITE', 'GG', 'TRPL', 'Software Developer, IT researcher', 410),
			('FITE', 'YY', 'TK', '', 232),
			('FITE', 'HH', 'TI', 'Programmer, Pengelola Data, & Software QA', 224);
select * from FITE

insert into Fakultas_Bioteknologi (kode_unik, kaprodi, program_studi, profil_lulusan, jumlah_mahasiswa)
	values ('FTB', 'JJ', 'TB', '', 167);
select * from Fakultas_Bioteknologi

insert into Fakultas_Teknik_Industri (kode_unik, kaprodi, program_studi, profil_lulusan, jumlah_mahasiswa)
	values ('FTI', 'LL', 'MR', 'Market Engineer', 243);
select * from Fakultas_Teknik_Industri

insert into jenjang_pangkat (Jabatan, Angka_kredit_minimal, golongan)
	values	('Asisten Ahli', 150, 'Penata Muda Tk. I, III/b'),
			('Lektor', 200, 'Penata, III/c'),
			('Lektor', 300, 'Penata Tk. I, III/d'),
			('Lektor Kepala', 400, 'Pembina, IV/a'),
			('Lektor kepala', 550, 'Pembina Tk. I, IV/b'),
			('Lektor Kepala', 700, 'Pembina Utama Muda, IV/c'),
			('Guru Besar', 850, 'Pembina Utama Madya, IV/d'),
			('Guru Besar', 1050, 'Pembina Utama, IV/e');
		
insert into kepengurusan (NIDN, Angka_Kredit, Jabatan, Publikasi, Riwayat_Pendidikan, Riwayat_Pengajaran)
	values	('0112039001', 205, 'Asisten Ahli', 'Numerical solution of Laplace equation for ship problem in the sea using finite difference method', 'Institut Teknologi Bandung', 'Lecturer Berpikir Sistem'),
			('0927028002', 213, 'Lektor', 'Analisis Algoritma Approximate String Matching pada Fitur Autocorrect dalam Pencarian Data, Seminar Nasional Teknologi Informasi dan Komunikasi di Daerah Rural (SNaTIKRa) 2017, 22 November 2017', 'Universitas Sumatera Utara', 'Koodinator Kecerdasan Buatan'),
			('0117027901', 350, 'Lektor Kepala', 'STUDI PERBANDINGAN ALAT PENGUJIAN OTOMATIS UNTUK APLIKASI ANDROID', 'University of Wollongong and Communication', 'Koodinator Rekayasa Perangkat Lunak'),
			('0124108201', 250, 'Lektor', 'Formative Assessment and Learning Analytics Diploma Program', 'University of Applied Sciences', 'Lecturer Basis Data'),
			('0108037605', 176, 'Asisten Ahli', 'Pustakawan Tangguh pada Era Digital, Prosiding  Peranan Jejaring Perpustakaan dalam Meningkatkan Kompetensi Perpustakaan, FPPTI Jatim', 'Insitut Teknologi Bogor', 'Lecturer inovasi Digital');

select * from kepengurusan
--update
update fakultas set dekan = 'mm' where kode_unik = 'Fite';

update fakultas_teknik_industri set jumlah_mahasiswa = 334 where program_studi = 'mr';

update kepengurusan set publikasi = null where nidn = '0108037605';

update status_keaktifan set pengabdian_masyarakat = 'Laporan GG' where nidn = '0124108201';

update dosen set kode_unik = 'FTI', program_studi = 'MR' where nidn = '0112039001';

--select
select nama, penelitian
from dosen as a inner join tridhrma_perguruan_tinggi as b on a.nidn = b.nidn;

select nama, umur, status_aktivitas
from dosen;

select * from dosen
order by nama asc; 

select nama "Dosen FITE", program_studi, sum(jumlah_mahasiswa) "Jumlah_mahasiswa"
from fite inner join dosen
on fite.kode_unik = dosen.kode_unik;

select nidn
from dosen
where nama like '_r%';


--nested Subqueries
select nama, jabatan_kerja
from dosen
where skor_kredit not in(between 200 and 300);

select * from kepengurusan
where jabatan in ('lektor');

select golongan, nidn
from dosen cross join dosen
where angka_kredit > 150;


 select nama, dekan, program_studi
from fakultas inner as a join dosen as b
on a.kode_unik = b.kode_unik;

select count(kode_unik)
from Dosen
where nidn in (select nidn from Tridharma_perguruan_tinggi where riwayat_pendidikan like 'i%');


--procedure
Create OR REPLACE PROCEDURE AddDosen  (
NIDN				VARCHAR(10)		,
Nama				VARCHAR(60)		,
Jenis_Kelamin		CHAR(1)			,
Umur				int				,
	Skor_Kredit			INT				,
	Kode_Unik			VARCHAR(10)		,
	Program_Studi		VARCHAR(4)		,
	Jabatan_Kerja		VARCHAR(15)		,
	Status_Aktivitas	VARCHAR(12)		,
	Pengalaman_Kerja	VARCHAR(20)		
	)
	LANGUAGE plpgsql AS $$
	BEGIN
	INSERT INTO Dosen   (NIDN, Nama, Jenis_kelamin, Umur, skor_kredit, kode_unik, program_studi, jabatan_kerja, status_aktivitas, Pengalaman_Kerja ) 
		Values (NIDN, Nama, Jenis_kelamin, Umur, skor_kredit, kode_unik, program_studi, jabatan_kerja, status_aktivitas, Pengalaman_Kerja ) ;
COMMIT ;
END ;
$$;	
CALL AddDosen('0112039011', 'Dr. Satria Armando Pakpahan, S.Si, M.Si', 'L', 32, 205, 'FITE', 'TRPL', 'Asisten Ahli', 'Aktif', '');

CREATE PROCEDURE Deletedosen (Varchar )
language 'plpgsql'
AS
$$
BEGIN
DELETE FROM Dosen  
WHERE NIDN = $1;
COMMIT;
END;
$$;
Drop  PROCEDURE Deletedosen
Call Deletedosen('0112039011');
Select *from Dosen

--function
CREATE FUNCTION jumlahMahasiswa (Kode varchar  )
RETURNS TABLE ( prodi VARCHAR(25), Jumlah_mahasiswa int )
language 'plpgsql'
AS
$$
BEGIN
	RETURN QUERY
	(SELECT FITE.program_studi, FITE.Jumlah_mahasiswa FROM FITE
	WHERE kaprodi LIKE Kode);
END $$
Drop FUNCTION jumlahMahasiswa
Select *from jumlahMahasiswa ( 'GG');

CREATE FUNCTION jabatanDosen (Skor int  )
RETURNS TABLE ( Nama VARCHAR(25) , Jabatan_Kerja VARCHAR (25) )
language 'plpgsql'
AS
$$
BEGIN
	RETURN QUERY
	(SELECT Dosen.Nama, Dosen.Jabatan_kerja FROM Dosen
	WHERE skor_Kredit between 200 and Skor);
END $$
Drop FUNCTION jabatanDosen
Select *from jabatanDosen ( 300);