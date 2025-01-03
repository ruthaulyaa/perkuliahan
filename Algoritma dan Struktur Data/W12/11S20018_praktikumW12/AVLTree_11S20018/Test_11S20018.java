package AVLTree_11S20018;

/**
 * @author 11S20018
 */
public class Test_11S20018 {
    public static void main(String[] args){
        AVLTree_11S20018<Integer> at = new AVLTree_11S20018<>();
        
        at.insert(10);
        at.insert(85);
        at.insert(15);
        at.insert(70);
        at.insert(20);
        at.insert(60);
        at.insert(30);
        at.printTree();
        System.out.println(" ");
        
        at.remove(15);
        at.remove(10);
        at.printTree();
        System.out.println(" ");
        
        at.insert(50);
        at.insert(65);
        at.insert(80);
        at.printTree();
        System.out.println(" ");
        
        at.remove(20);
        at.remove(60);
        at.printTree();
        System.out.println(" ");
        
        at.insert(90);
        at.insert(40);
        at.insert(5);
        at.insert(55);
        at.printTree();
        System.out.println(" ");
        
        at.remove(70);
        at.printTree();
        System.out.println(" ");
        
        System.out.println("Nilai minimum pada AVL Tree: " + at.findMin());	
        System.out.println("Nilai maksimum pada AVL Tree: " + at.findMax());	
        System.out.println("Mencari 42 pada AVL Tree: " + at.contains(42));		
        System.out.println("Cek apakah tree kosong: " + at.isEmpty());
        
        System.out.println("PrintInOrder: ");
        at.printInOrder();
        System.out.println(" ");
        
        System.out.println("PrintPostOder: ");
        at.printPostOrder();
        System.out.println(" ");
        
        System.out.println("PrintPreOder: ");
        at.printPreOrder();
        System.out.println(" ");
        
        at.makeEmpty();
        System.out.println("Hasil tree setelah makeEmpty: " + at.isEmpty());
	
    }
}
