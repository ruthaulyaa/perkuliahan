//Kucing.java
public class Kucing extends Binatang{
	Kucing (String nama, String ras, int jumlahKaki){
		super(nama);
		this.ras = ras;
		this.jumlahKaki = jumlahKaki;
	}
	
	public void ras(){
		System.out.println(nama+" termasuk jenis "+ ras);
	}
	
	public void bersuara(){
		System.out.println(nama+" suaranya meow..meow..meow");
	}
}