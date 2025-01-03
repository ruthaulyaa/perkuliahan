package BinaryTree_11S20018;

/**
 *
 * @author 11S20018
 */
public class TestBinaryNode_11S20018 {
    public static void main(String[] args){
        BinaryNode_11S20018 n1 = new BinaryNode_11S20018(10,null,null);
        BinaryNode_11S20018 n2 = new BinaryNode_11S20018(5,null,null);
        BinaryNode_11S20018 n3 = new BinaryNode_11S20018(7,n1,n2);
        BinaryNode_11S20018 n4 = new BinaryNode_11S20018(9,null,null);
        BinaryNode_11S20018 n5 = new BinaryNode_11S20018(1,null,null);
        BinaryNode_11S20018 n6 = new BinaryNode_11S20018(4,n4,n5);
        BinaryNode_11S20018 n7 = new BinaryNode_11S20018(6,n3,n6);
        BinaryNode_11S20018 n8 = new BinaryNode_11S20018(8,null,null);
        n3.setElement(15);
        System.out.println(n3.getElement());
        n3.setLeft(n8);
        n3.setRight(n8);
        
        n3.printPreOrder();
        
        System.out.println(n1.getElement());
        BinaryNode_11S20018 n9 = n7.duplicate();
        n9.printPreOrder();
        n6.printPostOrder();
        n6.printInOrder();
        System.out.println(n2.getLeft());
        System.out.println(n1.getRight());
    }
}
