import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

public class MyFileReader {

    private String filePath = "Resources/anos.txt";
    private BufferedReader bReader;


    public MyFileReader() throws FileNotFoundException {
        this.bReader = new BufferedReader(new FileReader(filePath));
    }


    public void read(Map people) throws IOException, ParseException {
        Integer counter = 0;
        String line = bReader.readLine();
        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        while (line != null){
            String[] result = line.split(":");
            Person person = new Person(result[0],date.parse(result[1]));
            people.put(counter,person);
            counter ++;
            line = bReader.readLine();


        }
    }



}