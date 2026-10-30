import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler entradas
        String recipientName = scanner.nextLine();
        String giftDescription = scanner.nextLine();
        int giftValue = scanner.nextInt();

        GiftBox<String> gb1 = new GiftBox<>(giftDescription);
        gb1.wrap();
        System.out.println(gb1.getStatus());

        GiftBox<Integer> gb2 = new GiftBox<>(giftValue);
        System.out.println(gb2.getStatus());

        Registry<String, String> rg = new Registry<>(recipientName, giftDescription);
        System.out.println(rg.getEntry());

        scanner.close();
        
        // TODO: Criar um GiftBox<String> contendo a descrição do presente
        // TODO: Embrulhá-lo usando o método wrap()
        // TODO: Imprimir seu status usando getStatus()
        
        // TODO: Criar um GiftBox<Integer> contendo o valor do presente
        // TODO: Não embrulhe este - imprima seu status (deve mostrar desembrulhado)
        
        // TODO: Criar um Registry<String, String> pareando o destinatário com a descrição do presente
        // TODO: Imprimir a entrada do registro usando getEntry()
    }
}
