/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VersiGeneric;

import java.awt.Point;
/**
 *
 * @author 11S20018
 */
public class TestLinkedList{
    public static void main(String[] args){
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>(1,2);
        if (myLinkedList.contains(1)) 
            System.out.println("Ketemu 1");
        LinkedList<ListNode> myLinkedList2 = new LinkedList<ListNode>(new ListNode(1,2), new ListNode(3,4));
        if (myLinkedList2.contains(new ListNode(1,2)))
            System.out.println("Ketemu 2");
    }
}