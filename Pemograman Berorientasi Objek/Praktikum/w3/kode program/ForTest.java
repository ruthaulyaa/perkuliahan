//ForTest.java
//Loop until an S is typed
import java.io.IOException;
class ForTest {
	public static void main(String ags[])throws IOException{
			
			int i;
			
			System.out.println("Press S to stop.");
			
			for(i = 0; (char) System.in.read() != 'S'; i++)
				System.out.println("Pass #" + i);	
	}
}