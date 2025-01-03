/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Graph_11S20018;

/**
 *
 * @author 11S20018
 */

public interface PriorityQueue_11S20018 {
    public interface Position{
        Comparable getValue();
    }

    Position insert(Comparable x);
    Comparable findMin();
    Comparable deleteMin();
    boolean isEmpty();
    void makeEmpty();
    int size();
    void decreaseKey(Position p, Comparable newVal);
}