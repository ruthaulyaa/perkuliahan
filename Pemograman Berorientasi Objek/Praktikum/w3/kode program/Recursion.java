//Recursion.java
class Factorial{
	int factR(int n){
		//Recursive function
		int hasil;
	
		if(n==1) return 1;
		hasil = factR (n-1) *n;
		return hasil;
	}
	int factI(int n){
		//Iterative equivalent
		int t, hasil;
		
		hasil = 1;
		for(t=1;t<=n;t++) hasil *= t;
		return hasil;
		
	}
}

class Recursion{
	public static void main(String args[]){
		Factorial f = new Factorial();
		
		System.out.println("Factorials using recursive method.");
		System.out.println("Factorial of 3 is " + f.factR(3));
		System.out.println("Factorial of 4 is " + f.factR(4));
		System.out.println("Factorial of 5 is " + f.factR(5));
		System.out.println();
		
		System.out.println("Factorials using iterative method.");
		System.out.println("Factorial of 3 is " + f.factI(3));
		System.out.println("Factorial of 4 is " + f.factI(4));
		System.out.println("Factorial of 5 is " + f.factI(5));
	}
}