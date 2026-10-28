import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        OldBox ob1 = new OldBox(word);
        System.out.println("OldBox (with cast): " + (String) ob1.getContent());

        GenericBox<String> gb1 = new GenericBox<String>(word);
        System.out.println("GenericBox (no cast): " + gb1.getContent());

        GenericBox<Integer> gb2 = new GenericBox<Integer>(number);
        System.out.println("GenericBox Integer: " + gb2.getContent());

        System.out.print("\nType safety: Generics catch errors at compile time!");

        scanner.close();
        
        // TODO: Crie um OldBox armazenando a word
        // Retrieve with cast to String and print: "OldBox (with cast): [value]"
        
        // TODO: Crie um GenericBox<String> armazenando a word
        // Retrieve without casting and print: "GenericBox (no cast): [value]"
        
        // TODO: Create a GenericBox<Integer> storing the number
        // Retrieve and print: "GenericBox Integer: [value]"
        
        // TODO: Imprima uma linha em branco, depois imprima:
        // "Type safety: Generics catch errors at compile time!"
    }
}
