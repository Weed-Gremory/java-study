import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class LocalTimeOperations {
    public static String processTime(String timeStr, int amount, String unit, String operation) {
        // Write your code here

        if (!operation.equalsIgnoreCase("add") && !operation.equalsIgnoreCase("subtract")) return "Invalid operation";
        if (!unit.equalsIgnoreCase("hours") && !unit.equalsIgnoreCase("minutes")) return "Invalid unit";

        LocalTime currentTime;
        
        try {
            currentTime = LocalTime.parse(timeStr);
        } catch (DateTimeParseException e){
            return "Invalid time format";
        }
        
        LocalTime newTime;

        if (operation.equalsIgnoreCase("add")){
            if (unit.equalsIgnoreCase("hours")){
                newTime = currentTime.plusHours(amount);
            } else {
                newTime = currentTime.plusMinutes(amount);
            }
            
        } else {
            if (unit.equalsIgnoreCase("hours")){
                newTime = currentTime.minusHours(amount);
            } else {
                newTime = currentTime.minusMinutes(amount);
            }
        }

        String result = String.format("Original: %s, New: %s", currentTime, newTime);

        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String timeStr = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        String unit = scanner.nextLine();
        String operation = scanner.nextLine();
        
        System.out.println(processTime(timeStr, amount, unit, operation));

        scanner.close();
    }
}
