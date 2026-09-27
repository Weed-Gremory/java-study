import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;

public class StringTokenizer {
    public static String analyzeTokens(String text, String delimiter, boolean caseSensitive) {
        // Write your code here

        if (text == null || text.isEmpty()) return "Invalid input";
        if (delimiter == null || delimiter.isEmpty()){
            delimiter = " ";
        }

        StringTokenizer tokens = new StringTokenizer(text, delimiter);
        int totalTokens = tokens.countTokens();
        int uniqueTokens = 0;
        Map<String, Integer> freqTokens = new LinkedHashMap<>();
        Map<String, String> originalForm = new LinkedHashMap<>();
        int numNumber = 0;
        StringBuilder numbers = new StringBuilder();
        int numWord = 0;
        StringBuilder word = new StringBuilder();
        int numMixed = 0;
        StringBuilder mixed = new StringBuilder();
        int numSpecial = 0;
        StringBuilder special = new StringBuilder();
        double avaregeChar = 0;
        String longestToken = null;
        String shortestToken = null;
        String tokenMostFreq = null;
        int maxTokenMostFreq = 0;


        while (tokens.hasMoreTokens()){
            String token = tokens.nextToken();
            avaregeChar += token.length();

            String key = caseSensitive ? token : token.toLowerCase();

            freqTokens.merge(key, 1, Integer::sum);

            int currentFreq = freqTokens.get(key);

            if (currentFreq > maxTokenMostFreq) {
                maxTokenMostFreq = currentFreq;
                tokenMostFreq = token; // mantém forma original
            }

            if (token.matches("\\d+")){
                numNumber++;
                if (numNumber > 1){
                    numbers.append(", ");
                }

                numbers.append(token);
            } else if (token.matches("[a-zA-Z]+")){
                numWord++;
                if (numWord > 1){
                    word.append(", ");
                }
                
                word.append(token);
            } else if (token.matches("^(?=.*[a-zA-Z])(?=.*\\d).+$")){
                numMixed++;
                if (numMixed > 1){
                    mixed.append(", ");
                }

                mixed.append(token);
            } else {
                numSpecial++;
                if (numSpecial > 1){
                    special.append(", ");
                }

                special.append(token);
            }

            if (longestToken == null){
                longestToken = token;
            }
            if (token.length() > longestToken.length()){
                longestToken = token;
            }

            if (shortestToken == null){
                shortestToken = token;
            }
            if (token.length() < shortestToken.length()){
                shortestToken = token;
            }
        }

        uniqueTokens = freqTokens.size();
        avaregeChar = (double) avaregeChar / totalTokens;

        return "Basic Analysis:\nTotal tokens: " + totalTokens + "\nUnique tokens: " + uniqueTokens + "\nMost frequent: " + tokenMostFreq + " (" + maxTokenMostFreq + " times)\n\nCategories:\nNumbers: " + numNumber + " [" + numbers.toString() + "]\nWords: " + numWord + " [" + word.toString() + "]\nMixed: " + numMixed + " [" + mixed.toString() + "]\nSpecial: " + numSpecial + " [" + special.toString() + "]\n\nStatistics:\nAverage length: " + String.format("%.2f", avaregeChar) + "\nLongest token: " + longestToken + "\nShortest token: " + shortestToken;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String delimiter = scanner.nextLine();
        boolean caseSensitive = scanner.nextBoolean();
        
        if (text.equals("null")) text = null;
        if (delimiter.equals("null")) delimiter = null;
        
        System.out.println(analyzeTokens(text, delimiter, caseSensitive));

        scanner.close();
    }
}
