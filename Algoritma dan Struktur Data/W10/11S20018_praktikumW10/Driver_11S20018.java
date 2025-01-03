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
public class Driver_11S20018 {
    public static void main(String[] args){
//        //Tes Array Queue
//        ArrayQueue_11S20018<Integer> AQ_018 = new  ArrayQueue_11S20018<>();
//        AQ_018.Enqueue(10);
//        AQ_018.Enqueue(4);
//        AQ_018.Enqueue(20);
//        AQ_018.Enqueue(18);
//        AQ_018.Enqueue(2);
//        AQ_018.print();
//        AQ_018.Enqueue(13);
//        AQ_018.print();
//        AQ_018.dequeue();
//        AQ_018.dequeue();
//        AQ_018.print();
//        AQ_018.Enqueue(19);
//        AQ_018.print();
        
        //Tes List Queue
        ListQueue_11S20018<Integer> LQ_018 = new  ListQueue_11S20018<>();
        LQ_018.Enqueue(10);
        LQ_018.Enqueue(4);
        LQ_018.Enqueue(20);
        LQ_018.Enqueue(18);
        LQ_018.Enqueue(2);
        LQ_018.print();
        LQ_018.Enqueue(13);
        LQ_018.print();
        LQ_018.dequeue();
        LQ_018.dequeue();
        LQ_018.print();
        LQ_018.Enqueue(19);
        LQ_018.print();
    }
}
