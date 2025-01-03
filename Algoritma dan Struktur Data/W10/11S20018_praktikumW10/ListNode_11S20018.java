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
public class ListNode_11S20018<E> {
    E element;
    ListNode_11S20018<E> next;
    
    public ListNode_11S20018(E element, ListNode_11S20018<E> next){
        element = element;
        next = next;
    }
    
    public ListNode_11S20018(E element){
        this(element, null);
    }
    
    public ListNode_11S20018(){
        this(null, null);
    }
}
