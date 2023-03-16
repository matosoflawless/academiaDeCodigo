import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyList {
String message = "I´ll send an SOS to the garbage world," + "I hope that someone garbage gets my message in a garbage bottle.";

List<Object> words = Arrays.stream(message.split("")).collect(Collectors.toList());



}
