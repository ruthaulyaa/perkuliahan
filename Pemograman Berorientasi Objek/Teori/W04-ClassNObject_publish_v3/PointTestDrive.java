public class PointTestDrive {
	public static void main (String[] args){
		Point p1 = new Point ();
		Point p2 = new Point (3,5);
		System.out.println(Point.nbInstance);
		System.out.println(p1.nbInstance);
		System.out.println(p2.nbInstance);
		
		//System.out.println(Point.x);
		//System.out.println(Point.getAbsis());
		System.out.println("\n"+p1.getAbsis());
		System.out.println(p2.getAbsis());
		
		p2.nbInstance += 1;
		System.out.println("\n"+Point.nbInstance);
		System.out.println(p1.nbInstance);
		System.out.println(p2.nbInstance);
	}
}