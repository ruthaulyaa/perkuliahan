//Laptop.java
package uts.pck1;
public class Laptop{
	//atribut
	//deklarasikan atribut di sini/
	private String jenis;
	private int ukuranLayar;
	private String prosesor;
	private double ram;
	private double harddisk;
	
	//konstruktor
	//konstruktor
	//tulis konstruktor tanpa parameter di sini/
	public Laptop(){
		jenis = "Laptop asus";
		ukuranLayar = 14;
		prosesor = "Intel Core i7-5820K";
		ram = 4.0;
		harddisk = 1024.0;
		
	}
	
	//tulis konstruktor dengan  parameter di sini/
	public Laptop(String jenis,int ukuranLayar,String prosesor,double ram,double harddisk){
		this.jenis = jenis;
		this.ukuranLayar = ukuranLayar;
		this.prosesor = prosesor;
		this.ram = ram;
		this.harddisk = harddisk;
	}
	
	//tulis kopi konstruktor di sini/
	public Laptop (Laptop L){
		jenis = L.getJenis();
		ukuranLayar = L.getUkuranLayar();
		prosesor = L.getProsesor();
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
	public void setProsesor(String prosesor){
		this.prosesor = prosesor;
	}
	public void setRam(double ram){
		this.ram = ram;
	}
	public void setHarddisk(double harddisk){
		this.harddisk = harddisk;
	}
	
	
	//getter
	//tulis semua getter di sini
	
	public String getJenis(){
		return this.jenis;
	}

	public int getUkuranLayar(){
		return this.ukuranLayar;
	}
	
	public String getProsesor(){
		return this.prosesor;
	}

	public double getRam(){
		return this.ram;
	}

	public double getHarddisk(){
		return this.harddisk;
	}
	
	//tulis method menjalankanAplikasi() di sini
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
		return 
			"Spesifikasi " + getJenis() + ":ukuran layar " + getUkuranLayar() + ", prosesor " + getProsesor() + ", RAM " + getRam() + " GB" + ", harddisk " + getHarddisk() + " GB" ;
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