import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class BirthdayList {
    private Map<Integer,Person> people;
   private DateComparator dateComparator = new DateComparator();
    public BirthdayList() throws IOException, ParseException {
        people = new HashMap<>();
        new MyFileReader().read(people);
    }

    public void checkBirthday(){

        for (Integer i : people.keySet()) {
            System.out.println(dateComparator.isToday(people.get(i).getbDay()));
            System.out.println(people.get(i).getName());
        }
    }


}
