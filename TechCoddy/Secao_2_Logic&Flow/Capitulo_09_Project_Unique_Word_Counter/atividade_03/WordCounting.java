import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class WordCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        
        // Write your code here

        String[] sentences = text.split("\\.");
        String[][] textArrayOrigin = new String[sentences.length][];
        String[][] textArrayClean = new String[sentences.length][];
        Map<String, Integer> freqToken = new HashMap<>();

        for (int i = 0; i < sentences.length; i++){
            textArrayOrigin[i] = sentences[i].trim().split(" ");
            textArrayClean[i] = new String[textArrayOrigin[i].length];
        }

        for (int i = 0; i < textArrayClean.length; i++){
            for (int j = 0; j < textArrayClean[i].length; j++){
                textArrayClean[i][j] = textArrayOrigin[i][j].replaceAll("[^a-zA-Z ]", "").toLowerCase();
                freqToken.merge(textArrayClean[i][j], 1, Integer::sum);
            }
        }

        for (int i = 0; i < textArrayOrigin.length; i++){
            for (int j = 0; j < textArrayOrigin[i].length; j++){
                System.out.printf("Original[%d,%d]: %s\nProcessed[%d,%d]: %s\n", i, j, textArrayOrigin[i][j], i, j, textArrayClean[i][j]);
            }
        }

        
        System.out.println("Word counts:");
        freqToken.forEach((key, value) -> {
        System.out.println(key + ": " + value);
        
        });

        scanner.close();
    }
}
