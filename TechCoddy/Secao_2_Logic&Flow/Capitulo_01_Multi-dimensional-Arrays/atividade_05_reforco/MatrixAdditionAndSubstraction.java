class MatrixAdditionAndSubstraction {
    public static int[][] matrixOperation(int[][] matrix1, int[][] matrix2, String operator) {
        // Write your code here

        int[][] result = new int[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++){
            for (int j =0; j < matrix1[i].length; j++){

                if (operator.equalsIgnoreCase("add")){
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                } else {
                    result[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
        }

        return result;
    }
}
