/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queueSirkuler_11S20018;

/**
 *
 * @author 11S20018
 */
public class TestQueueC_11S20018 {
    public static void main (String[] args){
        ArrayQueueSirkuler_11S20018<Integer> cq = new ArrayQueueSirkuler_11S20018<>(8);        
        cq.Enqueue(8);
        cq.Enqueue(7);
        cq.Enqueue(5);
        cq.dequeue();
        cq.print();
        cq.Enqueue(11);
        cq.dequeue();
        cq.print();
        cq.Enqueue(15);
        cq.print();
        cq.clear();
        System.out.println(cq.isEmpty());
        cq.Enqueue(2);
        cq.print();
    }
}
