import java.io.*;
import java.util.*;

class TestSoal3_11S20018 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        int len = 0;
        System.out.print("Silakan memasukkan panjang elemen list => ");
        len = sc.nextInt();

        for(int i=1; i<=len; i++){
            System.out.print("Masukkan Nilai List ke " + i + " => ");
            list.add(sc.nextInt());
        }

        System.out.println("");

        // Baca dari depan
        System.out.println("Menampilkan list elemen dari depan ke belakang: ");

        for (int i = 0; i < list.size(); i++){
            System.out.print("" + list.get(i) + " ");
        }

        System.out.println();

        // TBaca dari belakang
        System.out.println("Menampilkan list elemen dari belakang ke depan : ");

        for (int i = list.size() - 1; i >= 0; i--){
            System.out.print("" + list.get(i) + " ");
        }
    }
}