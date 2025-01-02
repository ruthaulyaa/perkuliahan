//DemoInterface_11S20018.java


public class DemoInterface_11S20018{
	public static void main(String[] args){
		//Instansiasi Objek Rectangle biasa
		Rectangle_11S20018 r1 = new Rectangle_11S20018(new Point_11S20018(2,2), new Point_11S20018(4,4));
		System.out.println(r1.toString());

		//Instansiasi Objek Rectangle dengan menggunakan parent Shape
		Shape_11S20018 s1 = new Rectangle_11S20018(new Point_11S20018(3, 2), new Point_11S20018(10, 6));
		System.out.println(s1.toString());

		//Instansiasi Objek Rectangle dengan menggunakan child Rectangle dan inisialisasi kan kepada parent Shape
		Shape_11S20018 s2;
		Rectangle_11S20018 r2 = new Rectangle_11S20018(new Point_11S20018(2, 1), new Point_11S20018(7, 2));
		System.out.println(r2.toString());
		s2 = r2;
		
		//Instansiasi Objek Circle biasa
        System.out.println ("Test Instansiasi Circle");
        Circle_11S20018 c1 = new Circle_11S20018();
        System.out.println (c1.toString());

        //Instansiasi Objek Circle dengan menggunakan Parent Shape
        Shape_11S20018 s3 = new Circle_11S20018(new Point_11S20018(3,12),10);
        System.out.println (s3);

        //Instansiasi Object Circle dengan menggunakan child Rectangle dan inisialisasi kan kepada parent sahpe
        Shape_11S20018 s4;
        Circle_11S20018 c2 = new Circle_11S20018(new Point_11S20018(1,0),5);
        System.out.println(c2);
        s4 = c2;
		
		
		//Instansiasi sebuah ShapeCollection dan mengisi semua Objek ke dalamnya
		ShapeCollection_11S20018 sc = new ShapeCollection_11S20018();
		sc.addShape(r1);
		sc.addShape(s1);
		sc.addShape(s2);
		sc.addShape(s3);
		sc.addShape(s4);		
		//menampilkan isi array
		System.out.println(sc.toString());
	}
}