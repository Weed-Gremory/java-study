import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String studentId = scanner.nextLine();
        String name = scanner.nextLine();
        int grade = Integer.parseInt(scanner.nextLine());
        String school = scanner.nextLine();
        
        // TODO: Create a Student object with the input values
        
        Student p1 = new Student(studentId, name, grade, school);

        System.out.println(p1.school);
        System.out.println(p1.getInfo());

        scanner.close();
        
        // TODO: Print the school field directly (accessible because it's public)
        
        
        // TODO: Print the result of getInfo() to show all student information
        
    }
}
