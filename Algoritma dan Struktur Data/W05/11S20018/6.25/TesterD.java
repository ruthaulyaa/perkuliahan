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
public class TesterD{
	//Method main()
	public static void main( String [] args){
            //Declare a variable for data to be added
            String dataToAdd = null;
            //Declare a variable for data to be removed
            String dataToRemove = null;

            //Create a new SortedSet
            SortedSet ss = new TreeSet();
            //Create a new Scanner
            Scanner sc = new Scanner (System.in);
            //Prompt the user for number of data
            System.out.print("\nEnter number of data: ");
            //Read number of data
            int number = sc.nextInt();
            //Prompt for data
            System.out.println("\nEnter data: ");
            //Read data
            dataToAdd = sc.nextLine();
		
            //Loop to iterate and add data
            for(int index = 0; index<number ;index++){
                //Read data
                dataToAdd = sc.nextLine();
                //Add data
                ss.add(dataToAdd);
            }
                
            //Display SortedSet
            System.out.println("\nSorted Set after inserting all data: " + ss);
            //Prompt for a data to be removed
            System.out.print("\nEnter a data to remove: ");
            //Read a data
            dataToRemove = sc.nextLine();
            //Remove data
            ss.remove(dataToRemove);
            //Display SortedSet
            System.out.println("\nSorted Set after deleting a data: " + ss);
            //Prompt for a data to be removed
            System.out.print("\nEnter a data to remove: ");
            //Read a data
            dataToRemove = sc.nextLine();
            //Remove data
            ss.remove(dataToRemove);

            //Display SortedSet
            System.out.println("\nSorted Set after deleting a data: " + ss);
            //Close Scanner
            sc.close();
	}
}
