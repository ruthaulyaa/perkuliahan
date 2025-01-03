/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ojek;

import java.util.Scanner;

/**
 *
 * @author 11S20018
 */
public class Apps {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Transaksi orderan = new Transaksi();
        orderan.addFirst("BDG223", "Ujang", "Ayu", 15000, 0);
        orderan.addFirst("BDG546", "Jajang", "Siti", 10500, 0);
        orderan.addFirst("BDG987", "Ahmad", "Agus", 8000, 0);
        orderan.addFirst("BDG120", "Gusti", "Sulis", 23000, 0);
        orderan.Pesanan();
        
        System.out.println("Pengantaran selesai");
        int newRating;
        System.out.print("Berikan rating untuk Driver(0-5): ");
        newRating = sc.nextInt();
        orderan.Selesai();
        
        /*
        System.out.println("Cari Id: BDG223");
        if (orderan.contains("BDG223")) {
            System.out.println("Pengantaran selesai");
            int newRating;
            System.out.print("Berikan rating untuk Driver: ");
            newRating = sc.nextInt();
            orderan.Selesai();
        } else {
            System.out.println("ID tidak ditemukan");
        }
        */
    }
}
