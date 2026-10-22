import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lê os dados do primeiro aluno
        String id1 = scanner.nextLine();
        String name1 = scanner.nextLine();
        double gpa1 = scanner.nextDouble();
        scanner.nextLine(); // consome a quebra de linha
        
        // Lê os dados do segundo aluno
        String id2 = scanner.nextLine();
        String name2 = scanner.nextLine();
        double gpa2 = scanner.nextDouble();

        Student s1 = new Student(id1, name1, gpa1);
        Student s2 = new Student(id2, name2, gpa2);

        System.out.printf("Same reference: %b\nContent equality: %b\nHash codes match: %b", s1.equals(s1), s1.equals(s2), s1.hashCode() == s2.hashCode());

        scanner.close();
        
        // TODO: Criar dois objetos Student usando os dados de entrada
        
        // TODO: Imprimir "Same reference: " seguido por se student1 é igual a si mesmo
        
        // TODO: Imprimir "Content equality: " seguido por se student1 é igual a student2
        
        // TODO: Imprimir "Hash codes match: " seguido por se ambos os alunos têm o mesmo hash code
    }
}
