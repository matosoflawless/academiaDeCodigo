import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {


        public class FileAnalyzer {

            private static final String FILE1_PATH = "file1.txt";
            private static final String FILE2_PATH = "file2.txt";

            public static void main(String[] args) {
                File file1 = new File(FILE1_PATH);
                File file2 = new File(FILE2_PATH);
                if (!file1.exists() || !file2.exists()) {
                    System.out.println("One or both files do not exist.");
                    return;
                }

                try {
                    String content1 = Files.readString(Paths.get(FILE1_PATH), StandardCharsets.UTF_8);
                    String content2 = Files.readString(Paths.get(FILE2_PATH), StandardCharsets.UTF_8);

                    System.out.println("Word counts in file1:");
                    Map<String, Long> wordCounts1 = countWords(content1);
                    wordCounts1.forEach((word, count) -> System.out.println(word + ": " + count));

                    System.out.println("\nFirst word longer than 5 characters in file2: " + findFirstLongerWord(content2, 5));

                    System.out.println("\nLongest 3 words in file1:");
                    List<String> longestWords1 = findLongestWords(content1, 3);
                    longestWords1.forEach(System.out::println);

                    System.out.println("\nCommon words between file1 and file2:");
                    List<String> commonWords = findCommonWords(content1, content2);
                    commonWords.forEach(System.out::println);
                } catch (IOException e) {
                    System.out.println("Failed to read file(s): " + e.getMessage());
                }
            }

            private static Map<String, Long> countWords(String content) {
                return Arrays.stream(content.split("\\s+"))
                        .map(word -> word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase())
                        .filter(word -> !word.isEmpty())
                        .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
            }

            private static String findFirstLongerWord(String content, int length) {
                return Arrays.stream(content.split("\\s+"))
                        .filter(word -> word.length() > length)
                        .findFirst()
                        .orElse("No word found.");
            }

            private static List<String> findLongestWords(String content, int count) {
                return Arrays.stream(content.split("\\s+"))
                        .map(word -> word.replaceAll("[^a-zA-Z0-9]", ""))
                        .filter(word -> !word.isEmpty())
                        .sorted((w1, w2) -> w2.length() - w1.length())
                        .limit(count)
                        .collect(Collectors.toList());
            }

            private static List<String> findCommonWords(String content1, String content2) {
                Map<String, Long> wordCounts1 = countWords(content1);
                Map<String, Long> wordCounts2 = countWords(content2);
                return wordCounts1.keySet().stream()
                        .filter(word -> wordCounts2.containsKey(word))
                        .sorted()
                        .collect(Collectors.toList());
            }

        }
    }
}