//ArrayEquals.java
public class ArrayEquals{
	public static void main(String[] args){
		Integer angka1[] = {1,2,3,4,5};
		Integer angka2[] = {1,2,3,4,5};
		
		System.out.print(angka1.equals(angka2));
		System.out.print("\n");
		angka1 = angka2;
		System.out.print(angka1.equals(angka2));
	}
}