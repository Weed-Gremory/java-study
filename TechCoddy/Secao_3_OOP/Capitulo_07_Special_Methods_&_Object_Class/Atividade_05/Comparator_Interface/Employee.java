class Employee {

    private String name;
    private String department;
    private double salary;

    public Employee (String receivedName, String receivedDepartment, double receivedSalary){
        name = receivedName;
        department = receivedDepartment;
        salary = receivedSalary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
    // TODO: Declare três campos privados:
    // - name (String)
    // - department (String)
    // - salary (double)
    
    // TODO: Crie um construtor que inicialize todos os campos
    
    // TODO: Crie métodos getter para cada campo
    // - getName()
    // - getDepartment()
    // - getSalary()
    
    // TODO: Sobrescreva toString() para retornar:
    // [name] ([department]) - $[salary]
    @Override
    public String toString() {
        // TODO: Implemente este método
        return name + " (" + department + ") - $" + salary;
    }
}
