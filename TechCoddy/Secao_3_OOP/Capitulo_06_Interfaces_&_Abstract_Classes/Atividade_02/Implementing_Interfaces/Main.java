import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler entradas
        String humanName = scanner.nextLine();
        String robotModel = scanner.nextLine();

        Human h1 = new Human(humanName);
        Robot s1 = new Robot(robotModel);

        Speaker[] sp1 = {h1, s1};

        for (Speaker sp2 : sp1){
            System.out.println(sp2.speak());
        }

        scanner.close();
        
        // TODO: Criar um objeto Human com o nome fornecido
        
        // TODO: Criar um objeto Robot com o modelo fornecido
        
        // TODO: Criar um array de referências Speaker contendo ambos os objetos
        
        // TODO: Percorrer o array e imprimir o resultado de speak() para cada speaker
    }
}
