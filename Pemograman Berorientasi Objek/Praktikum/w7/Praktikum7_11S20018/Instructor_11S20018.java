//Instructor_11S20018.java
public class Instructor_11S20018 extends Person_11S20018{
    private Subject_11S20018[] subjects = new Subject_11S20018[MAX_SUBJECT];
    private final int MAX_SUBJECT = 5;
    private int nbSubject = 0;


    public Instructor_11S20018() {
        Subject_11S20018 = new Subject_11S20018[MAX_SUBJECT];
        for(int i = 0; i < MAX_SUBJECT - 1; i++){
            subjects[i] = new Subject_11S20018();
        }
    }

    public Subject_11S20018 getSubjects(int i){
        if (i >= nbSubject){
            return null;
        }
		else{
            return subjects[i];
        }
    }

    public void getAll(){
        for(int i = 0; i < nbSubject; i++){
            System.out.println(subjects[i].toString());
        }
    }
    
    public void addSubjects(Subject_11S20018 subjects){
        if(nbSubject == 0){
            this.subjects[nbSubject] = subjects;
            nbSubject++;
        }
		else if(nbSubject < MAX_SUBJECT){
            this.subjects[nbSubject] = subjects;
            nbSubject++;
        }
    }   

    public int getNbSubject(){
        return nbSubject;
    }

    public void setNbSubject(int nbSubject) {
        this.nbSubject = nbSubject;
    }
	
	public String toString(){
		String str = "\n Instructor_11S20018	";
		for (int i = 0; i < indeks; i++){
			str += subjects[i].toString();
		}
		return str;
	}
}