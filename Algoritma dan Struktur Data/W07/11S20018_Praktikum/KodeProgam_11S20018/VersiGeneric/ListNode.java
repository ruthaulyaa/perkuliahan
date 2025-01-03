/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VersiGeneric;

/**
 *
 * @author 11S20018
 */
public class ListNode implements Comparable<ListNode>{
    private int x;
    private int y;
    
    public ListNode(int newX, int newY){
        x = newX;
        y = newY; 
    }
    
    @Override
    public String toString(){
        return "x:"+x+","+"y:"+y;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    @Override
    public int compareTo(ListNode o){
        if(x==o.getX()&&y==o.getY())
            return 1;
        return 0;
    }
}
