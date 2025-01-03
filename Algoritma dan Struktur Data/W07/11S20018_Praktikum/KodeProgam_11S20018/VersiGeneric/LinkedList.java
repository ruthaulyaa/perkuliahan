/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VersiGeneric;

/**
 *
 * @author 11S20018
 * @param <T>
 * 
 */
public class LinkedList<T extends Comparable> implements List<T>{
    private T x;
    private T y;
    
    public LinkedList(T newX, T newY){
        x = newX;
        y = newY;
    }
    
    public T getX(){
        return x;
    }
    
    public void setX(T newY){
        x = newY;
    }
    
    public boolean contains(T o){
        if(x.compareTo(o)==0 || y.compareTo(o)==0){
            return true;
        }
        return false;
    }
}
