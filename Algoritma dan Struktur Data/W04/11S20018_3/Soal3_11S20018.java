import java.io.*;
import java.util.*;

class Soal3_11S20018 {
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

        // Membuat ListIterator
        ListIterator iterator = list.listIterator();

        // Baca dari depan
        System.out.println("Menampilkan list elemen dari depan ke belakang: ");

        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
			System.out.println();
			// Baca dari belakang
			System.out.println("Menampilkan list elemen dari belakang ke depan : ");

		while (iterator.hasPrevious())
			System.out.print(iterator.previous() + " ");
			System.out.println();
    }
}