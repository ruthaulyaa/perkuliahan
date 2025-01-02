public class MethodOverriding{
	public static void main (String[] args){
		Parent pc = new Parent();
		int ipc = pc.myMethod(3,5.3);
		System.out.println(ipc);
		Child cc = new Child();
		int icc = cc.myMethod(3,5);
		System.out.println(cc);
		double fcc1 = cc.myMethod(1,2.3,7.9);
		System.out.println(fcc1);
		double fcc2 = cc.myMethod(5,2.3);
		System.out.println(fcc2);
	}
}

class Parent{
	public int a;
	public double b;
	
	public Parent(int a, double b){
		this.a = a;
		this.b = b;
	}
	public int myMethod(int a, double b){
		return (a+(int)b);
	}
}

class Child extends Parent{
	private double z;
	
	public Child(int x, double y){
		this.x = x;
		this.y = y;
	}
	
	public int myMethod(int x, double y){
		return (x*(int)y);
	}
	public double myMethod(int x, double y, double z){
		return (x+y+z);
	}
	public double myMethod(int x, double y){
		return((x/y));
	}
}