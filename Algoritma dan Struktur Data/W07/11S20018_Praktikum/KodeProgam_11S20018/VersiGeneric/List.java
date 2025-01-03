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
public interface List<T> {
    public T getX();
    public void setX(T newY);
    public boolean contains(ListNode o);
}
