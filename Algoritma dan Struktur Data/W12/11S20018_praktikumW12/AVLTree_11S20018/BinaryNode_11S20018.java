package AVLTree_11S20018;

/**
 *
 * @author 11S20018
 * @param <A>
 */
public class BinaryNode_11S20018<A>{
    // Constructor
    BinaryNode_11S20018(A theElement){
        element = theElement;
        left = right = null;
    }
    
    // Data; accessible by other package routines
    A element; // The data in the node
    BinaryNode_11S20018<A> left; // Left child
    BinaryNode_11S20018<A> right; // Right child
    
    public void printInOrder(){ 
        if(left != null)                   
            left.printInOrder(); 
        System.out.println(element);       
        if(right != null)  
            right.printInOrder();           
    } 
}
