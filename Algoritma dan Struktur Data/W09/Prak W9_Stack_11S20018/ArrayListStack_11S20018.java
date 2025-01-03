
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 11S20018
 * @param <E>
 */
public class ArrayListStack_11S20018<E> implements Stack_11S20018<E> {
    private ArrayList<E> items;
    
    //contruct the stack
    public ArrayListStack_11S20018(){
        items = new ArrayList<E>();
    }
    
    //return the size of the stack 
    public int size(){
        return items.size();
    }
    
    //test if the stcak is logically empty
    public boolean isEmpty(){
        return size()==0;
    }
    
    //make the stack logically empty
    public void clear(){
        items.clear();
    }
    
    //insert a new item into the stack
    public void push(E e){
        items.add(e);
    }
    
    //get the most recenly inserted item form the stack
    //does not alterthe stack
    public E top(){
        if (isEmpty()){
            throw new java.util.EmptyStackException();
        }
        return items.get(items.size()-1);
    }
    
    //remove the most recently inserted item from the stack
    public void pop() {
        if (isEmpty()){
            throw new java.util.EmptyStackException();
        }
        items.remove(items.size() - 1);
    }
    //return and remove the most recently inserted utem from the stack
    public E topAndPop(){
        if (isEmpty())
            throw new java.util.EmptyStackException();
        E a = top();
        pop();
        return a;
    }
    
    public void print() {
        for (int i = 0; i < items.size(); i++){
            System.out.print(items.get(i) + " ");
        }
        System.out.println();   
    }
}