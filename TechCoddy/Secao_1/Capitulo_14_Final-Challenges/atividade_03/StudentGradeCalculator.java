import java.util.Scanner;

public class StudentGradeCalculator {
    public static double calculateAverageGrade(int[] grades) {
        // Write your code here

        int total = 0;
        double average = 0;

        for(int grade : grades){
            total += grade;
        }

        average = (double) total / (double) grades.length;

        return average;        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] stringArr = text.split(",");
        int[] studentGrades = new int[stringArr.length];
        for (int i = 0; i < stringArr.length; i++) {
           studentGrades[i] = Integer.parseInt(stringArr[i]);
        }
        double averageGrade = calculateAverageGrade(studentGrades);
        System.out.printf("Average grade: %.2f", averageGrade);

        scanner.close();
    }
}
