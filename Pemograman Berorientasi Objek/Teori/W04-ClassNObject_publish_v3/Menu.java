public class Menu{
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