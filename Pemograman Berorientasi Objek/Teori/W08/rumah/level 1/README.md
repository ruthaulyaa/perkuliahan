# UTS Praktikum Level 1 dari 4 Level
Baca instruksi yang diberikan dengan baik.


## Kelas Diagram
![Image of UTS Level 1](http://api.puro.del.ac.id/v1/file/a374428e9dc7ebac9c0d8f15898778eb)
>Realisasikan kelas diagram di atas ke dalam bahasa pemrograman Java, lengkapi dengan konstruktor tanpa parameter, konstruktor dengan parameter, kopi konstruktor, serta setter dan getter. Gunakan template yang disediakan di 
**src\main\java\uts**.

>Atribut statusSewa digunakan untuk menyimpan status rumah sudah disewa atau belum. Nilai true artinya rumah sudah disewa, dan false artinya rumah belum disewa.

## Rubrik Penilaian 
1. **[Poin 10]** program dilengkapi dengan konstruktor tanpa parameter yang set data dengan nilai default sebagai berikut:
alamat="Jl. Rambutan No.1 Kota Besar, Sumatera Utara", 1 tingkat, 2 kamar tidur, 1 kamar mandi, harga sewa setahun 5 juta, dan status rumah belum disewa (false).
	
	
	> Perintah test: 
	
	
		>gradle test --tests TestRumah.testKonstruktorI

2. **[Poin 15]** program dilengkapi dengan konstruktor dengan parameter 

	
	> Perintah test: 
	
	
		>gradle test --tests TestRumah.testKonstruktorII

3. **[Poin 15]** program dilengkapi dengan kopi konstruktor
	
	
	> Perintah test: 
	
	
		> gradle test --tests TestRumah.testKopiKonstruktor

4. **[Poin 20]** Program dilengkapi dengan sekumpulan setter dan getter	
	
	> Perintah test: 
	
	
		> gradle test --tests TestRumah.testSetter

5. **[Poin 15]** Program dilengkapi dengan method hitungHargaSewa(). Method ini akan mengembalikan hasil perkalian tahun dengan biaya sewa setahun.	
	
	> Perintah test: 
	
	
		> gradle test --tests TestRumah.testHitungHargaSewa

6. **[Poin 15]** Program dilengkapi dengan method menyewa(). Method ini akan mengembalikan suatu pesan.
> Misalnya data sebuah rumah  r kondisi sudah disewa, harga sewa setahun 6000000 dan method menyewa() dipanggil dengan r.menyewa(6) maka pesan yang tampil adalah: Rumah tidak dapat disewa

> Misalnya data sebuah rumah r dengan kondisi	belum disewa, harga sewa setahun 6000000 dan method menyewa() dipanggil dengan r.menyewa(6) maka pesan yang tampil adalah: Anda bisa menyewa rumah selama 6 bulan dengan membayar 3000000.0

	
	> Perintah test: 
	
	
		> gradle test --tests TestRumah.testMenyewa

7. **[Poin 10]** program dilengkapi dengan method toString() yang akan menampilkan data di dalam objek Rumah. Perhatikan contoh keluaran yang diberikan.
![Image of output of toString()](http://api.puro.del.ac.id/v1/file/c4ca00173c907ee8f954fd30a9213412)	
	
	> Perintah test: 
	
	
		> gradle test --tests TestRumah.testToString

**Catatan Penting:**
1. Anda hanya boleh mengubah kode program yang ada di src\main\java
1. **Semua kode program yang ada di src\test\java  tidak boleh diubah sama sekali!!** Jika anda ubah (akan terlihat pada history), maka nilai anda langsung 0.
1. Jangan memindah-mindahkan file, biarkan setiap file di folder di mana file tersebut berada sebelumnya.
1. Pada beberapa template program sudah disediakan method yang tidak boleh diubah. Maka jangan anda ubah!
