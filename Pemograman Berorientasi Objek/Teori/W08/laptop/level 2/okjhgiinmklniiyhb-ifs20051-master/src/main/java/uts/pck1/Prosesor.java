//Prosesor.java
package uts.pck1;
public class Prosesor{
	//atribut
	//deklarasikan atribut di sini/
	private String jenis;
	private int jmlInti;
	
	
	//konstruktor
	//tulis konstruktor tanpa parameter di sini/
	public Prosesor(){
		this.jenis = "Intel Core i5-5820K";
		this.jmlInti = 4;
	}
	
	
	//tulis konstruktor dengan  parameter di sini/
	public Prosesor(String jenis, int jmlInti){
		this.jenis = jenis;
		this.jmlInti = jmlInti;
	}


	//tulis kopi konstruktor di sini/
	public Prosesor(Prosesor pro){
		this.jenis = pro.getJenis();
		this.jmlInti = pro.getJmlInti();
	}
	
	//setter
	//tulis semua setter di sini/
	
	public void setJenis(String jenis){
		this.jenis = jenis;
	}
	
	public void setJmlInti(int jmlInti){
		this.jmlInti = jmlInti;
	}	
	
	//getter
	//tulis semua getter di sini/
	
	public String getJenis(){
		return this.jenis;
	}
	
	public int getJmlInti(){
		return this.jmlInti;
	}
	
	
	//tulis method toString() di sini/
	//Method toString() akan mengembalikan sebuah string, baca file Readme.md/
	
	public String toString(){
		return ("prosesor "+ this.jenis+" "+ this.jmlInti+" inti");
	}


	//method ini tidak boleh dihapus atau diubah
	public boolean equals(Object o){
		if (o instanceof Prosesor){
			Prosesor p = (Prosesor) o;
			return (getJenis().equalsIgnoreCase(p.getJenis()) && getJmlInti()== p.getJmlInti());
		}
		return false;
	}
}