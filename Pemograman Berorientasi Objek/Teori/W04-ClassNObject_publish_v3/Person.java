class Person 
{
    private String name;
    private String address;
    private String city;
    private int age;
    private char gender;

    //getName() : String
    protected String getName()
    {
        return name;
    }

    //setName(name:string) : void
    protected void setName (String name)
    {
        this.name = name;
    }

    //getAddress() : String
    protected String getAddres()
    {
        return address;
    }

    //setAddress(address:string) : void
    protected void setAddress (String address)
    {
        this.address = address;
    }

    //getCity() : String
    protected String getCity()
    {
        return city;
    }

    //setName(name:string) : void
    protected void setCity (String city)
    {
        this.city = city;
    }

    //getAge() : Int
    protected int getAge()
    {
        return age;
    }

    //setAge(Age:string) : void
    protected void setAge (int age)
    {
        this.age = age;
    }

    //getGender() : char
    protected Character getGender()
    {
        return gender;
    }

    //setGender(gender:char) : void
    protected void setGender (char gender)
    {
        this.gender = gender;
    }

    //toString() : string
    public String toString()
    {
        return "My Name is " + this.name + ", I lived in " + this.address + ", " + this.city + " City" + ", I am " + this.age + " Years Old " + ", and I am a " + this.gender + ".";
    }
}

//PersonDriverjava untuk menggunakan kelas person

public class PersonDriver 
{
    public static void main (String args [])
    {
        Person Saya = new Person();
        
        //Pengaplikasian nama
        Saya.setName("Ruth Silalahi");

        //Pengaplikasian address
        Saya.setAddress("Jalan Mawar");

        //Pengaplikasian city
        Saya.setCity("Kuningan");

        //Pengaplikasian age
        Saya.setAge(19);

        //Pengaplikasian gender; M = Male, F = Female
        Saya.setGender('F');

        //Output
        System.out.println(Saya);
    }
}
