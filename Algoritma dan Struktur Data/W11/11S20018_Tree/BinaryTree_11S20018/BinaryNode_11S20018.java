package BinaryTree_11S20018;

/**
 *
 * @author 11S20018
 * @param <AnyType>
 */
public class BinaryNode_11S20018<AnyType> {
    public BinaryNode_11S20018(){ 
        this(null, null, null); 
    } 
         
    public BinaryNode_11S20018(AnyType theElement,BinaryNode_11S20018<AnyType> lt,BinaryNode_11S20018<AnyType> rt){ 
        element = theElement; left = lt; right = rt; 
    } 
         
    public AnyType getElement(){
        return element; 
    }
         
    public BinaryNode_11S20018<AnyType> getLeft(){ 
        return left; 
    } 
         
    public BinaryNode_11S20018<AnyType> getRight(){ 
        return right; 
    } 
         
    public void setElement(AnyType x){ 
        element = x; 
    } 

    public void setLeft(BinaryNode_11S20018<AnyType> t){ 
        left = t; 
    } 
         
    public void setRight(BinaryNode_11S20018<AnyType> t){ 
        right = t; 
    } 
         
    public static <AnyType> int size(BinaryNode_11S20018<AnyType> t){
        if(t == null) 
            return 0; 
        else 
            return 1 + size( t.left ) + size(t.right); 
    } 
         
    public static <AnyType> int height(BinaryNode_11S20018<AnyType> t){
        if( t == null ) 
            return -1; 
        else 
            return 1 + Math.max(height(t.left), height(t.right)); 
    } 
         
    public BinaryNode_11S20018<AnyType> duplicate(){
        BinaryNode_11S20018<AnyType> root = new BinaryNode_11S20018<AnyType>(element, null, null); 
        if(left != null)           
            root.left = left.duplicate();    
        if(right != null)         
            root.right = right.duplicate(); 
        return root;                      
    }
         
    public void printPreOrder(){   
        System.out.println(element);
        if(left != null ) 
            left.printPreOrder();   
        if(right != null) 
            right.printPreOrder();         
    } 
         
    public void printPostOrder(){ 
        if(left != null)                   
            left.printPostOrder();
        if(right != null)                  
            right.printPostOrder(); 
        System.out.println(element);       
    } 

    public void printInOrder(){ 
        if(left != null)                   
            left.printInOrder(); 
        System.out.println(element);       
        if(right != null)  
            right.printInOrder();           
    } 
         
    private AnyType element; 
    private BinaryNode_11S20018<AnyType> left;     
    private BinaryNode_11S20018<AnyType> right; 
}
