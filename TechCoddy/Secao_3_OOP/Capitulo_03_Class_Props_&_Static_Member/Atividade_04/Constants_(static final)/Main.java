import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        double area = MathConstants.PI * radius * radius;
        double circumference = 2 * MathConstants.PI * radius;
        double goldenDiameter = 2 * radius * MathConstants.GOLDEN_RATIO;

        System.out.printf("Area: %.2f\nCircumference: %.2f\nGolden Diameter: %.2f", area, circumference, goldenDiameter);
        
        
        // TODO: Calcule a área usando MathConstants.PI
        // Fórmula: PI * radius * radius
        
        // TODO: Calcule a circunferência usando MathConstants.PI
        // Fórmula: 2 * PI * radius
        
        // TODO: Calcule o diâmetro dourado usando MathConstants.GOLDEN_RATIO
        // Fórmula: 2 * radius * GOLDEN_RATIO
        
        // TODO: Imprima os resultados formatados com 2 casas decimais
        // Use String.format("%.2f", value) para formatação
        // Formato de saída:
        // Area: [value]
        // Circumference: [value]
        // Golden Diameter: [value]
        
    }
}