/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class InterchangeMapKeyValue {
    //Method interchange()
	public static Map interchange(Map inputMap){
		//Create a new map
		Map newMap = new HashMap();
            //Loop
            for (Iterator it = inputMap.entrySet().iterator(); it.hasNext();) {
                Map.Entry entry = (Map.Entry) it.next();
                //Interchange key and value
                newMap.put(entry.getValue(), entry.getKey());
            }
		//Return new map
		return newMap;
	}

	//Driver method main()
	public static void main(String[] args){
		//Declare a variable for key
		String key;
		//Declare a variable for value
		String value;
		//Declare a variable for number of inputs
		int numberOfInputs;
		//Declare a variable for while loop
		int counter = 0;
		
		//Create an input map
		Map inputMap = new HashMap();
		//Create a new scanner
		Scanner sc = new Scanner(System.in);
		//Prompt the user for number of inputs
		System.out.print("Enter number of inputs to be processed: ");

		//Read the number of inputs
		numberOfInputs = sc.nextInt();

		//Loop
		while (counter < numberOfInputs){
			//Prompt the user for key
			System.out.print("\nEnter key: ");
			//Read key
			key = sc.next();
			//Prompt the user for value
			System.out.print("Enter value: ");
			//Read value
			value = sc.next();
			
			//Try block
			try{
				/*Check whether there are any duplicate values*/
				if (inputMap.containsValue(value)){
				//Display message
				System.out.print("\nError...");
				System.out.print("\nDuplicate values in map...");
				//Continue
				continue;
				}

				//Add key and value to the map
				inputMap.put(key, value);
				//Increment counter
				counter++;
			}
		
			//Catch block
			catch(Exception e){
				//Throw exception
				System.out.println("Error");
			}
		}
		
		/*Call the function interchange() to swap key and value in the Map*/
		inputMap = interchange(inputMap);
		//Display the new map
		System.out.println("\n"+inputMap);
		//Close scanner
		sc.close();
	}
}
