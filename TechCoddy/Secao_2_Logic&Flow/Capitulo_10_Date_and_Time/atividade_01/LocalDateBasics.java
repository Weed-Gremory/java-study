import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class LocalDateBasics {
    public static String processDate(String dateStr, int days, String operation) {
        // Write your code here

        if (!operation.equalsIgnoreCase("add") && !operation.equalsIgnoreCase("subtract")) return "Invalid operation";

        LocalDate currentDate;
        
        try {
            currentDate = LocalDate.parse(dateStr);
        } catch (DateTimeParseException e){
            return "Invalid date format";
        }
        
        LocalDate newDate;

        if (operation.equalsIgnoreCase("add")){
            newDate = currentDate.plusDays(days);
        } else {
            newDate = currentDate.minusDays(days);
        }

        String result = String.format("Original: %s, New: %s, Day of week: %s", currentDate, newDate, newDate.getDayOfWeek());

        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateStr = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();
        
        System.out.println(processDate(dateStr, days, operation));

        scanner.close();
    }
}
