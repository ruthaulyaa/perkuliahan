# Selamat!!! Anda sekarang sudah di UTS Praktikum Level 2 dari 4 Level
Baca instruksi yang diberikan dengan baik.


## Kelas Diagram
![Image of UTS Level 2](http://api.puro.del.ac.id/v1/file/42292a522f5c398707e2c7490615bca1)
>Realisasikan kelas Laptop dan kelas Prosesor yang ada pada kelas diagram di atas ke dalam bahasa pemrograman Java. Untuk masing-masing kelas lengkapi dengan konstruktor tanpa parameter, konstruktor dengan parameter, kopi konstruktor, serta setter dan getter. Gunakan template yang disediakan di 
**src\main\java\uts**.

>**Anda silahkan menggunakan (menyalin) kode program yang sudah anda hasilkan dari level 1**

>**Perhatikan bahwa, pada level 2 ini, tipe atribut prosesor adalah Prosesor.**

>**Untuk mendapatkan nilai sempurna pada level ini, konsentrasi menyesuaikan kode program kelas Laptop.java yang anda kerjakan pada level 1 sehingga semua konstruktor dan method dapat menerima atribut prosesor yang bertipe Prosesor (bukan String).**

>**Perhatikan bahwa keluaran method toString() dari kelas Laptop perlu diupdate. Silahkan cek gambar yang ada pada rubrik penilaian no. 6**


## Rubrik Penilaian 
1. **[Poin 15]** program dilengkapi dengan konstruktor tanpa parameter yang set data dengan nilai default sebagai berikut:
jenis laptop asus, ukuranLayar 14 inch, prosesornya Intel Core i7-5820K, ram 4 GB, dan harddisknya 1024 GB ( 1 TB).
	
	
	> Perintah test: 
	
	
		>gradle test --tests TestLaptop.testKonstruktorI

2. **[Poin 15]** program dilengkapi dengan konstruktor dengan parameter 

	
	> Perintah test: 
	
	
		>gradle test --tests TestLaptop.testKonstruktorII

3. **[Poin 15]** program dilengkapi dengan kopi konstruktor
	
	
	> Perintah test: 
	
	
		> gradle test --tests TestLaptop.testKopiKonstruktor

4. **[Poin 20]** Program dilengkapi dengan sekumpulan setter dan getter	
	
	> Perintah test: 
	
	
		> gradle test --tests TestLaptop.testSetter

5. **[Poin 20]** Program dilengkapi dengan method menjalankanAplikasi(). Method ini akan mengembalikan suatu pesan.
> Misalnya data sebuah laptop  r kondisi ram 6 GB dan hdd 512 GB dan method menjalankanAplikasi() dipanggil dengan r.menjalankanAplikasi("adobe premiere",6.5,100) maka pesan yang dihasilkan adalah: Spesifikasi Laptop tidak sanggup menjalankan aplikasi adobe premiere

> Misalnya data sebuah laptop  r kondisi ram 2 GB dan hdd 512 GB dan method menjalankanAplikasi() dipanggil dengan r.menjalankanAplikasi("notepad++", 0.5,0.5) maka pesan yang dihasilkan adalah: Laptop sedang menjalankan aplikasi notepad++ sisa ram:1.5 GB, sisa harddisk:511.5 GB

	
	> Perintah test: 
	
	
		> gradle test --tests TestLaptop.testMenjalankanAplikasi

6. **[Poin 15]** program dilengkapi dengan method toString() yang akan menampilkan data di dalam objek Rumah. Perhatikan contoh keluaran yang diberikan.
![Image of output of toString()](http://api.puro.del.ac.id/v1/file/b76c30c13400197388116f475d310cc8)	
	
	> Perintah test: 
	
	
		> gradle test --tests TestLaptop.testToString

**Catatan Penting:**
1. Anda hanya boleh mengubah kode program yang ada di src\main\java
1. **Semua kode program yang ada di src\test\java  tidak boleh diubah sama sekali!!** Jika anda ubah (akan terlihat pada history), maka nilai anda langsung 0.
1. Jangan memindah-mindahkan file, biarkan setiap file di folder di mana file tersebut berada sebelumnya.
1. Pada beberapa template program sudah disediakan method yang tidak boleh diubah. Maka jangan anda ubah!
