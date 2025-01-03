/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 11S20018
 */
public interface Stack_11S20018<E> {
    int size();
    boolean isEmpty();
    void clear();
    void push(E e);
    E top();
    void pop();
    E topAndPop();
    void print();
}
