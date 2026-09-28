import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatting {
    public static String formatDate(String dateStr, String inputPattern, String outputPattern) {
        // Write your code here

        if (!inputPattern.equalsIgnoreCase("basic") && !inputPattern.equalsIgnoreCase("long") && !inputPattern.equalsIgnoreCase("short")) return "Invalid pattern";

        DateTimeFormatter basicPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter longPattern = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        DateTimeFormatter shortPattern = DateTimeFormatter.ofPattern("MM/dd/yy");
        DateTimeFormatter customPattern;
        LocalDate currentDate;
        StringBuilder result = new StringBuilder();
        
        try {
            if (inputPattern.equalsIgnoreCase("basic")){
                currentDate = LocalDate.parse(dateStr, basicPattern);
            } else if (inputPattern.equalsIgnoreCase("long")){
                currentDate = LocalDate.parse(dateStr, longPattern);
            } else {
                currentDate = LocalDate.parse(dateStr, shortPattern);
            }
        } catch (DateTimeParseException e){
            return "Invalid date format";
        }

        if (outputPattern.equalsIgnoreCase("basic")){
            result.append(currentDate.format(basicPattern));
        } else if (outputPattern.equalsIgnoreCase("long")){
            result.append(currentDate.format(longPattern));
        } else if (outputPattern.equalsIgnoreCase("short")){
            result.append(currentDate.format(shortPattern));
        } else {
            customPattern = DateTimeFormatter.ofPattern(outputPattern);
            result.append(currentDate.format(customPattern));
        }

        return result.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateStr = scanner.nextLine();
        String inputPattern = scanner.nextLine();
        String outputPattern = scanner.nextLine();
        
        System.out.println(formatDate(dateStr, inputPattern, outputPattern));

        scanner.close();
    }
}
