import java.util.Date;

public class Person {

    public String name;
    public Date bDay;




    public Person(String name, Date bDay) {
        this.bDay = bDay;
        this.name = name;


    }
    public String getName() {
        return name;
    }

    public Date getbDay() {
        return bDay;
    }
}