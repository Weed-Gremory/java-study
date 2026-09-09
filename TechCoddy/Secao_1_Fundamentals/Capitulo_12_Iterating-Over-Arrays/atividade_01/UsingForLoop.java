import java.util.Scanner;

public class UsingForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] arr = text.split(",");
        // Write your code below

        System.out.print("[");
        boolean primeiro = true;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] != null && arr[i].length() > 5){
                
                if(!primeiro){
                    System.out.print(", ");
                }
                
                System.out.print(arr[i]);
                primeiro = false;
            }
        }

        System.out.println("]");

        scanner.close();
    }
}
