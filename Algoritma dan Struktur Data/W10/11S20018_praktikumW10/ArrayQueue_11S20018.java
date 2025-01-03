/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue_11S20018;

/**
 *
 * @author 11S20018
 */
public class ArrayQueue_11S20018<E> implements Queue_11S20018<E>{
    private E[] array;
    private int queueSize;
    private int front;
    private int back;
    
    private static final int DEFAULT_CAPACITY = 10;
    
    // Construct the queue.
    public ArrayQueue_11S20018(){
        array = (E[]) new Object[DEFAULT_CAPACITY];
        clear();
    }
    
    // Return the size of the queue.
    public int size(){
        return this.queueSize;
    }
    
    // Test if the queue is logically empty.
    public boolean isEmpty(){
        return queueSize == 0;
    }
    
    // Make the queue logically empty.
    public void clear(){
        front = 0;
        back = 0;
        queueSize = 0;
    }
    
    /**
    * Internal method to increment with wraparound.
    * @param x any index in array's length.
    * @return x+1, or 0 if x is at the end of array.
    */
    
    private int increment(int x){
        if (++x == array.length)
            x = 0;
        return x;
    }

    // Insert a new item into the queue.
    public void Enqueue(E e){
        if(back == DEFAULT_CAPACITY){
            System.out.println("ArrayQueue is full");
        } else{
            back++;
            array[back] = e;
            queueSize++;
        }
        
    }
    
    // Return and remove the least recently inserted item from the queue.
    public E dequeue(){
        if(isEmpty()){
            throw new RuntimeException("ArrayQueue empty");
        } else{
            E temp = array[front];
            for(int i = front; i <= back; i++){
            array[i] = array[i+1];
        }
        back--;
        return temp;
        }
    }
    
    // Get the least recently inserted item in the queue.
    // Does not alter the queue.
    public E getFront(){
        if (isEmpty()){
            throw new RuntimeException("ArrayQueue empty");
        }
        return array[front];
    }
    
    void print(){
        int i;
        for (i=front;array[i]!=null;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }    
}