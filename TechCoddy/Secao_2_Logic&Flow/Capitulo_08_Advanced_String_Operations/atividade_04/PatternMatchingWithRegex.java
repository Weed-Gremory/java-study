import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternMatchingWithRegex {
    public static String findWords(String text, String word) {
        // Write your code here

        StringBuilder results = new StringBuilder();

        if (text == null || word == null) return "Invalid input";

        Pattern findWordCat = Pattern.compile(word);
        Matcher apliFind = findWordCat.matcher(text);

        while (apliFind.find()){
            if (results.length() > 0){
                results.append(" ");
            }

            results.append(apliFind.start());
        }

        if (results.length() == 0){
            return "Not found";
        }

        return results.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String word = scanner.nextLine();
        
        if (text.equals("null")) text = null;
        if (word.equals("null")) word = null;
        
        System.out.println(findWords(text, word));

        scanner.close();
    }
}
