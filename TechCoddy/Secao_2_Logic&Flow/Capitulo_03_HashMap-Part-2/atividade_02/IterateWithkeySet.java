import java.util.HashMap;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class IterateWithkeySet {
    public static void printInventoryKeySet(HashMap<String, Integer> inventory) {
        // Write your code here using keySet()

        for (String product : inventory.keySet()){
            System.out.printf("Product: %s, Quantity: %d\n", product, inventory.get(product));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read JSON string input representing the inventory HashMap
        String inventoryString = scanner.nextLine();

        // Convert JSON string to HashMap
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> inventory = new Gson().fromJson(inventoryString, mapType);

        printInventoryKeySet(inventory);

        scanner.close();
    }
}
