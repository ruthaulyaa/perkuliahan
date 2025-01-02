import java.util.Scanner;
public class DriveException_11S20018 {
    public static void main (String args[]){
        Scanner pengecekan = new Scanner (System.in);

        Barang_11S20018 brg = new Barang_11S20018("Sapu", 6, 12500);
        Toko_11S20018.tambahBarang(brg);

        brg = new Barang_11S20018("Sikat gigi", 1, 5000);
        Toko_11S20018.tambahBarang(brg);

        brg = new Barang_11S20018("Tisu", 3, 3500);
        Toko_11S20018.tambahBarang(brg);

        brg = new Barang_11S20018("Lakban", 2, 4500);
        Toko_11S20018.tambahBarang(brg);

        brg = new Barang_11S20018("Tusuk gigi", 5, 7500);
        Toko_11S20018.tambahBarang(brg);

        System.out.println("Selamat datang di Toko_11S20018 \nMasukkan id barang : ");
        int pencarian = pengecekan.nextInt();

        try{
            Toko_11S20018.caribarangID(pencarian);
        }
        catch (BarangException_11S20018 ie){
            System.out.println(ie.getMessage());
        }
		
        System.out.println("Silahkan Masukkan Uang :");
        int uang = pengecekan.nextInt();

        try{
            brg = Toko_11S20018.getBarang(pencarian);
            Toko_11S20018.beliBarang(brg, uang);
            System.out.println("Transaksi Berhasil\nSilahkan Ambil Barang Anda");
        }
        catch (BarangException_11S20018 ie){
            System.out.println(ie.getMessage());
        }
    }
}
