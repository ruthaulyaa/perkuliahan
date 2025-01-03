import java.util.*;

public class TestSoal1_11S20018 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        Soal1_11S20018 jam = new Soal1_11S20018();

        System.out.println("Membaca Jam");
        jam.bacaJam();
        System.out.println("");

        System.out.println("Menulis Jam");
        jam.tulisJam();
        System.out.println("");

        System.out.println("Berikut jamToDetik tanpa parameter");
        System.out.println("" + jam.jamToDetik());
        System.out.println("");

        System.out.println("Berikut jamToDetik dengan parameter");
        int counter = 0;
        int hour = 0, minute = 0, second = 0;
        
		do{
            if(counter != 0){
                System.out.println("");
                System.out.println("Nilai jam yang Anda berikan tidak valid (" + hour + ":" + minute + ":" + second + ")." );
                System.out.println("Silakan mengisikan kembali!");
                System.out.println("");
            }

            System.out.print("Silakan memasukkan jam => ");
            hour = sc.nextInt();
            
			System.out.print("Silakan memasukkan menit => ");
            minute = sc.nextInt();
            
			System.out.print("Silakan memasukkan sekon => ");
            second = sc.nextInt();
            
			counter += 1;
        }while(hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59);
			Soal1_11S20018 jam2 = new Soal1_11S20018(hour, minute, second);
			jam.tulisJam();
			
			System.out.print("Hasil konversi jamToDetik => ");
			System.out.println("" + jam.jamToDetik(jam2));
			System.out.println("");
			System.out.println("detikToJam");
			
			int detik = 0;
			System.out.print("Silakan memasukkan detik => ");
			detik = sc.nextInt();
			System.out.print("Hasil konversi detik " + detik + " ke jam menjadi ");
			
			Soal1_11S20018 jam3 = new Soal1_11S200185(jam.detikToJam(detik));
			jam3.tulisJam();
    }
}