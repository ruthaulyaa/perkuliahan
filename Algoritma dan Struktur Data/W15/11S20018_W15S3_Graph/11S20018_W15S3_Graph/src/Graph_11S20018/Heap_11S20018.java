/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graph_11S20018;

/**
 *
 * @author 11S20018
 */

public class Heap_11S20018 implements PriorityQueue_11S20018{    
    
    private HeapNode_11S20018 root;
    private int Sizes;
    private HeapNode_11S20018[] Array = new HeapNode_11S20018[5];
    
    public Heap_11S20018(){
        root = null;
        Sizes = 0;
    }

    @Override
    public PriorityQueue_11S20018.Position insert(Comparable x){
        HeapNode_11S20018 newNode = new HeapNode_11S20018(x);

        if(root == null)
            root = newNode;
        else
            root = compareAndLink(root, newNode);     
        Sizes++;
        return newNode;
    }

    @Override
    public Comparable findMin(){    
        if( isEmpty( ) )
            System.out.println("Pairing heap is empty");       
        return root.element;
    }

    @Override
    public Comparable deleteMin(){
        if(isEmpty())
            System.out.println("Pairing heap is empty");
        Comparable x = findMin();
        if(root.leftChild == null)
            root = null;
        else
            root = combineSiblings(root.leftChild);
        Sizes--;
        return x;
    }

    @Override
    public void decreaseKey(PriorityQueue_11S20018.Position pos, Comparable newVal){
        if(pos == null)
            throw new IllegalArgumentException("null Position passed to decreaseKey");

        HeapNode_11S20018 p = (HeapNode_11S20018) pos;
        
        if(p.element.compareTo( newVal ) < 0)
            System.out.println( "newVal/oldval: " + newVal + " /" + p.element );
        
        p.element = newVal;
        if(p != root){
            
            if(p.nextSibling != null)
                p.nextSibling.prev = p.prev;
            if(p.prev.leftChild == p)
                p.prev.leftChild = p.nextSibling;
            else
                p.prev.nextSibling = p.nextSibling;

            p.nextSibling = null;
            root = compareAndLink(root, p);
        }
    }

    @Override
    public boolean isEmpty(){
        return root == null;
    }

    @Override
    public int size(){
        return Sizes;
    }

    @Override
    public void makeEmpty(){
        root = null;
        Sizes = 0;
    }
    
    private static class HeapNode_11S20018 implements PriorityQueue_11S20018.Position{
        public Comparable element;
        public HeapNode_11S20018 leftChild;
        public HeapNode_11S20018 nextSibling;
        public HeapNode_11S20018 prev;

        public HeapNode_11S20018(Comparable theElement){
            element     = theElement;
            leftChild   = null;
            nextSibling = null;
            prev        = null;
        }
        
        @Override
        public Comparable getValue(){
            return element;
        }  
    }

    private HeapNode_11S20018 compareAndLink(HeapNode_11S20018 first, HeapNode_11S20018 second){       
        if(second == null)
            return first;
        if(second.element.compareTo( first.element ) < 0){ 
            second.prev = first.prev;
            first.prev = second;
            first.nextSibling = second.leftChild;
            
            if( first.nextSibling != null )
                first.nextSibling.prev = first;
            second.leftChild = first;
            return second;
        }else{
            second.prev = first;
            first.nextSibling = second.nextSibling;
            if( first.nextSibling != null )
                first.nextSibling.prev = first;
            second.nextSibling = first.leftChild;
            if( second.nextSibling != null )
                second.nextSibling.prev = second;
            first.leftChild = second;
            return first;
        }
    }

    private HeapNode_11S20018[] doubleIfFull(HeapNode_11S20018 [] array, int index){
        if(index == array.length){
            HeapNode_11S20018[] oldArray = array;
            array = new HeapNode_11S20018[index * 2];
            for(int i = 0; i < index; i++)
                array[i] = oldArray[i];
        }
        return array;
    } 
    
    private HeapNode_11S20018 combineSiblings(HeapNode_11S20018 firstSibling){
        int numSiblings = 0;
        Array = doubleIfFull( Array, numSiblings );
        Array[ numSiblings ] = null;
        int i = 0;
        int j = i - 2;
    
        if( firstSibling.nextSibling == null )
            return firstSibling;
        for( ; firstSibling != null; numSiblings++){  
            Array = doubleIfFull(Array, numSiblings);
            Array[numSiblings] = firstSibling;
            firstSibling.prev.nextSibling = null;
            firstSibling = firstSibling.nextSibling;
        }
        for( ; i + 1 < numSiblings; i += 2)
            Array[ i ] = compareAndLink( Array[ i ], Array[ i + 1 ] );
        if(j == numSiblings - 3)
            Array[j] = compareAndLink(Array[j], Array[j + 2]);
        for( ; j >= 2; j -= 2)
            Array[j - 2] = compareAndLink(Array[j - 2], Array[j]);
        return Array[0];
    }
}