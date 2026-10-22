import java.util.Comparator;

// TODO: Implementar a interface Comparator<Employee>
class NameComparator implements Comparator<Employee> {
    
    // TODO: Implementar o método compare()
    // Ordenar por nome em ordem CRESCENTE (A a Z)
    // Dica: Use o método compareTo() da String
    @Override
    public int compare(Employee e1, Employee e2) {
        // TODO: Implementar este método
        return e1.getName().compareTo(e2.getName());
    }
}
