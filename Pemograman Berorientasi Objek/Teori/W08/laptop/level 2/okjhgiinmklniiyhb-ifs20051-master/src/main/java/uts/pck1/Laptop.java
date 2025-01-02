//Laptop.java
package uts.pck1;
public class Laptop{
	//atribut
	//deklarasikan atribut di sini/
	private String jenis;
	private int ukuranLayar;
	private Prosesor p;
	private double ram;
	private double harddisk;
	
	
	//konstruktor
	//konstruktor
	//tulis konstruktor tanpa parameter di sini/
	public Laptop(){
		jenis = "laptop asus";
		ukuranLayar = 14;
		p = new Prosesor();
		ram = 4;
		harddisk = 1024;
	}
	
	
	//tulis konstruktor dengan  parameter di sini/
	public Laptop(String jenis, int ukuranLayar, Prosesor prosesor, double ram, double harddisk){
		this.jenis = jenis;
		this.ukuranLayar = ukuranLayar;
		this.p = new Prosesor(prosesor); //untuk memanggil konstruktor (+) parameter dari Prosesor.java
		this.ram = ram;
		this.harddisk = harddisk; 
	}
	
	
	//tulis kopi konstruktor di sini/
	public Laptop(Laptop L){
		jenis = L.getJenis();
		ukuranLayar = L.getUkuranLayar();
		p = new Prosesor(L.getProsesor());
		ram = L.getRam();
		harddisk = L.getHarddisk();
		
	}


	//setter
	//tulis semua setter di sini/
	public void setJenis(String jenis){
		this.jenis = jenis;
	}


	public void setUkuranLayar(int ukuranLayar){
		this.ukuranLayar = ukuranLayar;
	}
	
	
	public void setProsesor(Prosesor prosesor){
		this.p.setJenis(prosesor.getJenis());
		this.p.setJmlInti(prosesor.getJmlInti());
	}


	public void setRam(double ram){
		this.ram = ram;
	}


	public void setHarddisk(double harddisk){
		this.harddisk = harddisk;
	}
	
	
	//getter
	//tulis semua getter di sini/
	public String getJenis(){
		return this.jenis;
	}


	public int getUkuranLayar(){
		return this.ukuranLayar;
	}
	
	
	public Prosesor getProsesor(){
		return p;
	}


	public double getRam(){
		return this.ram;
	}


	public double getHarddisk(){
		return this.harddisk;
	}
	
	
	
	//tulis method menjalankanAplikasi() di sini/
	//Method menjalankanAplikasi() akan mengembalikan sebuah string, baca file Readme.md/
	public String menjalankanAplikasi(String namaAplikasi, double ram, double harddisk){
		if (this.ram>=ram && this.harddisk>=harddisk ) {
			return "\nLaptop sedang menjalankan aplikasi " + namaAplikasi + " sisa ram:"  + (this.ram - ram) + " GB" + ", sisa harddisk:" + (this.harddisk - harddisk) + " GB";
		
		}
		
		else return "\nSpesifikasi Laptop tidak sanggup menjalankan aplikasi " + namaAplikasi;
	
	}
	
	
	
	//tulis method toString() di sini/
	//Method toString() akan mengembalikan sebuah string, baca file Readme.md/
	public String toString(){
		return (
			"Spesifikasi " + jenis + ":ukuran layar " + ukuranLayar + ", " + p + ", RAM " + ram + " GB" + ", harddisk " + harddisk + " GB" 
				);
	}
	
	
	//method ini tidak boleh dihapus atau diubah
	public boolean equals(Object o){
		if (o instanceof Laptop){
			Laptop lt = (Laptop) o;
			return (getJenis().equalsIgnoreCase(lt.getJenis()) && getUkuranLayar()== lt.getUkuranLayar() && getProsesor().equals(lt.getProsesor()) && getRam()==lt.getRam() &&getHarddisk()==lt.getHarddisk());
		}
		return false;
	}
}