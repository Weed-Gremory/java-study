import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lê três funcionários da entrada
        // Formato de cada linha: name,department,salary
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();

        String[] data1 = line1.split(",");
        String[] data2 = line2.split(",");
        String[] data3 = line3.split(",");

        Employee employee1 = new Employee(
            data1[0],
            data1[1],
            Double.parseDouble(data1[2])
        );

        Employee employee2 = new Employee(
            data2[0],
            data2[1],
            Double.parseDouble(data2[2])
        );

        Employee employee3 = new Employee(
            data3[0],
            data3[1],
            Double.parseDouble(data3[2])
        );

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        Collections.sort(employees, new SalaryComparator());

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println();

        Collections.sort(employees, new NameComparator());

        for (Employee employee : employees) {
            System.out.println(employee);
        }
        
        scanner.close();
        // TODO: Analisar cada linha e criar objetos Employee
        // Dica: Use split(",") para separar os valores
        
        // TODO: Criar um ArrayList de funcionários e adicionar os três
        
        // TODO: Ordenar por salário usando SalaryComparator e imprimir cada funcionário
        // Dica: Use Collections.sort(list, comparator)
        
        // TODO: Imprimir uma linha vazia
        
        // TODO: Ordenar por nome usando NameComparator e imprimir cada funcionário
    }
}
