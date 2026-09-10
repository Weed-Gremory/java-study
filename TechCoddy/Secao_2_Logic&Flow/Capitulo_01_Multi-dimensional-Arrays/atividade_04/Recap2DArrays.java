class Recap2DArrays {
    public static int[] processMatrix(int[][] matrix) {
        // Write your code here

        int[] result = new int[3];
        result[1] = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                result[0] += matrix[i][j];

                int max = matrix[i][j];

                if (max > result[1]){
                    result[1] = max;
                }

                if (matrix[i][j] % 2 == 0){
                    result[2]++;
                }

            }
        }

        return result;
    }
}
