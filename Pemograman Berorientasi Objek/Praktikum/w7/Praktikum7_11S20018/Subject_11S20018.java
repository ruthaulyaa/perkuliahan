//Subject_11S20018.java
public class Subject_11S20018 implements Relation_11S20018{
    private String name;
	
	public Subject_11S20018(String name){
        this.name = name;
    }

    public Subject_11S20018(Subject_11S20018 newSubject){
        this.name = newSubject.name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return "{" + ", name='" + getName() + "}";
    }
	
	
    public boolean isEqual(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean isGreaterThan(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean isLessThan(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }  
}