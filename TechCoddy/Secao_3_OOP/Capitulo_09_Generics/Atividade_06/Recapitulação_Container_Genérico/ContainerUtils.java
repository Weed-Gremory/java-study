import java.util.List;

class ContainerUtils {

    public static void printAll(Container<?> container){
        for (Object item : container.getAll()){
            System.out.println(item);
        }
    }

    public static double countItems(Container<? extends Number> container){
        double sum = 0;

        for (Number item : container.getAll()){
            sum += item.doubleValue();
        }

        return sum;
    }

    public static void addDefaults(Container<? super Integer> container){
        container.add(1);
        container.add(2);
        container.add(3);
    }

    public static <T> T getLastOrDefault(Container<T> container, T defaultValue){
        if (container.isEmpty()) {
            return defaultValue;
        }

        return container.get(container.size() - 1);
    }

    
    
    // TODO: Implementar printAll(Container<?> container)
    // Usa um wildcard não limitado para imprimir todos os elementos, um por linha
    
    // TODO: Implementar countItems(Container<? extends Number> container)
    // Usa um wildcard com limite superior para calcular a soma de todos os valores numéricos
    // Retorna o resultado como um double
    
    // TODO: Implementar addDefaults(Container<? super Integer> container)
    // Usa um wildcard com limite inferior para adicionar os inteiros 1, 2 e 3
    
    // TODO: Implementar <T> T getLastOrDefault(Container<T> container, T defaultValue)
    // Um método genérico que retorna o último elemento, ou defaultValue se estiver vazio
}
