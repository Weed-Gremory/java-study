import java.util.Scanner;

public class StringBufferIntroduction {
    public static String modifyText(String text, String target, String replacement) {
        // Write your code here

        if (text == null || target == null || replacement == null) return "Invalid input";

        StringBuffer result = new StringBuffer(text);
        int pos = result.indexOf(target);

        if (pos == -1) return text + "!";

        result.replace(pos, pos + target.length(), replacement);
        result.append("!");

        return result.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String target = scanner.nextLine();
        String replacement = scanner.nextLine();
        
        if (text.equals("null")) text = null;
        if (target.equals("null")) target = null;
        if (replacement.equals("null")) replacement = null;
        
        System.out.println(modifyText(text, target, replacement));

        scanner.close();
    }
}
