package BinaryTree_11S20018;

/**
 *
 * @author 11S20018
 */
public class TestBinaryTree_11S20018 {
    public static void main(String[] args){
        BinaryTree_11S20018 t1 = new BinaryTree_11S20018();
        BinaryTree_11S20018 t2 = new BinaryTree_11S20018(12);
        BinaryTree_11S20018 t3 = new BinaryTree_11S20018(10);
        BinaryTree_11S20018 t4 = new BinaryTree_11S20018();
        BinaryTree_11S20018 t5 = new BinaryTree_11S20018();
        BinaryTree_11S20018 t6 = new BinaryTree_11S20018(32);
        BinaryTree_11S20018 t7 = new BinaryTree_11S20018(50);
        BinaryTree_11S20018 t8 = new BinaryTree_11S20018(15);
        t1.merge(18, t2, t3);
        t4.merge(34, t6, t7);
       
        t5.merge(25, t1,t4);
        t5.makeEmpty();
        System.out.println(t5.isEmpty());
        t5.printPreOrder();
        t5.printInOrder();
        t5.printPostOrder();
        System.out.println("Size = " +t5.size());
        System.out.println("Height= " +t5.height());
        System.out.println("Root =" +t5.getRoot().getElement());
    }
}
