/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_2_v2;

/**
 *
 * @author 11S20018
 */
import java.util.*;

public class Driver {
    //Define the main() method.
    public static void main(String args[]){
	//Call the method to print the scanner
	// input in reverse order.
	Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        String inputString = sc.nextLine();
        
        String[] input = inputString.split(" ");
        
        List<String> reverseInput = Arrays.asList(input);
        Collections.reverse(reverseInput);
        
        Iterator itr = reverseInput.iterator();
        
        while (itr.hasNext()){
            System.out.print(itr.next()+ " ");
        }
    }
}
