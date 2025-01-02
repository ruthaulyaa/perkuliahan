//ArrayCopy.java
public class ArrayCopy{
	public static void main(String[] args){
		int num1[] = new int[10];
		int num2[] = new int[10];
		int i;
		for(i=0;i<10;i++)
			num1[i] = i;
		
		//copy num1 to num 2
		if(num2.length >= num1.length)
			for(i=0;i<num1.length;i++)
				num2[i]=num1[i];
		
		for(i=0;i<num2.length;i++)
			System.out.print(num2[i]+ " ");
	}
}