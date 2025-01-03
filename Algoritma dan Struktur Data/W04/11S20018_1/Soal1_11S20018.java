import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

interface InterfaceJam{
    public void bacaJam();
    public void tulisJam();
    public int jamToDetik();
    public static int jamToDetik(Jam J);
    public static Jam detikToJam(int detik);
}

public class 11S20018_Prak1 implements InterfaceJam{
    private int hour;
    private int minute;
    private int second;

    //constructor....lengkapi contructor Jam dengan 3 variasi: tanpa parameter,dengan
    //parameter dan copy constructor.
	//lengkapi dengan setter getter

    public 11S20018_Prak1(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    };

    public 11S20018_Prak1(int HH, int MM, int SS){
        this.hour = HH;
        this.minute = MM;
        this.second = SS;
    }

    public 11S20018_Prak1(11S20018_Prak1 obj){
        this.hour = obj.getHour();
        this.minute = obj.getMinute();
        this.second = obj.getSecond();
    }

    //lengkapi dengan setter getter
    public int getHour(){
        return this.hour;
    }

    public void setHH(int HH){
        this.hour = HH;
    }

    public int getMinute(){
        return this.minute;
    }

    public void setMM(int MM){
        this.minute = MM;
    }

    public int getSecond(){
        return this.second;
    }

    public void setSS(int SS){
        this.second = SS;
    }


    public void bacaJam(){
        //tulis kode program yang diperlukan untuk meminta input dari user sampai
        //membentuk jam yang valid.
        Scanner sc = new Scanner(System.in);
        int counter = 0;

        do{
            if(counter != 0){
                System.out.println("");
                System.out.println("Nilai jam yang Anda berikan tidak valid (" + getHour() + ":" + getMinute() + ":" + getSecond() + ")." );
                System.out.println("Silakan mengisikan kembali!");
                System.out.println("");
            }

            System.out.print("Silakan memasukkan jam : ");
            setHour(sc.nextInt());
            System.out.print("Silakan memasukkan menit : ");
            setMinute(sc.nextInt());
            System.out.print("Silakan memasukkan sekon : ");
            setSecond(sc.nextInt());

            counter += 1;
        }while(getHour() < 0 || getHour() > 23 || getMinute() < 0 || getMinute() > 59 || getSecond() < 0 || getSecond() > 59);
            System.out.println("Berhasil membuat jam dengan nilai (" + getHour() + ":" + getMinute() + ":" + getSecond() + ").");
            System.out.println("");
    }

    public void tulisJam(){
        // tulis dengan format HH:MM:SS
        System.out.println("" + getHour() + ":" + getMinute() + ":" + getSecond());
    }

    public int jamToDetik(){
        // mengubah jam this ke detik
        int total = 0;
        total += getHour() * 3600;
        total += getMinute() * 60;
        total += getSecond();
        return total;
    }

    public static int jamToDetik(11S20018_Prak1 J){
        //mengubah jam J ke detik
        int total = 0;
        total += J.getHour() * 3600;
        total += J.getMinute() * 60;
        total += J.getSecond();
        return total;
    }

    public static 11S20018_Prak1 detikToJam(int detik){
        int nHour = detik / 3600;
        int nMinute = (detik % 3600) / 60;
        int nSecond = ((detik % 3600) % 60);
        11S20018_Prak1 hasil = new 11S20018_Prak1(nHour, nMinute, nSecond);
        return hasil;
    }
}