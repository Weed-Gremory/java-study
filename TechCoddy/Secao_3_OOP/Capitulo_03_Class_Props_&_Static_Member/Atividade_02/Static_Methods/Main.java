import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        
        System.out.printf("Vowels: %d\nReversed: %s\nPalindrome: %b", StringUtils.countVowels(text), StringUtils.reverse(text), StringUtils.isPalindrome(text));
        
        scanner.close();
        
        // TODO: Use os métodos estáticos de StringUtils para analisar o texto
        // Chame StringUtils.countVowels(text) para obter a contagem de vogais
        // Chame StringUtils.reverse(text) para obter a string invertida
        // Chame StringUtils.isPalindrome(text) para verificar se é um palíndromo
        
        // TODO: Imprima os resultados no formato:
        // Vowels: [count]
        // Reversed: [reversed string]
        // Palindrome: true/false
        
    }
}
