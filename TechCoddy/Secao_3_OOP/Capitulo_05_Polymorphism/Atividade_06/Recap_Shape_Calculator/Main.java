import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler as entradas
        double radius = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        
        Circle c1 = new Circle(radius);
        Rectangle r1 = new Rectangle(width, height);
        Shape[] s1 = {c1, r1};

        for (Shape s2 : s1){
            System.out.println(s2.describe());
        }

        System.out.printf("Total area: %.2f", c1.getArea() + r1.getArea());

        scanner.close();

        // TODO: Criar um objeto Circle usando o radius
        
        // TODO: Criar um objeto Rectangle usando width e height
        
        // TODO: Criar um array de referências Shape e armazenar ambas as formas nele
        
        // TODO: Percorrer o array e imprimir a descrição de cada forma usando describe()
        
        // TODO: Calcular a área total de todas as formas
        // Use um loop ou acumulador para somar as áreas chamando getArea() em cada forma
        
        // TODO: Imprimir a área total com o formato: "Total area: [sum]"
        // Use String.format("%.2f", totalArea) para formatação
    }
}
