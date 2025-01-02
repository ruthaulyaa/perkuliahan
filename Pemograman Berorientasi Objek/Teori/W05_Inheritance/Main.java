//Main.java
public class Main{
	public static void main(String[] args){
		
		//objek Anjing
		System.out.println("Binatang Anjing");
		Anjing anjing = new Anjing ("Miki", "Siberian Husky", 4, 6);
		anjing.makan();
		anjing.bersuara();
		anjing.bergerak();
		anjing.usia();
		System.out.println();
		
		//objek Kucing
		System.out.println("Binatang Kucing");
		Kucing kucing = new Kucing ("Lucy", "Persia", 4, 3);
		kucing.makan();
		kucing.bersuara();
		kucing.bergerak();
		kucing.usia();
		System.out.println();
		
		//objek Ayam
		System.out.println("Binatang Ayam");
		Ayam ayam = new Ayam ("Daru", "Bekisar", 2, 1);
		ayam.makan();
		ayam.bersuara();
		ayam.bergerak();
		ayam.usia();
		System.out.println();
		
		//objek Laba-laba
		System.out.println("Binatang Laba-laba");
		LabaLaba labaLaba = new LabaLaba("Spider", "Tarantula", 8, 12);
		labaLaba.makan();
		labaLaba.bersuara();
		labaLaba.bergerak();
		labaLaba.usia();
		System.out.println();
	}
}

//Binatang.java
class Binatang{
	//Deklarasi
	protected int usia;
	protected String ras;
	protected int jumlahKaki;
	protected String nama;
	
	Binatang (String nama){
		this.nama = nama;
	}
	
	Binatang (int jumlahKaki){
		this.jumlahKaki = jumlahKaki;
	}
	
	//Kode program lain
	public void bergerak(){
		System.out.println(nama+" Bergerak dengan "+jumlahKaki+" kaki.");
	}
	public void makan(){
		System.out.println(nama+" sedang makan.");
	}
}

//Ayam.java
class Ayam extends Binatang{
	Ayam (String nama, String ras, int jumlahKaki, int usia){
		super(nama);
		this.ras = ras;
		this.jumlahKaki = 2;
		this.usia = usia;
	}
	
	public void ras(){
		System.out.println(nama+" termasuk ras "+ ras);
	}
	
	public void bersuara(){
		System.out.println(nama+" suaranya petok.. petok.. petok..");
	}
	
	public void usia(){
		System.out.println(nama+" berumur "+ usia + " tahun");
	}
}

//Anjing.java
class Anjing extends Binatang{
	Anjing (String nama, String ras, int jumlahKaki, int usia){
		super(nama);
		this.ras = ras;
		this.jumlahKaki = 4;
		this.usia = usia;
	}
	
	public void ras(){
		System.out.println(nama+" termasuk jenis "+ ras);
	}
	
	public void bersuara(){
		System.out.println(nama+" suaranya guk.. guk.. guk");
	}
	
	public void usia(){
		System.out.println(nama+" berumur "+ usia + " tahun");
	}
}

//Kucing.java
class Kucing extends Binatang{
	Kucing (String nama, String ras, int jumlahKaki, int usia){
		super(nama);
		this.ras = ras;
		this.jumlahKaki = 4;
		this.usia = usia;
	}
	
	public void ras(){
		System.out.println(nama+" termasuk jenis "+ ras);
	}
	
	public void bersuara(){
		System.out.println(nama+" suaranya meow..meow..meow");
	}
	
	public void usia(){
		System.out.println(nama+" berumur "+ usia + " tahun");
	}
}

//LabaLaba.java
class LabaLaba extends Binatang{
	LabaLaba (String nama, String ras, int jumlahKaki, int usia){
		super(nama);
		this.ras = ras;
		this.jumlahKaki = 8;
		this.usia = usia;
	}
	
	public void ras(){
		System.out.println(nama+" termasuk jenis "+ ras);
	}
	
	public void bersuara(){
		System.out.println(nama+" suaranya rertt.. rerrt.. dugg.. dugg reert");
	}
	
	public void usia(){
		System.out.println(nama+" berumur "+ usia + " tahun");
	}
}