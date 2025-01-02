public class Driver3{
    public static void main(String[] args){
		try{
			int a = 0;
			int b = 10;
			int cs[] = { 1, 2, 3 };
			double d = b / a;
			System.out.println(d);
			System.out.println(cs[5]);
		}
		catch (ArrayIndexOutOfBoundsException aibe){
			System.out.println("ERROR PENGAKSESAN ARRAY TERJADI");
			System.out.println(aibe);
		}
		catch (ArithmeticException ae){
			System.out.println("ERROR ARITMATIKA");
			System.out.println(ae);
		}
    }
}