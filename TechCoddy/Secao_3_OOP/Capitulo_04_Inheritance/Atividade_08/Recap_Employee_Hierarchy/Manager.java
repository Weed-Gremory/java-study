// Classe Manager que estende Employee
class Manager extends Employee {

    private int teamSize;

    public Manager (String receivedName, double receivedSalary, int receivedTeamSize){
        super(receivedName, receivedSalary);
        teamSize = receivedTeamSize;
    }

    @Override
    public void work (){
        System.out.printf("%s is managing a team of %d\n", getName(), teamSize);
    }

    public String getManagerDetails (){
        return String.format("Manager: %s earns $%.2f, Team size: %d\n", getName(), getSalary(), teamSize);
    }
    // TODO: Declare um campo para teamSize (int)
    
    // TODO: Crie um construtor que receba name, salary e teamSize
    // Use super() para inicializar os campos da classe pai
    
    // TODO: Sobrescreva o método work() para imprimir: "[name] is managing a team of [teamSize]"
    
    // TODO: Crie o método getManagerDetails() que retorna:
    // "Manager: [name] earns $[salary], Team size: [teamSize]"
    // Use String.format("%.2f", salary) para formatação
}
