public class DesafioModifyingArrays {
    // Write your methods here
    
    public static int[] improveGrade(int[] grade, int index){
        grade[index] += 5;

        return grade;
    }

    public static int[] replaceFailingGrade(int[] grade){
        for (int i = 0; i < grade.length; i++){
            if (grade[i] < 60){
                grade[i] = 60;
            }
        }
        
        return grade;
    }

    public static int[] addBonusPoints(int[] grade){
        for (int i = 0; i < grade.length; i++){
            grade[i] += 2;
        }

        return grade;
    }
    
    public static void main(String[] args) {
        // Test your methods with these values
        int[] grades = {70, 85, 55};
        
        improveGrade(grades, 0);
        System.out.print("After improving grade: [");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        
        replaceFailingGrade(grades);
        System.out.print("After replacing failing: [");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        
        addBonusPoints(grades);
        System.out.print("After adding bonus: [");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
