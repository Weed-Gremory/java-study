import java.util.Scanner;

public class DesafioStringBuilderBasics {
    public static String buildMessage(String greeting, String name, String action, boolean excited) {
        // Write your code here using StringBuilder

        if (greeting == null || name == null || action == null){
            return "Invalid input";
        }

        StringBuilder text = new StringBuilder();

        text.append(greeting + ", " + name + " is " + action + ".");

        if (excited){
            text.append("!");
        }

        return text.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String greeting = scanner.nextLine();
        String name = scanner.nextLine();
        String action = scanner.nextLine();
        boolean excited = Boolean.parseBoolean(scanner.nextLine());
        
        if (greeting.equals("null")) greeting = null;
        if (name.equals("null")) name = null;
        if (action.equals("null")) action = null;
        
        System.out.println(buildMessage(greeting, name, action, excited));

        scanner.close();
    }
}
