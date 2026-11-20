import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler as entradas
        String word = scanner.nextLine();
        int intValue = Integer.parseInt(scanner.nextLine());
        double doubleValue = Double.parseDouble(scanner.nextLine());

        Container<String> stringContainer = new Container<>();

        stringContainer.add(word);
        stringContainer.add(word);

        System.out.println("String container:");
        ContainerUtils.printAll(stringContainer);

        Container<Double> doubleContainer = new Container<>();

        doubleContainer.add(doubleValue);

        System.out.println();
        System.out.println("Number sum: " + ContainerUtils.countItems(doubleContainer));

        Container<Number> numberContainer = new Container<>();

        ContainerUtils.addDefaults(numberContainer);

        System.out.println();
        System.out.println("After adding defaults:");
        ContainerUtils.printAll(numberContainer);

        Container<Integer> integerContainer = new Container<>();

        int result = ContainerUtils.getLastOrDefault(integerContainer, intValue);

        System.out.println();
        System.out.println("Last or default: " + result);

        scanner.close();
        
        // TODO: Criar um Container<String> e adicionar a palavra duas vezes
        // Imprimir "String container:" e depois usar ContainerUtils.printAll()
        
        // TODO: Criar um Container<Double> e adicionar o valor double
        // Imprimir uma linha em branco, depois "Number sum: [sum]" usando ContainerUtils.countItems()
        
        // TODO: Criar um Container<Number> e chamar ContainerUtils.addDefaults() nele
        // Imprimir uma linha em branco, depois "After adding defaults:" e usar ContainerUtils.printAll()
        
        // TODO: Criar um Container<Integer> vazio
        // Usar ContainerUtils.getLastOrDefault() com intValue como padrão
        // Imprimir uma linha em branco, depois "Last or default: [result]"
    }
}
