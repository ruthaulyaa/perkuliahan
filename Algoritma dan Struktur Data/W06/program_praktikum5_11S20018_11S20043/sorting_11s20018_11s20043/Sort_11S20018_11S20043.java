/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author 11S20018_11S20043
 */
public class Sort_11S20018_11S20043 {
    public static void main(String[] args) throws Exception{
        Scanner s = new Scanner(System.in);
        String ch; 
        System.out.println("c- case insensitive\nn- case sensitive");
        ch = s.next();
        
        //checks for the option "n"
        if (ch.charAt(0) == 'n'){
            //declare and initialize reader
            BufferedReader reader = null;
            try{
                InputStream is = Sort_11S20018_11S20043.class.getResourceAsStream("./superwings.txt");
                reader = new BufferedReader(new InputStreamReader(is));
                String[] sortarray = new String[8];
                String temp;
                //loop executes until "i"
                for (int i = 0; i <= 7; i++){
                    //read the file line by line store in arraylist
                    sortarray[i] = reader.readLine();
                }
                
                //loop executes until "i" is less than "sortarray.length" 
                for(int i = 0; i < sortarray.length; i++){
                    //loop executes until "j" is less than "sortarray.length" 
                    for(int j = i + 1; j < sortarray.length; j++){
                        if (sortarray[i].compareTo(sortarray[j])>0){
                        //assign "sortarray[i]" to "temp"
                        temp = sortarray[i];
                        //assign "sortarray[il" to "sortarray[i]"
                        sortarray[i] = sortarray[j];
                        //assign "temp" to "sortarray[j]"
                        sortarray[j] = temp; 
                        }
                    }
                }      
            
                //print statement
                System.out.print("Names in Sorted Order\n");
                //checks for the condition
                for (int i = 0; i < sortarray.length; i++){
                    //print statement
                    System.out.println(sortarray[i]);
                }

                //print statement
                System.out.println("----------");
            }
        
            //exeception is thrown
            catch (IOException e){
                //prints Stack Trace
                e.printStackTrace();
            }
        
            finally{
                try{
                    //checks whether "reader" not equal to null
                    if (reader != null){
                        //closing of reader file
                        reader.close();
                    }
                }

                // IO exception
                catch (IOException e){
                    //prints Stack Trace
                    e.printStackTrace();
                }
            }
        }

        //checks for the option "c"
        else if (ch.charAt(0) == 'c'){
            //declare and initialize reader
            BufferedReader reader = null;
            //executes try option
            try{
                //object is created
                ArrayList line = new ArrayList();
                //read the data from file
                InputStream is = Sort_11S20018_11S20043.class.getResourceAsStream("./superwings.txt");
                reader = new BufferedReader(new InputStreamReader(is));
                //reads the file line by line and store in arraylist"
                String currentLine = reader.readLine();
                //checks for the condition
                while (currentLine != null){
                    //adds the currentLine
                    line.add(currentLine);       
                    //reads the file line by line and store in currentLine
                    currentLine = reader.readLine();
                }

                //sort the string with insensitive order
                Collections.sort(line,String.CASE_INSENSITIVE_ORDER);
                System.out.println("Names in Sorted Order");
                //loop executes until "line"
                for(Object num : line){
		String str = String.valueOf(num);
                    System.out.println(str);
                }
            }

            //exception is thrown
            catch (IOException e){
                //prints Stack Trace
                e.printStackTrace();
            }

            finally{
                //executes try option
                try{
                    //checks for the condition
                    if (reader != null){
                        //closing of reader file
                        reader.close();
                    }
                }
                //exception is thrown
                catch (IOException e){
                    //prints StackTrace
                    e.printStackTrace();
                }
            }
        }
    }
}