//Triangle_11S20018.java
import java.lang.Math;

public class Triangle_11S20018{
    public String name;
    public Point_11S20018 p1;
    public Point_11S20018 p2;
    public Point_11S20018 p3;
    public double sisi1, sisi2, sisi3;

    Triangle_11S20018(String inputName,int p1x,int p1y,int p2x,int p2y,int p3x,int p3y){
        name = inputName;
        p1 = new Point_11S20018(p1x, p1y);
        p2 = new Point_11S20018(p2x, p2y);
        p3 = new Point_11S20018(p3x, p3y);
    }

    // setter
    public void setName(String inputName){
        name = inputName;
    }
    public void setP1(int a,int b){
        p1 = new Point_11S20018(a,b);
    }
    public void setP2(int a,int b){
        p2 = new Point_11S20018(a,b);
    }
    public void setP3(int a,int b){
        p3 = new Point_11S20018(a,b);
    }
    // getter
    public String getName() {
        return name;
    }

    public int getP1Absis(){
        return p1.getAbsis();
    }

    public int getP1Ordinat(){
        return p1.getOrdinat();
    }

    public int getP2Absis(){
        return p2.getAbsis();
    }

    public int getP2Ordinat(){
        return p2.getOrdinat();
    }

    public int getP3Absis(){
        return p3.getAbsis();
    }

    public int getP3Ordinat(){
        return p3.getOrdinat();
    }

    public double getCircumference(){
        sisi1 = Math.sqrt((p1.getAbsis() - p2.getAbsis()) * (p1.getAbsis() - p2.getAbsis()) + (p1.getOrdinat() - p2.getOrdinat()) * (p1.getOrdinat() - p2.getOrdinat()));
        sisi2 = Math.sqrt((p1.getAbsis() - p3.getAbsis()) * (p1.getAbsis() - p3.getAbsis()) + (p1.getOrdinat() - p3.getOrdinat()) * (p1.getOrdinat() - p3.getOrdinat()));
        sisi3 = Math.sqrt((p2.getAbsis() - p3.getAbsis()) * (p2.getAbsis() - p3.getAbsis()) + (p2.getOrdinat() - p3.getOrdinat()) * (p2.getOrdinat() - p3.getOrdinat()));
        return sisi1 + sisi2 + sisi3;
    }

    public double getArea(){
        double s = getCircumference()/2;
        return Math.sqrt(s*(s-sisi1)*(s-sisi2)*(s-sisi3));
    }

    public String toString(){
        return ("Nama Segitiga : " + name + "\n" + "Point 1 : " + "(" + p1.getAbsis() + "," + p1.getOrdinat() + ")" + "\n" + "Point 2 : " 
		+ "(" + p2.getAbsis() + "," + p3.getOrdinat() + ")" + "\n" + "Point 3 : " + "(" + p3.getAbsis() + "," + p3.getOrdinat() + ")");
    }
}