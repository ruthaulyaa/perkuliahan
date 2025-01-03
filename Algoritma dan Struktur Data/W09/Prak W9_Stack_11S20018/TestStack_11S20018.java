/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 11S20018
 */
public class TestStack_11S20018 {
    public static void main(String[] args){
        ArrayStack_11S20018<Integer> a = new ArrayStack_11S20018<>();

        a.push(8);
        a.push(10);
        a.push(7);
        a.print();
        a.pop();
        a.print();
        a.push(5);
        a.push(3);
        a.print();
        
        System.out.println(a.top());
        System.out.println(a.size());
        System.out.println(a.isEmpty());
        System.out.println(a.topAndPop());
        a.print();
        a.clear();
        
        System.out.println(a.isEmpty());
        a.print();
    }
}
