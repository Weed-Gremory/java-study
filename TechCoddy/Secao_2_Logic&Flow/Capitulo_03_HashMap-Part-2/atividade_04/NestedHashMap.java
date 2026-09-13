import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NestedHashMap {
    public static void printNestedInventory(HashMap<String, HashMap<String, Integer>> inventory) {
        // Iterate over each category in the outer HashMap
        // For each category, print "Category: "
        // If the inner map is empty, print "  (No products)"
        // Otherwise, iterate over each product and print "  Product: , Price: "
        // Write your code here

        for (Map.Entry<String, HashMap<String, Integer>> exter : inventory.entrySet()){
            HashMap<String, Integer> interMap = exter.getValue();
            String space = "  ";

            System.out.printf("Category: %s\n", exter.getKey());

            if (interMap == null || interMap.isEmpty()){
                
                System.out.printf("%s(No products)\n", space);
            } else {
                
                for (Map.Entry<String, Integer> inter : interMap.entrySet()){
                    System.out.printf("%sProduct: %s, Price: %d\n", space, inter.getKey(), inter.getValue());
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inventoryString = scanner.nextLine();

        // Convert JSON string to Nested HashMap
        Type inventoryType = new TypeToken<HashMap<String, HashMap<String, Integer>>>(){}.getType();
        HashMap<String, HashMap<String, Integer>> inventory = new Gson().fromJson(inventoryString, inventoryType);

        printNestedInventory(inventory);

        scanner.close();
    }
}
