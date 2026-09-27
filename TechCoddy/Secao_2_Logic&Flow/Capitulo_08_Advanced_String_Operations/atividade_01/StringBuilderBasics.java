import java.util.Scanner;

public class StringBuilderBasics {
    public static String buildPhrase(String start, String middle, String end) {
        // Write your code here

        if (start == null || middle == null || end == null){
            return ("Invalid input");
        }

        StringBuilder text = new StringBuilder(start);

        text.append(" " + middle + " " + end + "!");

        return text.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine();
        String middle = scanner.nextLine();
        String end = scanner.nextLine();
        
        if (start.equals("null")) start = null;
        if (middle.equals("null")) middle = null;
        if (end.equals("null")) end = null;

        System.out.println(buildPhrase(start, middle, end));

        scanner.close();
    }
}
