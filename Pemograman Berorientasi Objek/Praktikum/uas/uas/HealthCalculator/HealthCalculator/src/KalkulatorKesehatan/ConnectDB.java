/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KalkulatorKesehatan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class ConnectDB {
    public static void main(String[] args){
        
        Connection cnt = null;
        
        try {
            Class.forName("org.postgressql.Driver");
            cnt = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","root");
            
            if(cnt!=null){
                System.out.println("Connection OK");
            }
            else{
                System.out.println("Connection Failed");
            }
        }   catch (ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }
}
