import java.util.Scanner;
import java.time.*;
import java.time.format.*;

public class PeriodAndDuration {
    public static String calculateDifference(String start, String end, String unit, String format) {
        // Write your code here

        if (!format.equalsIgnoreCase("full") && !format.equalsIgnoreCase("simple")) return "Invalid format";
        if (!unit.equalsIgnoreCase("period") && !unit.equalsIgnoreCase("duration")) return "Invalid unit";

        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime startTime;
        LocalDateTime endTime;
        StringBuilder resultTime = new StringBuilder();
        
        try {
            startTime = LocalDateTime.parse(start, formatterTime);
            endTime = LocalDateTime.parse(end, formatterTime);
        } catch (DateTimeParseException e){
            return "Invalid date format";
        }
        
        Period periodTime = Period.between(startTime.toLocalDate(), endTime.toLocalDate());
        Duration durationTime = Duration.between(startTime, endTime);

        if (unit.equalsIgnoreCase("period")){
            if (format.equalsIgnoreCase("full")){
                resultTime.append(String.format("Years: %d, Months: %d, Days: %d", periodTime.getYears(), periodTime.getMonths(), periodTime.getDays()));
            } else {
                resultTime.append(String.format("%dy%dm%dd", periodTime.getYears(), periodTime.getMonths(), periodTime.getDays()));
            }    
        } else {
            if (format.equalsIgnoreCase("full")){
                resultTime.append(String.format("Hours: %d, Minutes: %d", durationTime.toHours(), durationTime.toMinutesPart()));
            } else {
                resultTime.append(String.format("%dh%dm", durationTime.toHours(), durationTime.toMinutesPart()));
            }
        }

        return resultTime.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine();
        String end = scanner.nextLine();
        String unit = scanner.nextLine();
        String format = scanner.nextLine();
        
        System.out.println(calculateDifference(start, end, unit, format));
        
        scanner.close();
    }
}
