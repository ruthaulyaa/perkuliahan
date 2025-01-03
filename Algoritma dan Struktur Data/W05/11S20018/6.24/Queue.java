/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public interface Queue<AnyType> extends Collection<AnyType>{
	//Method element()
	AnyType element();
	//Method remove()
	AnyType remove();
}
