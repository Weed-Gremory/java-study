import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler as entradas
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int version = scanner.nextInt();

        Document original = new Document(title, author, version);
        Document copia = original.clone();

        copia.setVersion(copia.getVersion() + 1);

        System.out.println("Original: " + original);
        System.out.println("Clone: " + copia);
        System.out.printf("Independent: %b", original != copia);

        scanner.close();


        
        // TODO: Criar um Document original com os valores de entrada
        
        // TODO: Clonar o documento original para criar uma cópia
        
        // TODO: Modificar a versão do clone incrementando-a em 1
        
        // TODO: Imprimir "Original: " seguido pelo documento original
        
        // TODO: Imprimir "Clone: " seguido pelo documento clonado
        
        // TODO: Imprimir "Independent: " seguido por true/false (verificar se original != clone)
        
    }
}