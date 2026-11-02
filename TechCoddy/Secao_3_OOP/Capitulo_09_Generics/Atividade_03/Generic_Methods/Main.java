import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler entradas
        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        String[] array1 = {firstWord, secondWord};
        System.out.println("Last word: " + ArrayUtils.getLast(array1));

        Integer[] array2 = {firstNumber, secondNumber};
        ArrayUtils.swap(array2, 0, 1);
        System.out.println("After swap: " + array2[0] + ", " + array2[1]);

        ArrayUtils.printWithLabel(firstWord, firstNumber);
        ArrayUtils.printWithLabel(firstNumber, secondWord);

        scanner.close();
        
        // TODO: Crie um array String[] contendo ambas as palavras
        
        // TODO: Use ArrayUtils.getLast para obter o último elemento
        // Imprima: "Last word: [result]"
        
        // TODO: Crie um array Integer[] contendo ambos os números
        
        // TODO: Chame ArrayUtils.swap para trocar os elementos nos índices 0 e 1
        // Imprima: "After swap: [first], [second]"
        
        // TODO: Chame ArrayUtils.printWithLabel com firstWord como label e firstNumber como value
        
        // TODO: Chame ArrayUtils.printWithLabel com firstNumber como label e secondWord como value
    }
}
