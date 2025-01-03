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
public class LinkedList implements List{
    ListNode first;// linked list kosong jika first = null;
    //constructor
   public LinkedList(){
        first = null;
   } 
   public LinkedList(ListNode e){
        first = e;
   }
    @Override
   public boolean isEmpty(){
        return first==null;
   }
    @Override
   public void makeEmpty(){
        first = null;
    }
    @Override
    public void insertFirst(ListNode e){
        e.next = first;
        first = e;
    }
    @Override
    public void insertLast(ListNode e){
        if(isEmpty())
            insertFirst(e);
        else{
            ListNode p = first;
            while(p.next!=null)
                p = p.next;
                p.next = e;
            }
    }
    @Override
    public boolean deletetFirst(){
        if(isEmpty())
            return false;
        else{
            first = first.next;
            return true;
        }
    }
    @Override
    public boolean deleteLast(){
        if(isEmpty())
            return false;
        else{
        //untuk menghapus elemen terakhir, perlu mengakses
        //elemen sebelum elemen terakhir
            ListNode last = first;
            //preLast untuk menyimpan elemen sebelum last
            ListNode preLast = null;
            while(last.next!=null){
                preLast = last;
                last = last.next;
            }
            //kondisi linked list hanya terdiri dari satu 
            //elemen
            if(preLast==null)
                makeEmpty();
            else
                preLast.next = null;
                return true;
        }
    }
    public boolean contains(ListNode e){
	ListNode p = first;
	while(p!=null){
            if(p.compareTo(e)==0)
                return true;
            p = p.next;
	}
	return false;
    }
    
    public void print(){
        ListNode p = first;
        while(p != null){
            System.out.println(p.element);
            p = p.next;
        }
    }
}