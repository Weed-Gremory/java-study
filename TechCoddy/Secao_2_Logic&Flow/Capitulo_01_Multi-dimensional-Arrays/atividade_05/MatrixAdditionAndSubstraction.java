class MatrixAdditionAndSubstraction {
    public static int[][] subMatrices(int[][] matrix1, int[][] matrix2) {
        // Write your code here

        int[][] result = new int[matrix1.length][matrix1[0].length];
        
        for (int i = 0; i < matrix1.length; i++){
            for (int j =0; j < matrix1[i].length; j++){
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }
}
