import java.util.HashMap;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;


public class DesafioIterateWithkeySet {
    public static void printFilteredInventoryKeySet(HashMap<String, Integer> inventory) {
        // Write your code here using keySet()

        StringBuilder result = new StringBuilder();

        for (String item : inventory.keySet()){
            if (inventory.get(item) > 20){
                result.append(String.format("Product: %s, Quantity: %d\n", item, inventory.get(item)));
            }
        }

        if (result.length() == 0){
                result.append("No products with quantity greater than 20.");
            }

        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read JSON string input representing the inventory HashMap
        String inventoryString = scanner.nextLine();

        // Convert JSON string to HashMap
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> inventory = new Gson().fromJson(inventoryString, mapType);

        printFilteredInventoryKeySet(inventory);

        scanner.close();
    }
}
