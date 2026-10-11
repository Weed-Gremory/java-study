import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = scanner.nextInt();
        
        Counter[] c = new Counter[count];

        for (int i = 0; i < count; i++){
            c[i] = new Counter(i + 1);
        }

        System.out.printf("Square: %d\nCube: %d\nCircle area (radius=%d): %.2f\n", MathUtils.square(number), MathUtils.cube(number), number, MathUtils.circleArea(number));

        for (int i = 0; i < c.length; i++){
            System.out.printf("Counter %d created\n", c[i].getId());
        }

        System.out.printf("Total counters: %d", Counter.getTotalCount());

        scanner.close();
        
        // TODO: Use os métodos estáticos de MathUtils para calcular e imprimir:
        // - Square: [value]
        // - Cube: [value]
        // - Circle area (radius=[number]): [value] (formatado para 2 casas decimais)
        
        // TODO: Crie a quantidade 'count' de objetos Counter
        // Para cada Counter criado, imprima: Counter [id] created
        
        // TODO: Imprima o número total de contadores criados
        // Total counters: [count]
    }
}
