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
public class ListQueue_11S20018<E> implements Queue_11S20018<E>{
    private ListNode_11S20018<E> front;
    private ListNode_11S20018<E> back;
    private int queueSize;

    // Contruct the queue.
    public ListQueue_11S20018(){
        clear();
    }

    // Return the size of the queue.
    public int size(){
        return queueSize;
    }
    
    // Test if the queue is logically empty.
    public boolean isEmpty(){
        return front == null;
    }
    
    // Make the queue logically empty.
    public void clear(){
        front = null;
        back = null;
        queueSize = 0;
    }
    
    // Insert a new item into the queue.
    public void Enqueue(E e){
        if(isEmpty()){
            front = new ListNode_11S20018(e);
            back = front;
            queueSize++;
        }
        else{
            back.next = new ListNode_11S20018(e);
            back = back.next;
            queueSize++;
        }
    }
    
    // Return and remove the least recently inserted item from the queue.
    public E dequeue(){
        if (isEmpty()){
            throw new RuntimeException("ListQueue is empty");
        } else{
            ListNode_11S20018 temp = front;
            front = front.next;
            if(isEmpty()){
                back = null;
            }
            E item = (E) temp.element;
            queueSize--;
            return item;
        }
    }
    
    // Get the least recently inserted item in the queue.
    // Does not alter the queue.
    public E getFront(){
        if (isEmpty())
            throw new RuntimeException("ListQueue is empty");
        return front.element;
    }
    
    void print(){
        ListNode_11S20018 r = front;
        while (r.element != null){
            System.out.print(r.element + " ");
            if(r.next == null){
                break;
            }
            r = r.next;
        }
        System.out.println();
    }
}
