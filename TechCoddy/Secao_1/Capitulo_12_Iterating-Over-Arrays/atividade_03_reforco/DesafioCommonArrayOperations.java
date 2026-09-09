public class DesafioCommonArrayOperations {
    public static String getClassStats(int[] grades) {
        // Write your code here

        String result ="";

        double avarage = 0;
        for (int number : grades){
            avarage += number;
        } avarage = avarage / grades.length;

        int highest = grades[0];
        for (int i = 1; i < grades.length; i++){
            if (highest < grades[i]){
                highest = grades[i];
            }
        }

        int lowest = grades[0];
        for (int i = 1; i < grades.length; i++){
            if (lowest > grades[i]){
                lowest = grades[i];
            }
        }

        int passing = 0;
        for (int number : grades){
            if (number >= 60){
                passing++;
            }
        }

        result = "Class Average: " + avarage +"\nHighest Grade: " + highest + "\nLowest Grade: " + lowest + "\nPassing Grades: " + passing + "/" + grades.length;

        return result;
    }
    
    public static String getLetterGrades(int[] grades) {
        // Write your code here

        String result = "";
        int a=0, b=0, c=0, d=0, f=0;

        for (int number : grades){
            switch (number / 10){
                case 10:
                case 9: 
                    a++;
                    break;
                case 8:
                    b++;
                    break;
                case 7:
                    c++;
                    break;
                case 6:
                    d++;
                    break;
                default:
                    f++;
            }
        }

        result = "A (90-100): " + a + "\nB (80-89): " + b + "\nC (70-79): " + c + "\nD (60-69): " + d + "\nF (0-59): " + f;

        return result;
    }
    
    public static String getImprovement(int[] start, int[] end) {
        // Write your code here

        String result = "";
        int[] improvement = new int[start.length];

        for (int i = 0; i < start.length; i++){
            improvement[i] = end[i] - start[i];
        }

        double avarage = 0;
        for (int number : improvement){
            avarage += number;
        } avarage = avarage / improvement.length;

        int most = improvement[0];
        for (int number : improvement){
            if (most < number){
                most = number;
            }
        }

        int students = 0;
        for (int i = 0; i < start.length; i++){
            if (start[i] < end[i])
            students++;
        }

        result = "Average Improvement: " + avarage + " points\nMost Improved: " + most + " points\nStudents Improved: " + students + "/" + start.length;
        
        return result;
    }
    
    public static void main(String[] args) {
        // Test data
        int[] grades = {85, 92, 78, 65, 88, 72, 89, 98, 93, 77};
        int[] startGrades = {72, 85, 68, 90, 77};
        int[] endGrades = {84, 90, 75, 92, 80};
        
        // Test getClassStats
        System.out.println("Class Statistics:");
        System.out.println(getClassStats(grades));
        
        // Test getLetterGrades
        System.out.println("\nGrade Distribution:");
        System.out.println(getLetterGrades(grades));
        
        // Test getImprovement
        System.out.println("\nImprovement Analysis:");
        System.out.println(getImprovement(startGrades, endGrades));
    }
}
