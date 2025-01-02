//Point_11S20018.java
public class Point_11S20018 implements Relation_11S20018{
	//attributes
	private int x;
	private int y;
	
	//constructor;
	//inisialisasi kooordinat (0,0)
	public Point_11S20018(){
		x = 0;
		y = 0;
	}
	
	public Point_11S20018(int newX, int newY){
		x = newX;
		y = newY;
	}
	
	public Point_11S20018(Point_11S20018 P){
		x = P.getAbsis();
		y = P.getOrdinat();
	}
	
	//setter
	public void setAbsis(int newX){
		x = newX;
	}
	public void setOrdinat(int newY){
		y = newY;
	}
	public void move (int dx, int dy){
    this.x += dx;
    this.y += dy;
	}
	
	//getter
	public int getAbsis(){
		return x;
	}
	public int getOrdinat(){
		return y;
	}
	
	public String toString(){
		return (this.x + "," + this.y);
	}

	public boolean isEqual(Object o){
		if (o == null){
			return false;
		}
		else if (o instanceof Point_11S20018){
			return (getOrdinat () == ((Point_11S20018)o).getOrdinat() && getAbsis () == ((Point_11S20018)o).getAbsis());
		}
		else 
			return false;
	}

	public boolean isGreaterThan(Object o){
		if (o == null){
			return false;
		}
		else if (o instanceof Point_11S20018){
			return (getOrdinat () > ((Point_11S20018)o).getOrdinat() && getAbsis () > ((Point_11S20018)o).getAbsis());
		}
		else 
			return false;
	}

	public boolean isLessThan (Object o){
		if (o == null){
			return false;
		}
		else if (o instanceof Point_11S20018){
			return (getOrdinat () < ((Point_11S20018)o).getOrdinat() && getAbsis () < ((Point_11S20018)o).getAbsis());
		}
		else 
			return false;
	}
}	