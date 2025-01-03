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
public class ArrayStack_11S20018<E> implements Stack_11S20018<E>{
    private E[] array;
    private int top;
    private static final int DEFAULT_CAPACITY = 10;
    
    //Contruct the stack
    public ArrayStack_11S20018(){
       array = (E[]) new Object[DEFAULT_CAPACITY];
       top = -1;
    }
    
    //return the size of the stack
    public int size(){
        return top+1;
    }
    
    //test if the stack is logically empty
    public boolean isEmpty(){
        if (top == -1)
            return true;
        return false;
    }
    
    //make the stack is logicaly empty
    public void clear(){
        this.top = -1;
    }
    
    //insert a new item into the stack
    public void push(final E e){
        this.top += 1;
        array[top] = e;
    }
    
    //get the most recenlty inserted item in the stack
    public E top(){
        if (isEmpty()){
            throw new java.util.EmptyStackException();
        }
        array[top] = null;
        return array[top-1];
    }
    
    public void pop(){
        if (isEmpty()){
            throw new java.util.EmptyStackException();
        }
        array[top] = null;
        top = top-1;
    }
    
    public E topAndPop(){
        if(isEmpty())
            throw new java.util.EmptyStackException();
        this.top -= 1;
        return array[top + 1];
    }
    
    public void print(){
	for (int i = 0; i < top+1 ; i++){
            System.out.println(array[i] + " ");
	}
	System.out.println();
    }  
}