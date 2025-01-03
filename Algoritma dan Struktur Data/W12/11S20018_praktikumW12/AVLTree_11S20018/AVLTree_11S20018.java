package AVLTree_11S20018;
import java.util.NoSuchElementException;

/**
 *
 * @author 11S20018
 * @param <A>
 */

public class AVLTree_11S20018<A extends Comparable<A>>{
    //The tree root
    private AVLNode_11S20018<A> root;
    
    public AVLTree_11S20018(){
        root = null;
    }

    public void insert(A x){
        root = insert(x, root);
    }

    public void remove(A x){
        root = remove(x, root);
    }

    protected AVLNode_11S20018<A> remove(A x, AVLNode_11S20018<A> t){
        if( t == null )
            return t;   // Item not found; do nothing 
        int compareResult = x.compareTo( t.element ); 
        if( compareResult < 0 )
            t.left = remove( x, t.left );
        else if( compareResult > 0 )
            t.right = remove( x, t.right );
        else if( t.left != null && t.right != null ){// Two children
            t.element = findMin( t.right ).element;
            t.right = remove( t.element, t.right );
        } else
            t = ( t.left != null ) ? t.left : t.right;
        return balance( t );
    }

    public A findMin(){
        if( isEmpty( ) )
            throw new NoSuchElementException();//new UnderflowException( );
        return findMin( root ).element;
    }

    public A findMax(){
        if( isEmpty( ) )
            throw new NoSuchElementException();//new UnderflowException( );
        return findMax(root).element;
    }

    public boolean contains(A x){
        return contains(x, root);
    }

    public void makeEmpty(){
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void printTree(){
        if( isEmpty())
            System.out.println("Empty tree");
        else
            printTree(root);
    }

    private static final int ALLOWED_IMBALANCE = 1;
    
    private AVLNode_11S20018<A> balance(AVLNode_11S20018<A> t){
        if(t == null)
            return t;
        
        if(height(t.left) - height(t.right) > ALLOWED_IMBALANCE)
            if( height(t.left.left) >= height(t.left.right))
                t = rotateWithLeftChild(t);
            else
                t = doubleWithLeftChild(t);
        else
        if( height( t.right ) - height(t.left) > ALLOWED_IMBALANCE)
            if(height( t.right.right ) >= height( t.right.left))
                t = rotateWithRightChild(t);
            else
                t = doubleWithRightChild(t);

        t.height = Math.max(height(t.left), height(t.right)) + 1;
        return t;
    }
    
    public void checkBalance(){
        checkBalance(root);
    }
    
    private int checkBalance(AVLNode_11S20018<A> t){
        if(t == null)
            return -1;
        
        if(t != null){
            int hl = checkBalance(t.left);
            int hr = checkBalance(t.right);
            if(Math.abs(height(t.left) - height(t.right)) > 1 ||
                    height(t.left) != hl || height(t.right) != hr)
                System.out.println("OOPS!!");
        }
        
        return height(t);
    }
    
    private AVLNode_11S20018<A> insert(A x, AVLNode_11S20018<A> t){
        if(t == null)
            return new AVLNode_11S20018<>(x, null, null);
        
        int compareResult = x.compareTo(t.element);
        
        if(compareResult < 0)
            t.left = insert(x, t.left);
        else if(compareResult > 0)
            t.right = insert(x, t.right);
        else
            ;  // Duplicate; do nothing
        return balance(t);
    }

    private AVLNode_11S20018<A> findMin(AVLNode_11S20018<A> t){
        if(t == null)
            return t;

        while(t.left != null)
            t = t.left;
        return t;
    }

    private AVLNode_11S20018<A> findMax(AVLNode_11S20018<A> t){
        if(t == null)
            return t;

        while(t.right != null)
            t = t.right;
        return t;
    }

    private boolean contains(A x, AVLNode_11S20018<A> t){
        while(t != null){
            int compareResult = x.compareTo(t.element);
            
            if(compareResult < 0)
                t = t.left;
            else if(compareResult > 0)
                t = t.right;
            else
                return true;    // Match
        }
        return false;   // No match
    }

    private void printTree(AVLNode_11S20018<A> t){
        if(t != null){
            printTree(t.left);
            System.out.println(t.element + " "); 
            printTree(t.right);
        }
    }

    private int height(AVLNode_11S20018<A> t){
        return t == null ? -1 : t.height;
    }

    private AVLNode_11S20018<A> rotateWithLeftChild(AVLNode_11S20018<A> k2){
        AVLNode_11S20018<A> k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        k2.height = Math.max(height(k2.left), height(k2.right)) + 1;
        k1.height = Math.max(height(k1.left), k2.height) + 1;
        return k1;
    }

    private AVLNode_11S20018<A> rotateWithRightChild(AVLNode_11S20018<A> k1){
        AVLNode_11S20018<A> k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;
        k1.height = Math.max(height(k1.left), height(k1.right)) + 1;
        k2.height = Math.max(height(k2.right), k1.height) + 1;
        return k2;
    }

    private AVLNode_11S20018<A> doubleWithLeftChild(AVLNode_11S20018<A> k3){
        k3.left = rotateWithRightChild(k3.left);
        return rotateWithLeftChild(k3);
    }

    private AVLNode_11S20018<A> doubleWithRightChild(AVLNode_11S20018<A> k1){
        k1.right = rotateWithLeftChild(k1.right);
        return rotateWithRightChild(k1);
    }
    
    public void printInOrder(){ 
        printInOrder(root); 
    }
    
    private void printInOrder(AVLNode_11S20018 r){
        if(r != null){
            printInOrder(r.left);
            System.out.print(r.element+" ");
            printInOrder(r.right);
        }
    }
    
    public void printPreOrder(){
        printPreOrder(root);
    }
    
    private void printPreOrder(AVLNode_11S20018 r){
        if(r != null){
            System.out.print(r.element+" ");
            printPreOrder(r.left);
            printPreOrder(r.right);
        }
    }
    
    public void printPostOrder(){
        printPostOrder(root);
    }
    
    private void printPostOrder(AVLNode_11S20018 r){
        if(r !=null){
            printPostOrder(r.left);
            printPostOrder(r.right);
            System.out.print(r.element+" ");
        }
    }

    private static class AVLNode_11S20018<A>{
            // Constructors
        AVLNode_11S20018(A theElement){
            this(theElement, null, null );
        }

        AVLNode_11S20018(A theElement, AVLNode_11S20018<A> kiri, 
                AVLNode_11S20018<A> kanan){
            element  = theElement;
            left     = kiri;
            right    = kanan;
            height   = 0;
        }

        A element;  // The data in the node
        AVLNode_11S20018<A>  left; // Left child
        AVLNode_11S20018<A>  right; // Right child
        int height; // Height
    }      
}
