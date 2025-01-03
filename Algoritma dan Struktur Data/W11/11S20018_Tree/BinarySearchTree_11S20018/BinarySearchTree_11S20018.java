package BinarySearchTree_11S20018;

/**
 *
 * @author 11S20018
 * @param <AnyType>
 */
public class BinarySearchTree_11S20018<AnyType extends Comparable<? super AnyType>>{
    public BinarySearchTree_11S20018(){  
        root = null;
    } 
         
    public void insert(AnyType x){ 
        root = insert(x, root); 
    }
         
    public void remove(AnyType x){ 
        root = remove(x, root); 
    } 

    public void removeMin(){ 
        root = removeMin(root); 
    } 

    public AnyType findMin(){ 
        return elementAt(findMin(root)); 
    }
         
    public AnyType findMax(){ 
        return elementAt(findMax(root)); 
    } 
         
    public AnyType find(AnyType x){ 
        return elementAt(find(x, root)); 
    } 
         
    public void makeEmpty(){ 
        root = null; 
    } 
         
    public boolean isEmpty() {
        return root == null; 
    } 
         
    private AnyType elementAt(BinaryNode_11S20018<AnyType> t) { 
        return t == null ? null : t.element;
    } 
         
    private BinaryNode_11S20018<AnyType> find(AnyType x, BinaryNode_11S20018<AnyType> t){
        while(t != null){ 
            if(x.compareTo(t.element)< 0)
                t = t.left;
            else if(x.compareTo(t.element) > 0)
                t = t.right;  
            else  
                return t;    
        }         
        return null;     
    } 
         
    protected BinaryNode_11S20018<AnyType> findMin(BinaryNode_11S20018<AnyType> t){ 
        if(t != null) 
            while( t.left != null ) 
                t = t.left; 
                return t;  
    }  
         
    private BinaryNode_11S20018<AnyType> findMax(BinaryNode_11S20018<AnyType> t){ 
        if(t != null) 
            while(t.right != null) 
                 t = t.right; 
                return t;  
    } 
         
    protected BinaryNode_11S20018<AnyType> insert(AnyType x, BinaryNode_11S20018<AnyType> t){ 
        if(t == null)
            t = new BinaryNode_11S20018<>(x); 
        else if(x.compareTo(t.element) < 0) 
             t.left = insert(x, t.left); 
        else if( x.compareTo(t.element) > 0) 
            t.right = insert(x, t.right); 
        else 
            t = insert(x,t);
        return t; 
    } 
         
    protected BinaryNode_11S20018<AnyType> removeMin(BinaryNode_11S20018<AnyType> t){
        if(t == null){
            return null; 
        } else if(t.left != null){ 
            t.left = removeMin(t.left); 
            return t; 
        } else 
            return t.right; 
    } 
         
    protected BinaryNode_11S20018<AnyType> remove(AnyType x, BinaryNode_11S20018<AnyType> t){  
        if(t == null) 
            return null;
        if( x.compareTo(t.element) < 0)
             t.left = remove(x, t.left); 
        else if( x.compareTo(t.element) > 0) 
            t.right = remove(x, t.right); 
        else if( t.left != null && t.right != null){
            t.element = findMin(t.right).element; 
            t.right = removeMin(t.right); 
        } else 
            t = (t.left != null) ? t.left : t.right; 
        return t;  
    } 
       
    public void printInOrder(){ 
        if(root != null) 
            root.printInOrder( ); 
    } 
    
    protected BinaryNode_11S20018<AnyType> root;
}
