//Shape_11S20018.java
public abstract class Shape_11S20018 implements Relation_11S20018{
	private String name;
	
	public Shape_11S20018(String newName){
		name = newName;
	}
	//method luas
	protected abstract double getArea();
	//method keliling
	protected abstract double getCircumference();
	
	protected  String getName() {
		return name;
	}
	
	protected void setName(String newName) {
		 name = newName;
	}
	
	public String toString(){
		return "\n"+getName();
	}
	
	public abstract boolean isEqual(Object o);
	public abstract boolean isGreaterThan(Object o);
	public abstract boolean isLessThan(Object o);	
}