//MobilDriver.java
import java.util.Scanner;
public class MobilDriver{
	public static void main (String [] args){
		Mobil mblA = new Mobil();
		Mobil mblB = new Mobil("GH 1989", "Otomatis", "Biru", "Jepang", 50);
		
		System.out.print("Objek mobil A\n" + mblA.toString());
		System.out.print("\nObjek mobil B\n" + mblB.toString());
		
		Scanner input = new Scanner(System.in);
		Mobil.pilihan();
		System.out.println("======================");
		System.out.print("Apa ada aksi yang akan dilakukan? 1=Ya; 2=Tidak: ");
		int aksi = input.nextInt();
		while (aksi == 1){
			Mobil.pilihan();
			System.out.println("======================");
			System.out.print("Lakukan aksi kembali? 1=Ya 2=Cancel: ");
			aksi = input.nextInt();
		}
	}
}