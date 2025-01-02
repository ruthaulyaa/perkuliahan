//Ular.java
public class Ayam extends Binatang{
	Ular (String nama, String ras, int jumlahKaki){
		super(nama);
		this.ras = ras;
		this.jumlahKaki = 0;
	}
	
	public void ras(){
		Sytem.out.println(nama+" termasuk ras "+ ras);
	}
	
	public void bersuara(){
		Sytem.out.println(nama+" suaranya sst.. sst.. sst..");
	}
}