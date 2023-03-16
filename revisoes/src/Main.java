import java.io.IOException;
import java.text.ParseException;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {

        //temos um ficheiro com data, nomes, queremos um programa que consiga ler os nomes e quem faz anos hoje.
        //iterar pela lista
        //class pessoa + nome + data de nascimento
        //getters para a data
        //criar uma class para ler o ficheiro - class FileReader
        //usar o metodo split para separar o nome das datas
        //vamos ter um FileReader, FileReader fileReader = new FileReader(file); (criamos este FileReader para usar no BufferedReader
        // ||||ex: BufferedReader bReader = new BufferedReader(reader);

       new BirthdayList().checkBirthday();

    }
}