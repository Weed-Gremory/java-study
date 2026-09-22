import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;

public class RecapHashSet {
    public static String processHashSet(HashSet<Object> set, Object input, String operation) {
        // Write your code here

        if (set == null){
            return "Invalid set";            
        }
        if (operation == null){
            return "Invalid operation";
        }
        if (input == null){
            return "Invalid input";
        }

        String result = switch (operation){
            case "add" -> {
                if (set.contains(input)){
                    yield "Element already exists";
                } else {
                    set.add(input);
                    yield "Added successfully";
                }
            }
            case "remove" -> {
                if (set.contains(input)){
                    set.remove(input);
                    yield "Removed successfully";
                } else {
                    yield "Element not exists";
                }
            }
            case "find" -> {
                if (input == null){
                    yield "Cannot find null";
                }

                int index = 0;
                int resultFind = -1;

                search:
                for (Object item : set){
                    if (item.equals(input)){
                        resultFind = index;
                        break search;
                    }
                    index ++;
                }

                if (resultFind != -1){
                    yield "Found at index: " + resultFind;
                } else {
                    yield "Not found";
                }
            }
            case "count" -> {

                int count = set.size();

                yield "Number of elements: " + count;
            }
            default -> "Invalid operation";
        };

        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the initial set
        String[] items = scanner.nextLine().split(",");
        HashSet<Object> set = new HashSet<>();
        if (!items[0].equals("empty")) {
            for (String item : items) {
                // Try to parse as integer first
                try {
                    set.add(Integer.parseInt(item));
                } catch (NumberFormatException e) {
                    set.add(item);
                }
            }
        }
        
        // Read input
        String inputStr = scanner.nextLine();
        Object input;
        try {
            input = Integer.parseInt(inputStr);
        } catch (NumberFormatException e) {
            input = inputStr;
        }
        
        // Read operation
        String operation = scanner.nextLine();
        
        System.out.println(processHashSet(set, input, operation));

        scanner.close();
    }
}
