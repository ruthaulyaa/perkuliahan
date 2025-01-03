package BinaryTree_11S20018;

/**
 *
 * @author 11S20018
 * @param <AnyType>
 */
public class BinaryTree_11S20018<AnyType>{
    public BinaryTree_11S20018(){
        root = null; 
    } 

    public BinaryTree_11S20018(AnyType rootItem){ 
        root = new BinaryNode_11S20018<>(rootItem, null, null); 
    } 

    public BinaryNode_11S20018<AnyType> getRoot(){ 
        return root ; 
    } 

    public int size(){ 
        return BinaryNode_11S20018.size(root); 
    } 

    public int height(){ 
        return BinaryNode_11S20018.height( root ); 
    } 

    public void printPreOrder(){ 
        if(root != null) 
            root.printPreOrder(); 
    } 

    public void printInOrder(){ 
        if(root != null) 
            root.printInOrder(); 
    } 

    public void printPostOrder(){ 
        if(root != null) 
            root.printPostOrder(); 
    } 

    public void makeEmpty(){ 
        root = null; 
    } 

    public boolean isEmpty(){ 
        return root == null; 
    } 

    public void merge(AnyType rootItem, BinaryTree_11S20018<AnyType> t1, BinaryTree_11S20018<AnyType> t2){ 
        if(t1.root == t2.root && t1.root != null)
            throw new IllegalArgumentException(); 
     
        root = new BinaryNode_11S20018<>( rootItem, t1.root, t2.root );  
     
        if( this != t1 ) 
            t1.root = null; 
        if( this != t2 ) 
            t2.root = null; 
    } 
    private BinaryNode_11S20018<AnyType> root;
}
