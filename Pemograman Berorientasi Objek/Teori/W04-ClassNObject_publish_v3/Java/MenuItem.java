//MenuItem.java
//package praktikum4.soal1a;

public class MenuItem {
	String jenisPesanan;
    String namaPesanan;
    int harga;
    int jmlPesanan;
    static int nbInstance = 0;
    int totharga;

    public String getJenisPesanan() {
        return jenisPesanan;
    }

    public void setJenisPesanan(String jenisPesanan) {
        this.jenisPesanan = jenisPesanan;
    }

    public String getNamaPesanan() {
        return namaPesanan;
    }

    public void setNamaPesanan(String namaPesanan) {
        this.namaPesanan = namaPesanan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJmlPesanan() {
        return jmlPesanan;
    }

    public void setJmlPesanan(int jmlPesanan) {
        this.jmlPesanan = jmlPesanan;
    }

    public static int getNbInstance() {
        return nbInstance;
    }

    public void setNbInstance(int nbInstance) {
        this.nbInstance = nbInstance;
    }

    public int getTotharga() {
        return totharga;
    }

    public void setTotharga(int totharga) {
        this.totharga = totharga;
    }
    
    public void MenuItem(){
        jenisPesanan = "makanan";
        namaPesanan = "Nasi goreng seafood";
        harga = 25000;
        jmlPesanan = 1;
        
        totharga=harga*jmlPesanan;
    }
    
   public void buatPesanan(String jenisPesanan, String namaPesanan, int harga, int jmlPesanan){
       this.jenisPesanan = jenisPesanan;
       this.namaPesanan = namaPesanan;
       this.harga = harga;
       this.jmlPesanan = jmlPesanan;     
       
       totharga=this.harga*this.jmlPesanan;
       
       nbInstance++;
    }
   
   public String toString() {
	return "Jenis Pesanan: " + jenisPesanan + " " + namaPesanan + "   @" + 
                harga + "x " + jmlPesanan + "    =   " + totharga;
    }
	public boolean equals(Object obj){
	MenuItem mi2 = (MenuItem) obj;
	return (getJenisPesanan().equals(mi2.getJenisPesanan()) && getNamaPesanan().equals(mi2.getNamaPesanan()) && getHarga() == mi2.getHarga() && getJmlPesanan()==mi2.getJmlPesanan());
    }
}