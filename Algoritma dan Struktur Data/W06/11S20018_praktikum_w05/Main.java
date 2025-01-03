/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_2;

/**
 *
 * @author 11S20018
 */
/*tanpa menggunakan Collections API*/
import java.util.*;
public class Main {
    public static void printReverse(Scanner in){
	//Store the scanner input.
	String x = in.nextLine();
	//Call the method recursively if the
	// user enters any string.
	if(x.length()>0){
            printReverse(in);
            //Print the string.
            System.out.println(x);
	}
	//Otherwise, close the scanner object.
	else{
            in.close();
            return;
	}
    }
    //Define the main() method.
    public static void main(String args[]){
	//Call the method to print the scanner
	// input in reverse order.
	printReverse(new Scanner(System.in));
    }
}
