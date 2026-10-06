import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String studentId = scanner.nextLine();
        String name = scanner.nextLine();
        int enrollmentYear = scanner.nextInt();
        scanner.nextLine(); // consume newline
        String newName = scanner.nextLine();

        Student s1 = new Student(studentId, name, enrollmentYear);

        System.out.println(s1.getInfo());

        s1.setName(newName);

        System.out.println(s1.getInfo());

        scanner.close();
        
        // TODO: Create a Student object with the initial values
        
        // TODO: Print the student info before the name change
        
        // TODO: Update the student's name using the setter
        
        // TODO: Print the student info after the name change
    }
}
