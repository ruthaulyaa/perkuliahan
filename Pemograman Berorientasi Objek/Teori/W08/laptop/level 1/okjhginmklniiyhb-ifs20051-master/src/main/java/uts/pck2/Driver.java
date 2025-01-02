//Driver.java
package uts.pck2;
import uts.pck1.Laptop;
public class Driver{
	public static void main(String[] args){
		Laptop r = new Laptop();
		System.out.print(r);
		System.out.print(r.menjalankanAplikasi("Visual Paradigm",1, 5));
	}
}