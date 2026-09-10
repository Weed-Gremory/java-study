public class DesafioCommon2DArrayPatterns {
    public static void printAdvancedPatterns(int[][] matrix) {
        // Write your code here

        StringBuilder diag = new StringBuilder();
        StringBuilder antDiag = new StringBuilder();

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){

                if(i == j){
                    diag.append(matrix[i][j]).append(" ");
                }

                if(j == matrix[i].length - 1 - i){
                    if(matrix.length % 2 != 0 && j == matrix.length / 2 && i == matrix.length / 2){
                        continue;
                    }
                    antDiag.append(matrix[i][j]).append(" ");
                }
            }
        }

        StringBuilder spiral = new StringBuilder();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            // topo
            for (int j = left; j <= right; j++) {
                spiral.append(matrix[top][j]).append(" ");
            }
            top++;

            // direita
            for (int i = top; i <= bottom; i++) {
                spiral.append(matrix[i][right]).append(" ");
            }
            right--;

            // baixo
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    spiral.append(matrix[bottom][j]).append(" ");
                }
                bottom--;
            }

            // esquerda
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiral.append(matrix[i][left]).append(" ");
                }
                left++;
            }
        }

        System.out.printf("Both Diagonals: %s%s\nSpiral Order: %s", diag, antDiag, spiral);
    }
}
