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
public interface Queue_11S20018<E> {
    int size();
    boolean isEmpty();
    void clear();
    void Enqueue(E e);
    E dequeue();
    E getFront();
}
