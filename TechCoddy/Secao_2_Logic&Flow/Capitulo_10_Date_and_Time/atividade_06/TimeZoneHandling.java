import java.util.Scanner;
import java.time.*;
import java.time.format.*;
import java.time.zone.ZoneRulesException;

public class TimeZoneHandling {
    public static String convertTime(String dateTimeStr, String sourceZone, String targetZone, boolean showOffset) {
        // Write your code here

        DateTimeFormatter formatterWithOutShowOffSet = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        DateTimeFormatter formatterWithShowOffSet = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm xxx");
        LocalDateTime currentTime;
        ZonedDateTime sourceTime;
        ZonedDateTime targetTime;
        StringBuilder result = new StringBuilder();
        
        try {
            currentTime = LocalDateTime.parse(dateTimeStr, formatterWithOutShowOffSet);
            sourceTime = currentTime.atZone(ZoneId.of(sourceZone));
            targetTime = sourceTime.withZoneSameInstant(ZoneId.of(targetZone));
        } catch (DateTimeParseException e){
            return "Invalid datetime format";
        } catch (ZoneRulesException e){
            return "Invalid time zone";
        }

        if (showOffset){
            result.append(String.format("Source: %s, Target: %s", sourceTime.format(formatterWithShowOffSet), targetTime.format(formatterWithShowOffSet)));
        } else {
            result.append(String.format("Source: %s, Target: %s", sourceTime.format(formatterWithOutShowOffSet), targetTime.format(formatterWithOutShowOffSet)));
        }

        return result.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateTimeStr = scanner.nextLine();
        String sourceZone = scanner.nextLine();
        String targetZone = scanner.nextLine();
        boolean showOffset = Boolean.parseBoolean(scanner.nextLine());
        
        System.out.println(convertTime(dateTimeStr, sourceZone, targetZone, showOffset));

        scanner.close();
    }
}
