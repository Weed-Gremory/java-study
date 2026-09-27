import java.util.Scanner;

public class PatternMatching {
    public static String processExtendedValue(Object value) {
        // Write your code here using pattern matching

         String result;

        if (value instanceof Integer i){
            if (i % 2 == 0){
                result = String.format("Even Number: %d\n", i * 3);
            } else {
                result = String.format("Odd Number: %d\n", i * 2);
            }
        } else if (value instanceof String s){
            if (s.length() > 5){
                result = String.format("Long Text: %s\n", s.toLowerCase());
            } else {
                result = String.format("Short Text: %s\n", s.toUpperCase());
            }
        } else if (value instanceof Boolean b){
            if (b){
                result = String.format("Boolean: Yes\n");
            } else {
                result = String.format("Boolean: No\n");
            }
        } else {
            result = "Unsupported Type\n";
        }
        
        return result;        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String inputValue = scanner.nextLine();
        
        Object value = switch(type) {
            case "Integer" -> Integer.parseInt(inputValue);
            case "String" -> inputValue;
            case "Boolean" -> Boolean.parseBoolean(inputValue);
            default -> inputValue;
        };
        
        System.out.println(processExtendedValue(value));

        scanner.close();
    }
}
