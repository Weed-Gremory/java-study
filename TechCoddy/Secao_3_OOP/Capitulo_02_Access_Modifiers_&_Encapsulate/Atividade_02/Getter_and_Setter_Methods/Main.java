import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsiusInput = scanner.nextDouble();

        Temperature t1 = new Temperature();
        t1.setCelsius(celsiusInput);

        System.out.printf("Valid: %b\nFahrenheit: %.1f", t1.isValid(), t1.getFahrenheit());

        scanner.close();
        
        // TODO: Create a Temperature object
        
        // TODO: Use the setter to set the celsius value
        
        // TODO: Print whether the temperature is valid (format: "Valid: true" or "Valid: false")
        
        // TODO: Print the Fahrenheit equivalent (format: "Fahrenheit: X.X")
        // Hint: Use String.format("%.1f", value) for one decimal place
    }
}

