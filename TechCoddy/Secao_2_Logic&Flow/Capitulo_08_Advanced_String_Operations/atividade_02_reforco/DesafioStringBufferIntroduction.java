import java.util.Scanner;

public class DesafioStringBufferIntroduction {
    public static String processText(String text, String target, String replacement, int operations) {
        // Write your code here

        if (text == null || target == null || replacement == null) return "Invalid input";
        if (operations < 1 || operations > 3) return "Invalid operation";

        StringBuffer result = new StringBuffer(text);
        int pos = result.indexOf(target);

        if (operations == 1){
            while (pos != -1){
                result.replace(pos, pos + target.length(), replacement);
                pos = result.indexOf(target);
            }
        } else if (operations == 2){
            while (pos != -1){
                result.replace(pos, pos + target.length(), replacement);
                pos = result.indexOf(target);
            }
            
            result.reverse();
        } else {
            while (pos != -1){
                result.replace(pos, pos + target.length(), replacement);
                pos = result.indexOf(target);
            }

            result.reverse();
            result = new StringBuffer(result.toString().toUpperCase());
        }

        return result + "!";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String target = scanner.nextLine();
        String replacement = scanner.nextLine();
        int operations = scanner.nextInt();
        
        if (text.equals("null")) text = null;
        if (target.equals("null")) target = null;
        if (replacement.equals("null")) replacement = null;
        
        System.out.println(processText(text, target, replacement, operations));

        scanner.close();
    }
}
