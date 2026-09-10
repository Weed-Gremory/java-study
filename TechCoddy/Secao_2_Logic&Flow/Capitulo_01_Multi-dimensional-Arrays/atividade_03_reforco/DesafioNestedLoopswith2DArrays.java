import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class DesafioNestedLoopswith2DArrays {
    public static void printSum(int[][] array) {
        // Write your code here

        int[] sum = new int[array.length];

        for (int i= 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                sum[i] += array[i][j];
            }

            System.out.printf("Row %d sum: %d\n", i, sum[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrayString = scanner.nextLine();
        
        Type arrayType = new TypeToken<int[][]>(){}.getType();
        int[][] array = new Gson().fromJson(arrayString, arrayType);
        
        printSum(array);
    }
}
