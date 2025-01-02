//Latihan_3: Largest.java
//Program determines and prints the largest of ten numbers
//package praktikum3;
import java.util.Scanner;

public class Largest{
	//determine the largest of 10 numbers
	public static void determineLargest(){
		Scanner input = new Scanner (System.in);
	
		int largest=0; //largest numbers
		int number=0; //user input
		int counter=0; //number of values entered
		
				
		while(counter < 10){
			System.out.print("Enter number: ");
			number = input.nextInt();
		if(number > largest)
			largest = number;
		counter++;	
		}
		System.out.printf("\nLargest number is %d\n", largest);
	}//end method determineLargest
	public static void main(String[] args){
		determineLargest();
	}
}//end class Largest