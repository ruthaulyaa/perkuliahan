//Point_11S20018.java
public class Point_11S20018{
	private int x;
	private int y;

	public Point_11S20018(int x,int y){
		this.x=x;
		this.y=y;
	}

	// setter
	public void setAbsis(int newX){
		x=newX;
	}

	public void setOrdinat(int newY){
		y=newY;
	}
	// getter
	public int getAbsis(){
		return x;
	}

	public int getOrdinat(){
		return y;
	}

	public String toString(){
		return "("+x +","+y+")";
	}
}