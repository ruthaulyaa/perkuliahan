/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public interface Iterator<AnyType> {
    //Method hasNext()
    boolean hasNext();
    //Method next
    AnyType next();
    //Method remove
    void remove();
}
