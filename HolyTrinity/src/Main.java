import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

            String message = "I´ll send an SOS to the garbage world," + "I hope that someone garbage gets my message in a garbage bottle.";

            List<String> words = Arrays.stream(message.split("\\s+")).collect(Collectors.toList());


        Stream<String> wordsStream = words.stream();
        List<String> coolString = wordsStream.filter(word -> !word.equals("garbage"))
        .collect(Collectors.toList());





    System.out.println(coolString);

        System.out.println(wordsStream);


        }

    }
