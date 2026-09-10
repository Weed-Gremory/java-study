class Common2DArrayPatterns {
    public static void printPatterns(int[][] matrix) {
        // Write your code here

        StringBuilder diag = new StringBuilder();
        StringBuilder antDiag = new StringBuilder();
        StringBuilder topBord = new StringBuilder();
        StringBuilder bottomBord = new StringBuilder();
        StringBuilder leftBord = new StringBuilder();
        StringBuilder rightBord = new StringBuilder();

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){

                if(i == j){
                    diag.append(matrix[i][j]).append(" ");
                }
                
                if(j == matrix[i].length - 1 - i){
                    antDiag.append(matrix[i][j]).append(" ");
                }
                
                if(i == 0){
                    topBord.append(matrix[i][j]).append(" ");
                }
                
                if(i == matrix.length - 1){
                    bottomBord.append(matrix[i][j]).append(" ");
                }
                
                if(j == 0){
                    leftBord.append(matrix[i][j]).append(" ");
                }
                
                if(j == matrix[i].length - 1){
                    rightBord.append(matrix[i][j]).append(" ");
                }
            }
        }

        System.out.printf("Main Diagonal: %s\nAnti-Diagonal: %s\nTop Border: %s\nBottom Border: %s\nLeft Border: %s\nRight Border: %s\n", diag, antDiag, topBord, bottomBord, leftBord, rightBord);
    }
}
