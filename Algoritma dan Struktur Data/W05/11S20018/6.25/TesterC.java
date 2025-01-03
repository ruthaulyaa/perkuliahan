/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortedset;

/**
 *
 * @author ASUS
 */
import java.util.SortedSet;

import java.util.TreeSet;

import java.util.Scanner;

//Class

public class TesterC{
	//Method main()
	public static void main( String [] args){
		//Declare a variable for data to be added
		String data = null;
		//Declare a variable for data to be removed
		String dataRemove = null;

		//Create a new SortedSet
		SortedSet s = new TreeSet();
		//Create a new Scanner
		Scanner scan = new Scanner (System.in);

		//Prompt the user for number of data
		System.out.print("\nEnter number of data: ");
		//Read number of data
		int number = scan.nextInt();
		//Prompt for data
		System.out.println("\nEnter data: ");
		//Read data
		data = scan.nextLine();

		//Loop to iterate and add data

		for(int index = 0; index<number ;index++){
                    //Read data
                    data = scan.nextLine();
                    //Add data
                    s.add(data);
                }

		//Display SortedSet
		System.out.println("\nSorted Set after inserting all data: " + s);
		//Prompt for a data to be removed
		System.out.print("\nEnter a data to remove: ");
		//Read a data
		dataRemove = scan.nextLine();
		//Remove data
		s.remove(dataRemove);
		
		//Display SortedSet
		System.out.println("\nSorted Set after deleting a data: " + s);
		//Prompt for a data to be removed
		System.out.print("\nEnter a data to remove: ");
		//Read a data
		dataRemove = scan.nextLine();
		//Remove data
		s.remove(dataRemove);
		
		//Display SortedSet
		System.out.println("\nSorted Set after deleting a data: " + s);
		
		//Close Scanner
		scan.close();
	}
}