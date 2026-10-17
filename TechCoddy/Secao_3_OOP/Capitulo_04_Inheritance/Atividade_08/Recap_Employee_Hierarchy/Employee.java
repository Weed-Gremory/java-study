// Classe base para todos os funcionários
class Employee {

    private String name;
    private double salary;

    public Employee (String receivedName, double receivedSalary){
        name = receivedName;
        salary = receivedSalary;
    }

    public String getDetails (){
        return String.format("%s earns $%.2f\n", name, salary);
    }

    public void work (){
        System.out.printf("%s is working\n", name);
    }

    public String getName (){
        return name;
    }

    public double getSalary (){
        return salary;
    }
    // TODO: Declare campos protegidos para name (String) e salary (double)
    
    // TODO: Crie um construtor que inicialize name e salary
    
    // TODO: Crie o método getDetails() que retorna: "[name] earns $[salary]"
    // Use String.format("%.2f", salary) para formatação
    
    // TODO: Crie o método work() que imprime: "[name] is working"
}
