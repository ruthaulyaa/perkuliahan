/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queueSirkuler_11S20018;

/**
 *
 * @author 11S20018
 */
public class ArrayQueueSirkuler_11S20018<E>{
    private E[] array;
    private int queueSize; //Current Circular Queue Size
    private int back; //position of Circular queue(new element enqueue).
    private int front; //front position of Circular queue(element will be dequeued from front).
    private int maxSize; //Circular Queue maximum size
    
    // Construct the queue.
    public ArrayQueueSirkuler_11S20018(int maxSize){
        this.maxSize = maxSize;
        array = (E[]) new Object[this.maxSize];
        queueSize=0;
        front = -1;
        back = -1;
    }
    
    public int size(){
        return (back + maxSize - front) % maxSize;
    }
    
    // Test if the queue is logically empty.
    public boolean isEmpty(){
        return queueSize == 0;
    }
    
    // Make the queue logically empty.
    public void clear(){
        queueSize = 0;
        front = 0;
        back = 0;
    }
    
    public boolean isFull(){
        return (back + 1) % maxSize == front;
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
        if(isFull()){
            throw new RuntimeException("Circular Queue is full. Element cannot be added");
        } else {
            back = (back + 1) % maxSize;
            array[back] = e;
            queueSize++;
            if (front == -1){
                front = back;
            }
        } 
    }
    
    // Return and remove the least recently inserted item from the queue.
    public E dequeue(){
        E temp;
        if (isEmpty()){
            throw new RuntimeException("ArrayQueue empty");
        } else {
            temp = array[front];
            array[front] = null;
            front = increment(front);
//            front = (front + 1) % array.length;
            queueSize--;
//            if (front == back){
//                front = -1;
//                back = -1;
//            } else {
//                front = (front + 1) % maxSize;
//            }
        }
        return temp;
    }
    
    // Get the least recently inserted item in the queue.
    // Does not alter the queue.
    public E getFront(){
        if (isEmpty()){
            throw new RuntimeException("ArrayQueue is empty");
        }
        return array[front];
    }
    
    public void print(){
        int i;
        for (i = front; i != back; i = (i + 1) % maxSize)
            System.out.print(array[i] + " ");
        System.out.println(array[i]);
    }
}