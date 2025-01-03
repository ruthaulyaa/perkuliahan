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
public interface SimpleContainer<AnyType>{
	//Method insert()
	public void insert(Object x);
	//Method remove()
	public void remove(Object x);
	//Method find()
	public Object find(Object x);
	//Method isEmpty()
	public boolean isEmpty();
	//Method makeEmpty()
	public void makeEmpty();
}
