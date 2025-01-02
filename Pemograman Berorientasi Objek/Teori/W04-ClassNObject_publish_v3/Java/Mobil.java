//Mobil.java
import java.util.Scanner;
public class Mobil{
	//Deklarasi atribut
	private String nomorPlat;
	private String tipeTransmisi;
	private String warna;
	private String manufaktur;
	private double kecepatan;
	
	//konstruktor tanpa parameter
	public Mobil(){
		nomorPlat = "XY 2345";
		tipeTransmisi = "Manual";
		warna = "Merah";
		manufaktur = "Eropa";
		kecepatan = 100.0;
	}
	
	//konstruktor dengan parameter
	public Mobil(String newNomorPlat, String newTipeTransmisi, String newWarna,
	String newManufaktur, double newKecepatan){
		this.nomorPlat = newNomorPlat;
		this.tipeTransmisi = newTipeTransmisi;
		this.warna = newWarna;
		this.manufaktur = newManufaktur;
		this.kecepatan = newKecepatan;
	}
//soal 1b	
	public static void pilihan(){
		Scanner input = new Scanner(System.in);
		System.out.println("\nAksi yang akan dilakukan:\n 1. berbelok\n 2. mengerem\n 3. akselerasi ");
		System.out.print("Masukkan angka pilihan : "); 
        int pilih = input.nextInt();
        switch(pilih){
            case 1:
            Mobil.berbelok();
		break;
            case 2:
            Mobil.mengerem();
		break;
			case 3:
            Mobil.akselerasi();
		break;  		
		}
	}
	
	public static void berbelok(){
		Scanner input = new Scanner(System.in);
        System.out.println("======================");
		System.out.println("Arah belok?\n 1. kanan\n 2. kiri");
		System.out.print("Masukkan angka pilihan : "); 
        int pilih2=input.nextInt();
        switch(pilih2){
			case 1:
			System.out.println("mobil berbelok ke kanan");
        break;
			case 2:
			System.out.println("mobil berbelok ke kiri");
		break;
		}
	}	
	
	public static void mengerem(){
		Scanner input = new Scanner(System.in);
        System.out.println("======================");
		System.out.println("Menurunkan kecepatan?\n 1. Ya\n 2. tidak");
		System.out.print("Masukkan angka pilihan : "); 
        int pilih3=input.nextInt();
        switch(pilih3){
			case 1:
			System.out.println("mobil mengerem");
        break;
			case 2:
			System.out.println("tidak ada penurunan kecepatan");
		break;
		}
	}
	
public static void akselerasi(){
		Scanner input = new Scanner(System.in);
        System.out.println("======================");
		System.out.println("Menampilkan percepatan?\n 1. Ya\n 2. tidak");
		System.out.print("Masukkan angka pilihan : "); 
        int pilih4=input.nextInt();
		switch(pilih4){
			case 1:
			System.out.println("menampilkan percepatan");
        break;
			case 2:
			System.out.println("tidak ada menampikan apapun");
		break;
		}
	}
	
	//setter
	public void setNomorPlat(String newNomorPlat){
		this.nomorPlat = newNomorPlat;
	}
	public void setTipeTransmisi(String newTipeTransmisi){
		this.tipeTransmisi = newTipeTransmisi;
	}
	public void setWarna(String newWarna){
		this.warna = newWarna;
	}
	public void setManufaktur(String newManufaktur){
		this.manufaktur = newManufaktur;
	}
	public void setKecepatan(double newKecepatan){
		this.kecepatan = newKecepatan;
	}
	
	//getter
	public String getNomorPlat(){
		return nomorPlat;
	}
	public String getTipeTransmisi(){
		return tipeTransmisi;
	}
	public String getWarna(){
		return warna;
	}
	public String getManufaktur(){
		return manufaktur;
	}
	public double getKecepatan(){
		return kecepatan;
	}
	public String toString(){
		return "Nomor Plat: " + nomorPlat + "\n" + "Tipe Transmisi: " +
		tipeTransmisi + "\n" + warna + "\n" + "Manufaktur: " + manufaktur +
		"\n" + "Kecepatan: " + kecepatan + " km/h\n";
	}
	public boolean equals(Object obj){
		Mobil mbl = (Mobil) obj;
		return (getNomorPlat().equals(mbl.getNomorPlat()) && 
		getTipeTransmisi().equals(mbl.getTipeTransmisi()) && 
		getWarna().equals(mbl.getWarna()) &&
		getManufaktur().equals(mbl.getManufaktur()) &&
		getKecepatan() == mbl.getKecepatan());
	}
}