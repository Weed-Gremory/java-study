import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler entradas
        String professorName = scanner.nextLine();
        String department = scanner.nextLine();
        String courseTitle = scanner.nextLine();
        int numberOfLectures = scanner.nextInt();

        Professor p1 = new Professor(professorName, department);
        Course c1 = new Course(courseTitle, p1, numberOfLectures);

        System.out.printf("%s\n\n%s", c1.getInfo(), c1.listLectures());

        scanner.close();
        
        // TODO: Criar um objeto Professor (existe independentemente - agregação)
        
        // TODO: Criar um objeto Course, passando o professor (agregação)
        // O course criará suas próprias lectures internamente (composição)
        
        // TODO: Imprimir o resultado de getInfo()
        
        // TODO: Imprimir uma linha vazia
        
        // TODO: Imprimir o resultado de listLectures()
        
    }
}