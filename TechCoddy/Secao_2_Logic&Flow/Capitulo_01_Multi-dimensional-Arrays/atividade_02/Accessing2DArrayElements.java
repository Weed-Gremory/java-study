class Accessing2DArrayElements {
    public static int getElement(int[][] matrix, int rowIndex, int colIndex) {
        // Write your code here

        if (rowIndex >= 0 && rowIndex < matrix.length
            && colIndex >= 0 && colIndex < matrix[0].length){
                return matrix[rowIndex][colIndex];
            } else {
                return -1;
            }
    }
}
