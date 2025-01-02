//ProgrArrayAverage.java
import java.util.Arrays;
public class ProgrArrayAverage{
	public static void main(String[] args){
		double nums[] = {10.1,11.2,12.3,13.4,14.5};
		double result = 0;
		for(int i=0; i<nums.length; i++)
			result = result + nums[i];
		System.out.printf("Average of " + Arrays.toString(nums) + " is %.2f",result/nums.length);
	}
}