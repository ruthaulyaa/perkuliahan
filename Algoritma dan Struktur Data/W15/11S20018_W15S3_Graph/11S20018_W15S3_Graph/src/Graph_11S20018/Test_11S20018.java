/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graph_11S20018;
import java.util.*;
import java.io.*;

/**
 *
 * @author 11S20018
 */

public class Test_11S20018 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Graph_11S20018 gr = new Graph_11S20018(); 
        try{
            FileReader fin = new FileReader("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\11S20018_W15S3_Graph\\src\\Graph_11S20018\\Graph_11S20018.txt");
            BufferedReader graphFile = new BufferedReader(fin);

            String line;
            
            while((line = graphFile.readLine()) != null){
                StringTokenizer st = new StringTokenizer( line );
                try{
                    if(st.countTokens() != 3){
                        
                        System.out.println( "Skipping ill-formatted line " + line );
                        continue;
                    }
                    String source = st.nextToken();
                    String dest = st.nextToken();
                    int cost = Integer.parseInt(st.nextToken());
                    gr.addEdge(source, dest, cost);
                }catch(NumberFormatException e){ 
                    System.err.println( "Skipping ill-formatted line " + line ); 
                }
             }
         }catch(IOException e){ 
            System.err.println(e); 
         }
         System.out.println( "File dibaca..." );
         System.out.println(gr.getVertexMap().size() + " vertices/nodes");

         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));  
         while(gr.processRequest(in, gr));    
    }
}
