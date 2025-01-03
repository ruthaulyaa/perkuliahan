/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 11S20018
 */
public class ListStack_11S20018<E> implements Stack_11S20018<E> {
    private ListNode_11S20018<E> top;
    private int stackSize;
    
    //construct the stack
    public ListStack_11S20018(){
        clear();
    }
    
    //return the size of the stack
    public int size(){
        return stackSize;
    }
    
    //test if the stack is logically empty
    public boolean isEmpty(){
        return top == null;
    }
    
    //make the stack logically empty
    public void clear(){
        top = new ListNode_11S20018<E>();
        stackSize = 0;
    }
    
    //insert a new item into the stack
    public void push(E e){
        ListNode_11S20018<E> a = new ListNode_11S20018<E>(e,null);
        if (isEmpty()){
            top = a;
        }else{
            a.next = top;
            top = a;
        }
        stackSize++; 
    }
    
    
    //get the most recently inserted item in the stack
    //doe not alter the stack
    public E top(){
        if (isEmpty()){
            throw new java.util.EmptyStackException();
        } else {
            return top.element;
        }
    }
    
    //remove the most recenlty inserted item from the stack
    public void pop(){
        if (isEmpty()){
            throw new java.util.EmptyStackException(); 
        } else {
            top = top.next;
            stackSize--;
        }
    }
    
    //return and remove the most recently inserted u=item form the stack
    public E topAndPop(){
        if (isEmpty()){
            throw new java.util.EmptyStackException();
        }
        E a = top.element;
        top = top.next;
        return a;
    }
    
    public void print(){
        ListNode_11S20018<E> a = top;
        while (a.element !=null){
            System.out.println(a.element + " ");
            if (a.next == null){
                break;
            }
            a = a.next;
            }
        System.out.println();
    }
}
