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
public class ListNode implements Comparable<ListNode>{
    Object element;//data dari elemen, elemen bisa bertipe 
                   //reference ataupun bertipe primitif
    ListNode next; 
    //constructor
    public ListNode(Object theElement, ListNode n){
	element = theElement;
        next = n;
    }
    public ListNode(Object theElement){
	this(theElement,null);
    }
    public ListNode(){
	this(null,null);
    }
    //Asumsi elemen ListNode adalah turunan dari kelas Number
    @Override
    public int compareTo(ListNode e){
    if (element==e.element)
	return 0;
    else
	return 1;
    }
}
