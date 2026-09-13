import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class DesafioIteratewithentrySet {
    public static void printMostStockedProduct(HashMap<String, Integer> inventory) {
        // Write your code here using entrySet()

        if (inventory.isEmpty()){
            System.out.printf("No products in inventory.\n");
        } else {
            int maxValue = Integer.MIN_VALUE;
            String key = "";

            for (Map.Entry<String, Integer> entry : inventory.entrySet()){
                if(entry.getValue() > maxValue){
                    maxValue = entry.getValue();
                    key = entry.getKey();
                }
            }

            System.out.printf("Most Stocked Product: %s, Quantity: %d", key, maxValue);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read JSON string input representing the inventory HashMap
        String inventoryString = scanner.nextLine();

        // Convert JSON string to HashMap
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> inventory = new Gson().fromJson(inventoryString, mapType);

        printMostStockedProduct(inventory);

        scanner.close();
    }
}
