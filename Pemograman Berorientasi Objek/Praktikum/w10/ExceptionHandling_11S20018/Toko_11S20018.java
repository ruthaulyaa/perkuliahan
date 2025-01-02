import java.util.ArrayList;
import java.util.Scanner;

public class Toko_11S20018{
    static ArrayList<Barang_11S20018> listBarang = new ArrayList<>();

    public static void tambahBarang (Barang_11S20018 brg){
        listBarang.add(brg);
    }
	
	//cari barang berdasarkan id barang
    public static int caribarangID (int id) throws BarangException_11S20018{
        int indeks = -1;
        int count = 0;
        for (int i = 0; i < listBarang.size(); i++){
            if (listBarang.get(i).getId() == id){
                indeks = count;
                break;
            }
            count++;
        }
        if (indeks == -1){
            throw new BarangException_11S20018 ("Barang Tidak Tersedia");
        }
        return indeks;
    }
	
    public static Barang_11S20018 getBarang(int id) throws BarangException_11S20018{
        return listBarang.get(caribarangID(id));
    }
	
	//pembelian
    public static void beliBarang (Barang_11S20018 brg, int uang) throws BarangException_11S20018{
        int indeks = -1;
        indeks = caribarangID(brg.getId());

        if (uang < 0){
			throw new BarangException_11S20018 ("Masuk daftar utang");
        }
        else if (uang < brg.getHarga()){
			throw new BarangException_11S20018("Maaf, Saldo tidak mencukupi");
        }
        else if (uang >= brg.getHarga()){
            listBarang.remove(indeks);
            int sisa = uang - brg.getHarga();
            throw new BarangException_11S20018 ("Kembalian uang anda senilai = " + sisa);
        }
        listBarang.remove(indeks);
    }
}