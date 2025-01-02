class MenuItem {
	private String makanan;
	private String minuman;
	private Integer jumlah1;
	private Integer jumlah2;
	private Integer harga;
    
    public String makanan(){
        return makanan;
    }
	
	public void setMakanan (String makanan){
        this.makanan = makanan;
    }
	
	    public String minuman(){
        return minuman;
    }
	
	public void setMinuman (String minuman){
        this.minuman = minuman;
    }
	
	public Integer jumlah1(){
        return jumlah1;
    }
	
	public void setJumlah1 (Integer jumlah1){
        this.jumlah1 = jumlah1;
    }
	
	public Integer jumlah2(){
        return jumlah2;
    }
	
	public void setJumlah2 (Integer jumlah2){
        this.jumlah2 = jumlah2;
    }
	
	public Integer harga(){
        return harga;
    }
	
	public void setHarga (Integer harga){
        this.harga = harga;
    }
	
	public String toString(){
		return "Saya membeli" + this.makanan + "sebanyak" + this.jumlah1 + "dan" + this.minuman + "sebanyak" + this.jumlah2 + "dengan total harga" + this.harga + ".";
	}
}

public class Menu extends MenuItem{
	public static void main(String[] args){
		MenuItem Beli = new MenuItem();
		
		Beli.setMakanan("Roti");
		Beli.setMinuman("Kopi Hitam");
		Beli.setJumlah1(2);
		Beli.setJumlah2(1);
		Beli.setHarga(13000);
		
		System.out.println(Beli);
	}
}