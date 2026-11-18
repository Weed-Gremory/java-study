import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String meatName = scanner.nextLine();
        String vegetableName = scanner.nextLine();

        ArrayList<Food> foods = new ArrayList<>(List.of(new Meat(meatName), new Vegetable(vegetableName)));

        System.out.println("Food inventory:");
        ZooFeeder.printInventory(foods);

        System.out.printf("\n Total food items: %d\n", ZooFeeder.calculateTotalFood(foods));

        ArrayList<Food> meatStock = new ArrayList<>();

        System.out.printf("\n Adding to meat stock...\n");

        ZooFeeder.addMeatToStock(meatStock, "Beef");

        System.out.println("Meat stock after adding:");

        ZooFeeder.printInventory(meatStock);


        
        // TODO: Crie um ArrayList<Food> e adicione objetos Meat e Vegetable
        
        // TODO: Imprima "Food inventory:" e depois chame printInventory
        
        // TODO: Imprima uma linha em branco e depois "Total food items: [count]" usando calculateTotalFood
        
        // TODO: Crie um novo ArrayList<Food> chamado meatStock
        
        // TODO: Imprima uma linha em branco e depois "Adding to meat stock..."
        
        // TODO: Chame addMeatToStock com meatStock e "Beef"
        
        // TODO: Imprima "Meat stock after adding:" e depois chame printInventory para meatStock
    }
}
