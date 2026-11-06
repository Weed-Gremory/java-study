import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler entradas
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        double double1 = scanner.nextDouble();
        double double2 = scanner.nextDouble();

        NumberStats<Integer> integerStats = new NumberStats<>(int1, int2);

        System.out.println("Integer sum: " + integerStats.getSum());
        System.out.println("Integer average: " + integerStats.getAverage());

        // NumberStats<Double>
        NumberStats<Double> doubleStats = new NumberStats<>(double1, double2);

        System.out.println("Double sum: " + doubleStats.getSum());
        System.out.println("Double average: " + doubleStats.getAverage());

        // ComparableBox<Integer>
        ComparableBox<Integer> integerBox = new ComparableBox<>(int1, int2);

        System.out.println("Max integer: " + integerBox.getMax());
        System.out.println("Max as double: " + integerBox.getMaxAsDouble());

        scanner.close();
        
        // TODO: Crie um NumberStats<Integer> com os dois valores inteiros
        // Imprima a soma e a média no formato:
        // Integer sum: [sum]
        // Integer average: [average]
        
        // TODO: Crie um NumberStats<Double> com os dois valores double
        // Imprima a soma e a média no formato:
        // Double sum: [sum]
        // Double average: [average]
        
        // TODO: Crie um ComparableBox<Integer> com os dois valores inteiros
        // Imprima o máximo e o máximo como double no formato:
        // Max integer: [max]
        // Max as double: [maxAsDouble]
    }
}
