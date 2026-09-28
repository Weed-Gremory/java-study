import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class LocalDateTimeUsage {
    public static String processDateTime(String dateTimeStr, int amount, String unit, String operation) {
        // Write your code here

        if (!operation.equalsIgnoreCase("add") && !operation.equalsIgnoreCase("subtract")) return "Invalid operation";
        if (!unit.equalsIgnoreCase("hours") && !unit.equalsIgnoreCase("days") && !unit.equalsIgnoreCase("months")) return "Invalid unit";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime currentTime;
        
        try {
            currentTime = LocalDateTime.parse(dateTimeStr, formatter);
        } catch (DateTimeParseException e){
            return "Invalid date time format";
        }
        
        LocalDateTime newTime;

        if (operation.equalsIgnoreCase("add")){
            if (unit.equalsIgnoreCase("hours")){
                newTime = currentTime.plusHours(amount);
            } else if (unit.equalsIgnoreCase("days")){
                newTime = currentTime.plusDays(amount);
            } else {
                newTime = currentTime.plusMonths(amount);
            }
            
        } else {
            if (unit.equalsIgnoreCase("hours")){
                newTime = currentTime.minusHours(amount);
            } else if (unit.equalsIgnoreCase("days")){
                newTime = currentTime.minusDays(amount);
            } else {
                newTime = currentTime.minusMonths(amount);
            }
        }

        String result = String.format("Original: %s, New: %s, Day: %s", currentTime.format(formatter), newTime.format(formatter), newTime.getDayOfWeek());

        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateTimeStr = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        String unit = scanner.nextLine();
        String operation = scanner.nextLine();
        
        System.out.println(processDateTime(dateTimeStr, amount, unit, operation));

        scanner.close();
    }
}
