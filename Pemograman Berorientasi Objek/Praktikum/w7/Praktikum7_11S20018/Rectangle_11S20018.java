//Rectangle_11S20018.java
public class Rectangle_11S20018 extends Shape_11S20018{
	private Point_11S20018 p1;
	private Point_11S20018 p2;

	
	public Rectangle_11S20018(){
		super( "Rectangle");
		p1 = new Point_11S20018();
		p2 = new Point_11S20018();
	}

	
	public Rectangle_11S20018(Point_11S20018 varPoint1, Point_11S20018 varPoint2){
		super( "Rectangle");
		p1 = new Point_11S20018(varPoint1);
		p2 = new Point_11S20018(varPoint2);
	}

	
	public Rectangle_11S20018(Rectangle_11S20018 r){
		super( "Rectangle");
		p1 = new Point_11S20018(r.getP1());
		p2 = new Point_11S20018(r.getP2());
	}

	//setter
	public void setP1(Point_11S20018 varPoint1){
		p1.setAbsis(varPoint1.getAbsis());
		p1.setOrdinat(varPoint1.getOrdinat());
	}
	public void setP2(Point_11S20018 varPoint2){
		p2.setAbsis(varPoint2.getAbsis());
		p2.setOrdinat(varPoint2.getOrdinat());
	}

	//getter
	public Point_11S20018 getP1(){
		return p1;
	}
	public Point_11S20018 getP2(){
		return p2;
	}

	
	public int getWidth(){
		return Math.abs(getP1().getAbsis() - getP2().getAbsis());
	}

	public int getHeight(){
		return Math.abs(getP1().getOrdinat() - getP2().getOrdinat());
	}
	
	//override abstract method
	//mengembalikan luas Rectangle dalam type double
	public double getArea(){
		return  ((double)getWidth() * getHeight());
	}

	//mengembalikan keliling Rectangle dalam type double
	public double getCircumference(){
		return  ((double)2 * (getWidth() + getHeight()));
	}

	//menampilkan informasi Rectangle ke console
	public String toString(){
		return(
			"\n" + getName() + 
			" with :\n\tPoint P1: " + p1 +
			"\n\tPoint P2: " + p2 +
			"\n\twidth : " + getWidth() +
			"\n\theight : " + getHeight() +
			"\n\tLuas : " + getArea() +
			"\n\tKeliling : " + getCircumference()
		);
	}
	
	public boolean isEqual(Object o){
		if (o == null){
			return false;
		}
		else if (o instanceof Rectangle_11S20018){
			return ((p1.isEqual(((Rectangle_11S20018)o).getP1())) && (p2.isEqual(((Rectangle_11S20018)o).getP2())));
		}
		else 
			return false;
	}
	public boolean isGreaterThan(Object o){
		if (o == null){
			return false;
		}
		else if (o instanceof Rectangle_11S20018){
			return (getArea() > ((Rectangle_11S20018)o).getArea());
		}
		else
			return false;
	}
	public boolean isLessThan(Object o){
		if (o == null){
			return false;
		}
		else if (o instanceof Rectangle_11S20018){
			return (getArea() < ((Rectangle_11S20018)o).getArea());
		}
		else
			return false;
	}
}	