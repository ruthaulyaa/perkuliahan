//Ayam.java
public class Ayam extends Binatang{
	Ayam (String nama, String ras, int jumlahKaki){
		super(nama);
		this.ras = ras;
		this.jumlahKaki = jumlahKaki;
	}
	
	public void ras(){
		System.out.println(nama+" termasuk ras "+ ras);
	}
	
	public void bersuara(){
		System.out.println(nama+" suaranya petok.. petok.. petok..");
	}
}