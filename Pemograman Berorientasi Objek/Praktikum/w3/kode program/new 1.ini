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
		
				
		/*write code to get the first integer and store it in variabel largest */
		System.out.print("Enter Number: ");
		largest = input.nextInt();
		/* write code to initialize the number of integers entered */
		counter=10;
		/* write code to prompt the user to enter a number and read that number */
		while(counter < 10){
			System.out.print("Enter number: ");
			number = input.nextInt();
		
		/* write code to test wheter the number entered is greater than the largest
			if so, replace the value of largest with the entered number */
		if(number > largest)
			largest = number;
		/* write code to increment the number of integers entered */
		counter++;	
		}
		System.out.printf("\nLargest number is %d\n", largest);
	}//end method determineLargest
	public static void main(String[] args){
		determineLargest();
	}
}//end class Largest