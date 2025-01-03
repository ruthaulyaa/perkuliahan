package BinarySearchTree_11S20018;

/**
 *
 * @author 11S20018
 * @param <AnyType>
 */
public class BinaryNode_11S20018<AnyType>{
    BinaryNode_11S20018(AnyType theElement){ 
        element = theElement; 
        left = right = null;     
    }  
    
    public void printInOrder(){ 
        if(left != null)                   
            left.printInOrder(); 
        System.out.println(element);       
        if(right != null)  
            right.printInOrder();           
    } 
     
    AnyType element;  
    BinaryNode_11S20018<AnyType> left;     
    BinaryNode_11S20018<AnyType> right;
}
