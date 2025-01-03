/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ojek;


/**
 *
 * @author 11S20018
 */
public class Transaksi {
    Order transaksi;

    public Transaksi() {
        transaksi = null;
    }

    public boolean isEmpty() {
        return (transaksi == null);
    }

    public void addFirst(String idTransaksi, String namaSupir, String namaPenumpang, int tarif, int rating) {
        Order order = new Order(idTransaksi, namaSupir, namaPenumpang, tarif, rating);
        order.next = transaksi;
        transaksi = order;
    }

    public void addLast(String idTransaksi, String namaSupir, String namaPenumpang, int tarif, int rating) {
        Order order, help;
        order = new Order(idTransaksi, namaSupir, namaPenumpang, tarif, rating);
        order.next = null;
        if (isEmpty()) {
            transaksi = order;
            transaksi.next = null;
        } else {
            help = transaksi;
            while (help.next != null) {
                help = help.next;
            }
            help.next = order;
        }
    }

    public void Pesanan() {
        Order current = transaksi;
        if (current == null) {
            System.out.println("Tidak ada yang perlu di antar");
        } else {
            while (current != null) {
                current.pesanan();
                current = current.next;
            }
        }
    }
    
    public void Selesai(){
        Order ready = transaksi;
        while (ready != null) {
            ready.selesai();
            ready = ready.next;
        }
    }

    public Order deleteFirst() {
        if (!isEmpty()) {
            Order temp = transaksi;
            transaksi = transaksi.next;
            return temp;
        } else {
            return null;
        }
    }

    public Order deleteLast() {
        if (!isEmpty()) {
            Order temp;
            Order current;
            current = transaksi;
            while (current.next.next != null) {
                current = current.next;
            }
            temp = current.next;
            current.next = null;
            return temp;
        } else {
            Order tmp = transaksi;
            transaksi = null;
            return tmp;
        }
    }
}
