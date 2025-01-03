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
public class Order {

    
    String idTransaksi, namaSupir, namaPenumpang;
    int tarif, rating, newRating;
    Order next;

    public Order(String idTransaksi, String namaSupir, String namaPenumpang, int tarif, int rating) {
        this.idTransaksi = idTransaksi;
        this.namaSupir = namaSupir;
        this.namaPenumpang = namaPenumpang;
        this.tarif = tarif;
        this.rating = rating;
    }

    //getter
    public String getIdTransaksi() {
        return idTransaksi;
    }

    public String getNamaSupir() {
        return namaSupir;
    }

    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public int getTarif() {
        return tarif;
    }

    public int getRating() {
        return rating;
    }
    
    public int getNewRating(){
        return newRating;
    }

    //setter
    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public void setNamaSupir(String namaSupir) {
        this.namaSupir = namaSupir;
    }

    public void setNamaPenumpang(String namaPenumpang) {
        this.namaPenumpang = namaPenumpang;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    
    public void setNewRating(int newRating) {
        this.newRating = newRating;
    }

    public void pesanan() {
        System.out.println("Antar sekarang: ");
        System.out.println("Id Transaksi: " + idTransaksi + " " + "Driver: " + namaSupir + " " + "Customer: " + namaPenumpang + " " + "Tarif: " + tarif + " " + "Rating: " + rating);
    }

    public void selesai() {
        System.out.println("Yeayy, Terima Kasih atas Rating yang diberikan");
        System.out.println("Id Transaksi: " + idTransaksi + " " + "Driver: " + namaSupir + " " + "Customer: " + namaPenumpang + " " + "Tarif: " + tarif + " " + "Rating: " + newRating);
    }
}