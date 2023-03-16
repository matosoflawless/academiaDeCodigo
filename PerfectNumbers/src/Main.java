import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {


        public static final int sumDivisors(int n) {
            return IntStream.range()

        }

        public static void checkPerfects(int min,int max) {
            IntStream.range(min,max)
                    .filter(num -> sumDivisors(num) == num )
                    .forEach(element -> System.out.println(element));
        }
    }
}