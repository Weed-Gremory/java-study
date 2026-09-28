import java.util.Scanner;

public class TextInputAndStorage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        
        String[] sentences = text.split("\\.");
        String[][] textArray = new String[sentences.length][];

        scanner.close();
        
        // Write your code here

        for (int i = 0; i < sentences.length; i++){
            textArray[i] = sentences[i].trim().split(" ");
        }

        for (int i = 0; i < textArray.length; i++){
            for (int j = 0; j < textArray[i].length; j++){
                System.out.printf("Word[%d,%d]: %s\n", i, j, textArray[i][j]);
            }
        }
    }
}
