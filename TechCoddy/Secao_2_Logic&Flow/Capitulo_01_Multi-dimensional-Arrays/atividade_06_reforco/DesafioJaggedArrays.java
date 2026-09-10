class DesafioJaggedArrays {
    public static int[][] processGrades(int numStudents, int[] subjectsPerStudent) {
        // Check if input is valid
        // Create jagged array based on number of students
        // For each student:
        //   - Create row with length matching their subject count
        //   - Fill with grades using formula: (studentNum + 1) * 10 + subjectNum
        
        int[][] result = new int[numStudents][];

        for (int i = 0; i < numStudents; i++){
            result[i] = new int[subjectsPerStudent[i]];

            for (int j = 0; j < result[i].length; j++){
                result[i][j] = (i + 1) * 10 + (j + 1);
            }
        }

        return result;
    }
}
