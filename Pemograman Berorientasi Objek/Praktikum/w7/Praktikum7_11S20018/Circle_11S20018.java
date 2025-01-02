//Circle_11S20018.java
public class Circle_11S20018 extends Shape_11S20018 {
	private Point_11S20018 p;
	private int diameter;
	public static double PI=3.14;
	public Circle_11S20018() {
		super("Circle");
		p = new Point_11S20018(0,0);
		diameter= 1;
	}
	public Circle_11S20018(Point_11S20018 varPoint, int varDiamter) {
		super("Circle");
		/*jika ada kopi konstruktor maka
		p = VarPoint;*/
		p = new Point_11S20018(varPoint);
		diameter= varDiamter;
	}
	public Circle_11S20018(Circle_11S20018 c) {
		super("Circle");
		p = new Point_11S20018(c.p);
		diameter= c.diameter;
	}
	public void setP(Point_11S20018 varP) {
		p.setAbsis(varP.getAbsis());
		p.setOrdinat(varP.getOrdinat());
	}
	
	public void setDiameter(int varDiameter) {
		diameter = varDiameter;
	}
	public Point_11S20018 getP() {
		return p;
	}
	
	public int getDiameter() {
		return diameter;
	}
	//override
	public double getArea() {
		return (PI*Math.pow((double)diameter/2, 2));
	}

	//override
	public double getCircumference() {
		return (2*PI*((double)diameter/2));
	}

	//override
	public  String toString() {
		return(
				"\n" + getName() + 
				" with :\n\tPoint : " + p +
				"\n\tDiameter  : " + diameter +
				"\n\tLuas : " + getArea() +
				"\n\tKeliling : " + getCircumference()
		);
	}

	public boolean isEqual(Object o){
		if (o == null){
			return false;
		}
		else if(o instanceof Circle_11S20018){
            return ((p.isEqual(((Circle_11S20018)o).getP()))&&(diameter == ((Circle_11S20018)o).getDiameter()));
		}
		else
			return false;

	}
	public boolean isGreaterThan(Object o){
		if (o == null){
			return false;
		}
		else if(o instanceof Circle_11S20018){
            return (getArea() > ((Circle_11S20018)o).getArea());
		}
		else
			return false;
	}
	public boolean isLessThan(Object o){
		if (o == null){
			return false;
		}
		else if(o instanceof Circle_11S20018){
            return (getArea() < ((Circle_11S20018)o).getArea());
		}
		else
			return false;
	}
	
}