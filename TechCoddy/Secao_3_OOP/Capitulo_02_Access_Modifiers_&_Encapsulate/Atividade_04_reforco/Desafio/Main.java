import java.util.Scanner;

class Ticket {
    private final String eventName;
    private final int basePrice;
    private final int SERVICE_FEE = 2;
    private int ticketsSold = 0;

    public Ticket(String eventName, int basePrice) {
        this.eventName = eventName;
        this.basePrice = basePrice;
    }

    public String getEventName() {
        return this.eventName;
    }

    public String sell(int count) {
        ticketsSold += count;

        return "Sold " + count + " tickets";
    }

    public int totalRevenue() {
        return (basePrice + SERVICE_FEE) * ticketsSold;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String eventName = sc.nextLine();
        int basePrice = Integer.parseInt(sc.nextLine());
        int firstBatch = Integer.parseInt(sc.nextLine());
        int secondBatch = Integer.parseInt(sc.nextLine());
        Ticket t = new Ticket(eventName, basePrice);
        System.out.println("Event: " + t.getEventName());
        System.out.println(t.sell(firstBatch));
        System.out.println(t.sell(secondBatch));
        System.out.println("Total revenue: " + t.totalRevenue());

        sc.close();
    }
}
