package BinarySearchTree_11S20018;

/**
 *
 * @author 11S20018
 */
public class TestBinarySearchTree_11S20018 {
    public static void main(String[] args){
        BinarySearchTree_11S20018 st = new BinarySearchTree_11S20018();
    
        st.insert(40);
        st.insert(10);
        st.insert(60);
        st.insert(80);
        st.insert(22);
        st.insert(18);
        st.insert(73);
      
        
        st.remove(40);
        st.removeMin();
        System.out.println("Max : " +st.findMax());
        System.out.println("Min :" +st.findMin());
        System.out.println(st.find(80));
        st.makeEmpty();
        
        System.out.println(st.isEmpty());
        st.printInOrder();
    }
}
