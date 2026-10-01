import java.util.Scanner;

class Robot {
    private String name;
    private int battery;

    public Robot(String name, int battery) {
        this.name = name;
        this.battery = battery;
    }

    public String describe() {
        return String.format("%s (battery: %d%%)", name, battery);
    }

    public String status() {
        if (this.battery < 20) {
            return String.format("%s is running low!", name);
        } else {
            return String.format("%s is operational.", name);
        }       
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int battery = Integer.parseInt(sc.nextLine());
        Robot robot = new Robot(name, battery);
        System.out.println("Robot: " + robot.describe());
        System.out.println(robot.status());

        sc.close();
    }
}
