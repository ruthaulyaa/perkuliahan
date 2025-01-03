/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hash_11S20018;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author 11S20018
 */

public class TestHash_11S20018 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        
        System.out.println("=================***====================");
        System.out.println("Dilakukan uji Method pada Class HashSet");
        System.out.println("=================***====================");
        
        //dilakukan uji konstruktor HashSet tanpa parameter hset0
        HashSet_11S20018<Integer> hset0 = new HashSet_11S20018<Integer>();
        
        //dilakukan uji konstruktor HashSet dengan satu parameter (java collection) hset1
        HashSet_11S20018<Integer> hset1 = new HashSet_11S20018<Integer>(arr);

        System.out.print("dilakukan uji method size() hset0: ");
        System.out.println(hset0.size());
        System.out.println(" ");
        
        System.out.print("dilakukan uji method size() hset1: ");
        System.out.println(hset1.size());
        System.out.println(" ");

        System.out.print("dilakukan uji method iterator() hset1: ");
        Iterator<Integer> itr = hset1.iterator();
        while(itr.hasNext()){
            System.out.println(" " + itr.next() + " ");
        }
        System.out.println(" ");

        System.out.print("dilakukan uji method contains(2) hset1: ");
        System.out.println(hset1.contains(2));
        System.out.println(" ");

        System.out.print("dilakukan uji method contains(100) hset1: ");
        System.out.println(hset1.contains(100));
        System.out.println(" ");
          
        System.out.print("dilakukan uji method getMatch(1) hset1: ");
        System.out.println(hset1.getMatch(1));
        System.out.println(" ");

        System.out.print("dilakukan uji method remove(5) hset1: ");
        System.out.println(hset1.remove(5));
        System.out.println(" ");

        System.out.print("dilakukan uji method add(100) hset0: ");
        System.out.println(hset0.add(100));
        System.out.println(" ");
        
        System.out.print("dilakukan uji method contains(100) hset0: ");
        System.out.println(hset0.contains(100));
        System.out.println(" ");

        System.out.print("dilakukan uji method iterator() hset0: ");
        itr = hset0.iterator();
        while(itr.hasNext()){
            System.out.println(" " + itr.next() + " ");
        }
        System.out.println(" ");

        System.out.print("dilakukan uji method clear() hset0: ");
        hset0.clear();
        System.out.println(" ");System.out.println(" ");


        System.out.println("=================***====================");
        System.out.println("dilakukan uji Method pada Class HashMap");
        System.out.println("=================***====================");

        //dilakukan uji konstruktor HashMap tanpa parameter hmap0
        HashMap_11S20018<Integer, String> hmap0 = new HashMap_11S20018<Integer, String>();
        
        
        //dilakukan uji konstruktor HashMap dengan satu parameter (java map) hmap1
        Map<Integer, String> map = new HashMap_11S20018<Integer, String>();
        map.put(1,"Telletubbies");  
        map.put(2,"Tinky Winky");  
        map.put(3,"Dipsy");  
        map.put(5,"Lala"); 
        map.put(6,"Poo"); 
        
        HashMap_11S20018<Integer, String> hmap1 = new HashMap_11S20018<Integer, String>(map);
        System.out.println("");

        System.out.print("dilakukan uji method size() hmap0: ");
        System.out.println(hmap0.size());
        System.out.println(" ");

        System.out.print("dilakukan uji method size() hmap1: ");
        System.out.println(hmap1.size());
        System.out.println(" ");

        System.out.print("dilakukan uji method isEmpty() hmap0: ");
        System.out.println(hmap0.isEmpty());
        System.out.println(" ");

        System.out.print("dilakukan uji method containsKey(4) hmap1: ");
        System.out.println(hmap1.containsKey(4));
        System.out.println(" ");
        
        System.out.print("dilakukan uji method containsKey(1) hmap1: ");
        System.out.println(hmap1.containsKey(1));
        System.out.println(" ");

        System.out.print("dilakukan uji method clear() hmap0: ");
        hmap0.clear();
        System.out.println(" ");System.out.println(" ");

        System.out.print("dilakukan uji method toString() hmap1: ");
        System.out.println(hmap1.toString());
        System.out.println(" ");

        System.out.print("dilakukan uji method get(5) hmap1: ");
        System.out.println(hmap1.get(5));
        System.out.println(" ");

        System.out.print("dilakukan uji method put(7, Bayi Matahari) hmap1: ");
        System.out.println(hmap1.put(7, "Bayi Matahari"));
        System.out.println("");

        System.out.print("dilakukan uji method toString() hmap1: ");
        System.out.println(hmap1.toString());
        System.out.println(" ");

        System.out.print("dilakukan uji method remove(7) hmap1: ");
        System.out.println(hmap1.remove(7));
        System.out.println(" ");

        System.out.print("dilakukan uji method toString() hmap1: ");
        System.out.println(hmap1.toString());
        System.out.println(" ");
    }
}