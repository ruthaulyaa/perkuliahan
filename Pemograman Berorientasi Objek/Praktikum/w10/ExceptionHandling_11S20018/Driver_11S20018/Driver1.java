public class Driver1{
	public static void main(String[] args){
		int a = 6;
		int b = 0;
		double c = bagi(a,b);
		System.out.println("Hasil " + a + " : " + b + " = " + c);
		System.out.println("Aplikasi Selesai");
	}
	public static double bagi(int a, int b){
		System.out.println("Method dipanggil dengan a = " + a + " b = " + b);
		double hasil = a/b;
		System.out.println("Method bagi selesai dan akan return hasil");
		return hasil;
	}
}