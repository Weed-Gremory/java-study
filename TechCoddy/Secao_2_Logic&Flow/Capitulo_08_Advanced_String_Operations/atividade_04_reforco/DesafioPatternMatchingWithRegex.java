import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.List;

public class DesafioPatternMatchingWithRegex {
// Made by me.
    public static String analyzeText(String text) {
        // Write your code here

        if (text == null) return "Invalid input";
        if (text.isEmpty()) return "Empty text";

        StringBuilder results = new StringBuilder();

        // Find word and implementation.
        Pattern findWord = Pattern.compile("\\b[A-Za-z]+\\b");
        Matcher apliFindWord = findWord.matcher(text);

        int numWords = 0;
        List<Integer> posWords = new ArrayList<>();
        List<String> words = new ArrayList<>();

        while (apliFindWord.find()){

            numWords++;

            if (posWords.size() < 3){
                posWords.add(apliFindWord.start());
                words.add(apliFindWord.group());
            }
        }

        if (numWords > 0){
            results.append(String.format("Words: %d, positions: %s, found: %s\n", numWords, posWords.toString(), words.toString()));
        }
        
        // End of Find word

        // Find number and implementation.
        Pattern findNum = Pattern.compile("\\b\\d+(\\.\\d+)?\\b");
        Matcher apliFindNum = findNum.matcher(text);

        int numNumbers = 0;
        List<Integer> posNum = new ArrayList<>();
        List<String> nums = new ArrayList<>();

        while (apliFindNum.find()){

            numNumbers++;

            if (posNum.size() < 3){
                posNum.add(apliFindNum.start());
                nums.add(apliFindNum.group());
            }
        }

        if (numNumbers > 0){
            results.append(String.format("Numbers: %d, positions: %s, found: %s\n", numNumbers, posNum.toString(), nums.toString()));
        }
        
        // End of Find number

        // Find email and implementation.
        Pattern findEmail = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b");
        Matcher apliFindEmail = findEmail.matcher(text);

        int numEmails = 0;
        List<Integer> posEmails = new ArrayList<>();
        List<String> Emails = new ArrayList<>();

        while (apliFindEmail.find()){

            numEmails++;

            if (posEmails.size() < 3){
                posEmails.add(apliFindEmail.start());
                Emails.add(apliFindEmail.group());
            }
        }

        if (numEmails > 0){
            results.append(String.format("Emails: %d, positions: %s, found: %s\n", numEmails, posEmails.toString(), Emails.toString()));
        }
        
        // End of Find email

        // Find URLs and implementation.
        Pattern findURLs = Pattern.compile("\\bhttps?://[^\\s]+\\b");
        Matcher apliFindURLs = findURLs.matcher(text);

        int numURLs = 0;
        List<Integer> posURLs = new ArrayList<>();
        List<String> URLs = new ArrayList<>();

        while (apliFindURLs.find()){

            numURLs++;

            if (posURLs.size() < 3){
                posURLs.add(apliFindURLs.start());
                URLs.add(apliFindURLs.group());
            }
        }

        if (numURLs > 0){
            results.append(String.format("URLs: %d, positions: %s, found: %s", numURLs, posURLs.toString(), URLs.toString()));
        }
        
        // End of URLs word

        if (numEmails == 0 && numNumbers == 0 && numURLs == 0 && numWords == 0) return "No matches found";

        return results.toString();
    }
    
    public static boolean validateMatches(String text) {
        // Write your code here

        if (text == null) return false;
        
        Pattern findWord = Pattern.compile("\\b[A-Za-z]+\\b");
        Matcher apliFindWord = findWord.matcher(text);

        while (apliFindWord.find()){
            if (apliFindWord.group().length() < 3){
                return false;
            }   
        }

        Pattern findNum = Pattern.compile("\\b\\d+(\\.\\d+)?\\b");
        Matcher apliFindNum = findNum.matcher(text);

        while (apliFindNum.find()){
            if (Double.parseDouble(apliFindNum.group()) < 0){
                return false;
            }   
        }

        Pattern findURLs = Pattern.compile("\\bhttp://[^\\s]+\\b");
        Matcher apliFindURLs = findURLs.matcher(text);

        while (apliFindURLs.find()){
            return false;
        }

        Pattern findEmail = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b");
        Matcher apliFindEmail = findEmail.matcher(text);

        while (apliFindEmail.find()){
            if ((!apliFindEmail.group().endsWith(".com")) && (!apliFindEmail.group().endsWith(".org")) && (!apliFindEmail.group().endsWith(".net"))){
                return false;
            }
        }

        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        
        if (text.equals("null")) text = null;
        
        System.out.println(analyzeText(text));
        System.out.println(validateMatches(text));

        scanner.close();
    }
}
