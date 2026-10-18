import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();

        System.out.printf("Switchable methods: turnOn, turnOff\nAdjustable methods: setLevel\nMax level constant: %d\nSetting level to: %d", Adjustable.MAX_LEVEL, level);

        scanner.close();
        
        // TODO: Imprima informações sobre as interfaces
        // Imprima: "Switchable methods: turnOn, turnOff"
        // Imprima: "Adjustable methods: setLevel"
        // Imprima: "Max level constant: " seguido por Adjustable.MAX_LEVEL
        // Imprima: "Setting level to: " seguido pelo nível de entrada
        
    }
}

