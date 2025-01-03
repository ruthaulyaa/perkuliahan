/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
//Class QueueTester
public class QueueTester{
	//Driver
	public static void main(String[] args){
		//Create a new instance for ArrayQueue
		ArrayQueue AQ = new ArrayQueue();
		//Create a new instance for Scanner
		Scanner scObj = new Scanner(System.in);
		//Declare the needed variables
		char character;
		int number;
		
		//Loop

		do{
			//Menu
			System.out.print("\n----------------");
			System.out.println("\nQueue Operations");
			System.out.println("----------------");
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Get Front");
			System.out.println("4. Display Queue");
			//Read input
			int userChoice = scObj.nextInt();
			//Switch case
			switch (userChoice){
				//Case - enqueue
				case 1 :
					//Prompt for number of inputs
					System.out.print("\nEnter number of inputs: ");
					//Read number of inputs
					number = scObj.nextInt();
					//Prompt for input
					System.out.println("\nEnter data for insertion:");
					//Loop
					for (int j = 0; j < number; j++)
					/*Read input and call function*/
					AQ.enqueue(scObj.next());
					//End of case - enqueue
				break;
				//Case - dequeue
				case 2 :
					//Call function
					AQ.remove();
					//Display
					System.out.println("\nData successfully deleted");
					//End of case dequeue
				break;
				//Case - get front
				case 3 :
					//Call function and display result
					System.out.println("\nQueue front is "+ AQ.element());
					//End of case - get front
				break;
				//Case - display queue
				case 4 :
					//Print newline
					System.out.println();
					/*Create a new instance for Iterator*/
					Iterator iter = AQ.iterator();
					//Loop
					while(iter.hasNext())
					//Display
					System.out.print(iter.next() + " ");
					//Print newline
					System.out.println();
					//End of case - display queue
				break;
				//Default case
				default :
					//Display
					System.out.println("\nInvalid entry");
					//End of default case
				break;
			}

			//Prompt for input
			System.out.print("\nDo you want to continue (Type y or n): ");
			//Read input character
			character = scObj.next().charAt(0);
		}
		//End of loop
		while (character == 'Y'|| character == 'y');
			//Close scanner
			scObj.close();
	}
}
