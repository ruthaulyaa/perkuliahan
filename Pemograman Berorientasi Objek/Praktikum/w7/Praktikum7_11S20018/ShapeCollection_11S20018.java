//ShapeCollection_11S20018.java
public class ShapeCollection_11S20018{
	private static int MAX_EL = 10;
	private Shape_11S20018[] arrShape= new Shape_11S20018[MAX_EL];
	private int indeks;
	
	public ShapeCollection_11S20018(){
		indeks = indeks - 1;
	}
	
	public Shape_11S20018 getShape(int varIndeks){
		if (varIndeks > 0 && varIndeks < MAX_EL)
				return arrShape[varIndeks];
		else 
				return null;
	}
	
	public boolean addShape(Shape_11S20018 anyShape){
		if (indeks < MAX_EL){
			for (int i = 0; i < indeks; i++){
				if (arrShape[i].isEqual(anyShape)){
					return false;
				}
			}
			indeks++;
			arrShape[indeks] = anyShape;
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString(){
		/*for(Shape shp: arrShape){
		shp.display();}*/
		String str = "\n Shape Collection	";
		for (int i = 0; i < indeks; i++){
			str += arrShape[i].toString();
		}
		return str;
	}
}