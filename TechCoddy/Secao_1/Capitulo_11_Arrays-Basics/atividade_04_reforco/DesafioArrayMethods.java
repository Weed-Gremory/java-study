import java.util.Arrays;

public class DesafioArrayMethods {
    // Write your methods here
    
    public static String[] createSeatingChart(String[] arrNames, int[] arrGrades){
        String[] nameGrade = new String[arrNames.length];

        for (int i = 0; i < arrNames.length; i++){
            nameGrade[i] = arrNames[i] + ": " + arrGrades[i];
        }

        Arrays.sort(nameGrade);

        return nameGrade;
    }

    public static String[] findTopStudents(int[] arrGrades){
        String[] gradesLetter = new String[arrGrades.length];

        for (int i = 0; i < arrGrades.length; i++){
            if (arrGrades[i] >= 90){
                gradesLetter[i] = "A+";
            } else {
                gradesLetter[i] = "A";
            }
        }

        return gradesLetter;
    }

    public static boolean isClassEqual(int[] arrGrades1, int[] arrGrades2){
        boolean grades = true;

        if (Arrays.equals(arrGrades1, arrGrades2)){
            grades = true;
        } else {
            grades = false;
        }

        return grades;
    }
    
    public static void main(String[] args) {
        // Test arrays
        String[] names = {"Tom", "Alice", "Bob"};
        int[] grades = {85, 92, 78};
        int[] grades2 = {85, 92, 78};
        
        // Test first method
        String[] seatingChart = createSeatingChart(names, grades);
        System.out.print("Seating Chart: ");
        System.out.println(Arrays.toString(seatingChart));
        
        // Test second method
        String[] gradeLetters = findTopStudents(grades);
        System.out.print("Grade Letters: ");
        System.out.println(Arrays.toString(gradeLetters));
        
        // Test third method
        boolean equalClasses = isClassEqual(grades, grades2);
        System.out.println("Classes Equal: " + equalClasses);
    }
}
