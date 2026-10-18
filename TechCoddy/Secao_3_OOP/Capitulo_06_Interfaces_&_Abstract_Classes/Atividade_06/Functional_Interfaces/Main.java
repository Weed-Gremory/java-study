import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String operation = scanner.nextLine();
        
        TextProcessor processor;

        if (operation.equals("upper")){
            processor = new TextProcessor(value -> value.toUpperCase());
        } else if (operation.equals("lower")){
            processor = new TextProcessor(value -> value.toLowerCase());
        } else {
            processor = new TextProcessor(value -> new StringBuilder(value).reverse().toString());
        }

        String result = processor.process(text);

        System.out.println("Result: " + result);

        scanner.close();
        
        // TODO: Com base no tipo de operação, crie um TextProcessor com a lambda apropriada:
        // - "upper": transforma o texto em maiúsculas
        // - "lower": transforma o texto em minúsculas
        // - "reverse": inverte o texto (dica: use StringBuilder)
        
        // TODO: Chame process() com o texto de entrada e imprima o resultado
        // Formato de saída: "Result: [transformed text]"
    }
}
