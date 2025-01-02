//MenuItemDriver.java
//package praktikum4.soal1b;
//import praktikum4.soal1a.*;
import java.util.Scanner;

public class MenuItemDriver{
	public static void main (String [] args){
		MenuItem mi;
		Scanner scn = new Scanner(System.in);
		System.out.print("Instansiasi objek MenuItem dengan konstruktor tanpa parameter \n");
		//Ganti baris ini dengan kode program yang menginstansiasi MenuItem menggunakan konstruktor tanpa parameter
                mi = new MenuItem();
                mi.MenuItem();
		System.out.print(mi.toString());
		
		
		System.out.print("\n\nInstansiasi objek MenuItem dengan konstruktor dengan parameter \n");
		//Ganti baris ini dengan kode program yang menginstansiasi MenuItem menggunakan konstruktor dengan parameter sehingga membentuk objek dengan jenis pesanan minuman, nama pesanan bandrek susu, harganya 5000, jumlahnya 5
                mi = new MenuItem();
                mi.buatPesanan("minuman", "bandrek susu", 5000, 5);
		System.out.print(mi.toString());
		
		System.out.print("\n\nPemanggilan method buatPesanan() dari suatu objek");
		System.out.print("\n\nMenerima input dari user");
		System.out.print("\nCustomer pesan makanan atau minuman?");
		String jenis = scn.nextLine();
		System.out.print("Customer pesan "+jenis+" apa?");
		String nama = scn.nextLine();
		System.out.print("Harga "+jenis+" berapa?");
		int harga = Integer.parseInt(scn.nextLine());
		System.out.print("Customer memesan berapa "+nama+"?");
		int jmlPesanan = Integer.parseInt(scn.nextLine());
		//Ganti baris ini dengan kode program yang memanggil method buatPesanan() dengan memasukkan sejumlah inputan yang sudah diterima dari user.
                mi = new MenuItem();
                mi.buatPesanan(jenis, nama, harga, jmlPesanan);
		System.out.print(mi.toString());
	    
		
		System.out.print("\n\nJumlah objek MenuItem yang sudah dicreate:"+MenuItem.getNbInstance());
	}
}