class JaggedArrays {
    public static int[][] createJaggedArray(int n) {
        // Write your code here

        int[][] result = new int[n][];

        for (int i = 0; i < n; i++){
            result[i] = new int[i + 1];

            for (int j = 0; j < result[i].length; j++){
                result[i][j] = (i + 1) * (j + 1);
            }
        }

        return result;
    }
}
