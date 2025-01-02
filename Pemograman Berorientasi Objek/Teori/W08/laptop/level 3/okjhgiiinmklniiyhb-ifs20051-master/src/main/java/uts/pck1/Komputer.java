//Komputer.java
package uts.pck1;
public abstract class Komputer{
	//atribut
	/*deklarasikan atribut di sini*/
	protected String jenis;
	protected int ukuranLayar;
	
	
	/*deklarasikan semua method di sini*/
	public abstract void setJenis(String jenis);
	public abstract void setUkuranLayar(int ukuranLayar);
	public abstract String getJenis();
	public abstract int getUkuranLayar();	
}