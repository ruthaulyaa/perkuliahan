package LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 11S20018
 */
public class TestLinkedList {
    public static void main(String [] args){
             ListNode node1= new ListNode(20,null);
             ListNode node2= new ListNode(21,null);
             LinkedList linked = new LinkedList(node1);
             linked.insertFirst(node2);
             linked.insertLast(new ListNode(22,null));
             linked.insertLast(new ListNode(23,null));
             linked.insertFirst(new ListNode(23,null));
             //menampilkan semua elemen linked list mulai dari 
             //awal sampai akhir.
             linked.print();        
        }
}