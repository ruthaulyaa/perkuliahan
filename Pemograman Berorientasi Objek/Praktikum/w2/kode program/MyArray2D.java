//MyArray2D.java
import java.util.Scanner;
import java.util.Arrays;
public class MyArray2D{
	public static void main(String[] args){
		int tabel[][];
		tabel = new int[4][3];
		//int tabel [][] = new int [4][3];
		Scanner sc = new Scanner(System.in);
		
		//mengisi nilai baru ke dalam elemen array 2 dimensi
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				tabel[i][j] = sc.nextInt();
			}
		}
		
		//menampilkan isi array 2 dimensi ke layar
		for(int i=0;i<tabel.length;i++){
			for(int j=0;j<tabel[0].length;j++){
				System.out.print(Arrays.toString(tabel[i])+"\t");
				//System.out.print(tabel[i][j]+ "\t");
			}
			System.out.print("\n");
			
			//System.out.print(Arrays.deepToString(tabel));
		}
	}
}	