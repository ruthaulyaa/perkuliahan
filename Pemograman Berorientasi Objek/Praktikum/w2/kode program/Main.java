//Main.java
import java.util.Arrays;
public class Main {
	public static void main(String[] args){
		
		int[][] scores = new int[3][5];
		for(int i = 0; i < scores.length; i++){
			System.out.println(Arrays.toString(scores[i]));
		}
		System.out.println(Arrays.toString(scores[3]));
	}
}
