import java.util.Scanner;

public class DesafioIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        int time = scanner.nextInt();       // formato de 24 horas
        boolean isHoliday = scanner.nextBoolean();
        
        // Your code to determine ticket type and price
        String ticketType = "";
        int price = 0;
        
        if (age < 13){
            price = 8;
            ticketType = "CHILD";
        } else if (age >= 13 && age <= 17){
            price = 12;
            ticketType = "TEEN";
        } else if (age >= 18 && age <= 59){
            price = 15;
            ticketType = "ADULT";
        } else {
            price = 10;
            ticketType = "SENIOR";
        }

        if (ticketType == "CHILD" && isHoliday == true){
            price += 2;
        } else if (ticketType == "TEEN" && isHoliday == true){
            price += 3;
        } else if (ticketType == "ADULT" && isHoliday == true){
            price += 5;
        } else if (ticketType == "SENIOR" && isHoliday == true){
            price += 0;
        } else {
            price += 0;
        }

        if (ticketType == "ADULT" && time < 1700){
            price -= 3;
        } else if (ticketType == "SENIOR" && time < 1700){
            price -= 2;
        } else {
            price -= 0;
        }
        
        // Don't modify the code below
        System.out.println("Customer Age: " + age);
        System.out.println("Show Time: " + time);
        System.out.println("Holiday? " + isHoliday);
        System.out.println("-------------------");
        System.out.println("Ticket Type: " + ticketType);
        System.out.println("Final Price: $" + price);
        scanner.close();
    }
}
