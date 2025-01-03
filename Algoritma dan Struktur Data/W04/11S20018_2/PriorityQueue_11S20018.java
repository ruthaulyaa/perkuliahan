import java.util.*;

class PriorityQueue_11S20018{

    static void add(Queue priority, int a){
      priority.add(new Integer(a));
      System.out.println("add(" + a + ")");
      System.out.println("Priority Queue: " + priority);
      System.out.println("");
   }

   static void remove(Queue priority){
      System.out.print("remove -> ");
      Integer a = (Integer) priority.remove();
      System.out.println(a);
      System.out.println("Priority Queue: " + priority);
      System.out.println("");
   }

    public static void main(String args[]){
        PriorityQueue<Integer> priority = new PriorityQueue<Integer>();

        System.out.println(priority);
        System.out.println("");
        
        add(priority, 4);
        add(priority, 8);
        add(priority, 1);
        add(priority, 6);

        remove(priority);
        remove(priority);
    }
}