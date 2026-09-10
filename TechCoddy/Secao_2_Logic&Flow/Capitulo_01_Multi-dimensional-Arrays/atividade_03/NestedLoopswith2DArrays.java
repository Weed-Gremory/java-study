class NestedLoopswith2DArrays {
    public static void printMatrix(int[][] matrix) {
        // Write your code here

        for (int i = 0; i < matrix.length; i++){
            
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println("");
        }        
    }
}
