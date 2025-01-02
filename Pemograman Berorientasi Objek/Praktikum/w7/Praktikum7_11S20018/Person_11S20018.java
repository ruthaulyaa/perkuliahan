//Person_11S20018.java
public class Person_11S20018 implements Relation_11S20018 {
    private String name;
    private char gender;

    public Person_11S20018(){
        name = "";
        gender=' ';
    }
    public Person_11S20018(String name, char gender){
        this.name = name;
        this.gender= gender;
    }
	
	//getter
	protected String getName() {
        return name;
    }
	
    protected char getGender() {
        return gender;
    }	
	
	//setter
    protected void setName(String name) {
        this.name = name;
    }

    protected void setGender(char gender) {
        this.gender = gender;
    }
    
	public String toString() {
        return "Person{" + "name=" + name + ", gender=" + gender + '}';
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