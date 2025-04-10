//ParseDemo.java
/*This programs sums a list of numbers entered by the user,
  It converts the string representation of each number into an into
  using parseInt{}.
*/

import java.io.*;
class ParseDemo {
	public static void main(String args[])
	throws IOException{
		BufferedReader br = new
		//create a BufferedReader using System.in
		BufferedReader(new InputStreamReader (System.in));
		String str;
		int i;
		int sum = 0;
		
		System.out.println("Enter numbers, 0 to quit.");
		do {
			str = br.readLine();
			try{
				i = Integer.parseInt(str);
			} catch(NumberFormatException e){
				System.out.println("Invalid format");
				i = 0;
			}
			sum += i;
			System.out.println("Current sum is: " + sum);
		}while(i != 0);
	}
}