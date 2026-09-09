import java.util.Scanner;

public class CommonArrayOperations {
    public static double[] calculateStats(int[] arr) {
        // Write your code here
        double[] result = new double[4];

        for (int number : arr){
            result[0] += number;
        }

        for (int number : arr){
            result[1] += number;
        } result[1] = result[1] / arr.length;

        result[2] = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (result[2] < arr[i]){
                result[2] = arr[i];
            }
        }

        result[3] = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (result[3] > arr[i]){
                result[3] = arr[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] arrString = text.split(",");
        int[] numbers = new int[arrString.length];
        for (int i = 0; i < arrString.length; i++) {
           numbers[i] = Integer.parseInt(arrString[i]);
        }
        double[] stats = calculateStats(numbers);
        System.out.println("Sum: " + stats[0]);
        System.out.println("Average: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
        System.out.println("Minimum: " + stats[3]);

        scanner.close();
    }
}
