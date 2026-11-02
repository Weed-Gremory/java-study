class ArrayUtils {
    
    // TODO: Implemente getLast - um método genérico que recebe um array do tipo T
    // e retorna o último elemento. Retorne null se o array estiver vazio.
    public static <T> T getLast(T[] array) {
        if (array.length > 0){
            return array[array.length - 1];
        }
        // Seu código aqui
        return null;
    }
    
    // TODO: Implemente swap - um método genérico que recebe um array do tipo T
    // e dois índices inteiros, então troca os elementos nessas posições.
    public static <T> void swap(T[] array, int i, int j) {
        T value = array[i];
        array[i] = array[j];
        array[j] = value;
        // Seu código aqui
    }
    
    // TODO: Implemente printWithLabel - um método genérico com dois parâmetros de tipo K e V
    // Recebe um label do tipo K e um value do tipo V
    // Imprime no formato: [label]: [value]
    public static <K, V> void printWithLabel(K label, V value) {
        System.out.println(label + ": " + value);
        // Seu código aqui
    }
}
