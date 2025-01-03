package AVLTree_11S20018;

/**
 *
 * @author 11S20018
 * @param <A>
 */
public class AVLNode_11S20018<A extends Comparable<A>> extends BinaryNode_11S20018<A>{
    //Friendly data; accessible by other package routines
    A element; //The data in the node
    AVLNode_11S20018<A> left; // Left child
    AVLNode_11S20018<A> right; // Right child
    int height; // Height
    
    // Constructors
    AVLNode_11S20018(A theElement){ 
        this(theElement, null, null);
    }
    
    AVLNode_11S20018(A theElement, AVLNode_11S20018<A> lt, AVLNode_11S20018<A> rt){
        element = theElement;
        left = lt;
        right = rt;
        height = 0;
    }
    
    public int height(AVLNode_11S20018<A> t){
        return t.height;
    }
}
