/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class QueueException extends RuntimeException{
	//Constructor
	public QueueException(){
	//Invoke parent class constructor
	super("Error");
	}

	//Constructor
	public QueueException( String message ){
	//Invoke parent class constructor
	super( message );
	}
}