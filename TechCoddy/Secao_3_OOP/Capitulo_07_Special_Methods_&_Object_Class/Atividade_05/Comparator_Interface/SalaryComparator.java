import java.util.Comparator;

// TODO: Implementar a interface Comparator<Employee>
class SalaryComparator implements Comparator<Employee> {
    
    // TODO: Implementar o método compare()
    // Ordenar por salário em ordem DECRESCENTE (o maior salário primeiro)
    // Dica: Use Double.compare() para uma comparação segura
    // Lembre-se: Para ordem decrescente, inverta a comparação
    @Override
    public int compare(Employee e1, Employee e2) {
        // TODO: Implementar este método
        return Double.compare(e2.getSalary(), e1.getSalary());
    }
}
