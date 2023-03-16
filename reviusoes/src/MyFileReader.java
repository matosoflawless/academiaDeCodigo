import jdk.javadoc.internal.doclets.formats.html.EnumConstantWriterImpl;

import java.io.*;
import java.text.SimpleDateFormat;

public class MyFileReader{
    public BufferedReader reader; // declarar
    public String filePath = "recourses/anos.txt";


    public MyFileReader () throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(filePath));
    }


    public void read() throws IOException {
        String line = reader.readLine();
        SimpleDateFormat convert = new SimpleDateFormat("dd/MM/yy")
        while (line != null) {
            String[] splitness = line.split(" ");
            Person person = new Person(splitness[0],convert.parse(splitness[1]))
        }
    }



}
