import java.util.Arrays;

class RecapAllAboutArrays {
    public static void arrayOperations(int[][] matrix) {
        // Write your code here

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int[] rowSums = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                sum += matrix[i][j];
                rowSums[i] += matrix[i][j];

                if (matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
    
    
        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + max);
        System.out.println("Row Sums: " + Arrays.toString(rowSums));

    }
}
