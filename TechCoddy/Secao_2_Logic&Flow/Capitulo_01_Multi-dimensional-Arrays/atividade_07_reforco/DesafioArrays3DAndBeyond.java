class DesafioArrays3DAndBeyond {
    public static String create3DGameBoard(int levels, int rows, int cols) {
        // Check for valid dimensions
        if (levels <= 0 || rows <= 0 || cols <= 0) {
            return "";
        }
        
        // Create and fill 3D array
        int[][][] board = new int[levels][rows][cols];
        
        // Fill the array with calculated values
        // Calculate base value (level + row + col + 3)
        // Multiply by 10 if cell is on any edge

        for (int i = 0; i < levels; i++){
            for (int j = 0; j < rows; j++){
                for (int k = 0; k < cols; k++){
                    board[i][j][k] = (i + 1) + (j + 1) + (k + 1);

                    if (i == 0 || i == (levels - 1) || j == 0 || j == (rows - 1) || k == 0 || k == (cols - 1)){
                        board[i][j][k] *= 10;
                    }
                }
            }
        }
        
        // Create output string using this exact format:
        String result = "";
        for (int l = 0; l < levels; l++) {
            result += "Level " + l + ":\n";
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    result += board[l][r][c];
                    if (c < cols - 1) result += " ";
                }
                result += "\n";
            }
            if (l < levels - 1) result += "\n";
        }
        
        return result;
    }
}
