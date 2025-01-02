public class Barang_11S20018 {
    String namaBrg;
    int id, harga;

    public Barang_11S20018 (String namaBrg, int id, int harga){
        this.namaBrg = namaBrg;
        this.id = id;
        this.harga = harga;
    }


	//setter
    public void setNama (String namaBrg){
        this.namaBrg = namaBrg;
    }
    public void setId (int id){
        this.id = id;
    }
    public void setHarga (int harga){
        this.harga = harga;
    }
	
    //getter
    public String getNama(){
        return namaBrg;
    }
    public int getId(){
        return id;
    }
    public int getHarga(){
        return harga;
    }
}
