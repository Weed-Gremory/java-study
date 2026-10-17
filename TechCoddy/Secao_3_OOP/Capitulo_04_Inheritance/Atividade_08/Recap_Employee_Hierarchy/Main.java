import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler as entradas
        String managerName = scanner.nextLine();
        double managerSalary = scanner.nextDouble();
        int teamSize = scanner.nextInt();
        scanner.nextLine(); // consumir a quebra de linha
        String developerName = scanner.nextLine();
        String language = scanner.nextLine();
        
        // O salário do desenvolvedor é fixado em 75000.0
        double developerSalary = 75000.0;

        Manager m1 = new Manager(managerName, managerSalary, teamSize);
        Developer d1 = new Developer(developerName, developerSalary, language);

        System.out.printf("%s", m1.getManagerDetails());
        m1.work();
        System.out.printf("%s", d1.getDeveloperDetails());
        d1.work();

        scanner.close();
        
        // TODO: Criar um objeto Manager com managerName, managerSalary e teamSize
        
        // TODO: Criar um objeto Developer com developerName, developerSalary e language
        
        // TODO: Imprimir os detalhes do gerente usando getManagerDetails()
        
        // TODO: Chamar o método work() do gerente
        
        // TODO: Imprimir os detalhes do desenvolvedor usando getDeveloperDetails()
        
        // TODO: Chamar o método work() do desenvolvedor
    }
}
