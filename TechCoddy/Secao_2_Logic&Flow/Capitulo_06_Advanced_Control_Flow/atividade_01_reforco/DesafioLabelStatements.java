import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class DesafioLabelStatements {
    public static void skipNumber(int[][] grid, int skipValue, boolean skipRow) {
        // Write your code here

        outer:
            for (int i = 0; i < grid.length; i++){
                for (int j = 0; j < grid[i].length; j++){
                    if (grid[i][j] == skipValue){
                        if (skipRow){
                            System.out.printf("Skipping row: %d\n", i);
                            continue outer;
                        }

                        continue;
                    }
                    System.out.printf("Visited: %d,%d\n", i, j);
                }
            }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read JSON string representing a 2D array
        String gridString = scanner.nextLine();
        // Read the skip value
        int skipValue = Integer.parseInt(scanner.nextLine());
        // Read the skipRow flag
        boolean skipRow = Boolean.parseBoolean(scanner.nextLine());
        
        Type gridType = new TypeToken<int[][]>(){}.getType();
        int[][] grid = new Gson().fromJson(gridString, gridType);
        
        skipNumber(grid, skipValue, skipRow);

        scanner.close();
    }
}
