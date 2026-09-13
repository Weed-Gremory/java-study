import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class DesafioNestedHashMap {
    public static void printMostExpensiveProducts(HashMap<String, HashMap<String, Integer>> inventory) {
        // Write your code here

        if (inventory.isEmpty()){
            System.out.printf("No categories in inventory.\n");
        } else {
            for (Map.Entry<String, HashMap<String, Integer>> exter : inventory.entrySet()){
                HashMap<String, Integer> interMap = exter.getValue();
                String space = "  ";
                int maxValue = Integer.MIN_VALUE;
                String key = "";

                System.out.printf("Category: %s\n", exter.getKey());

                if (interMap == null || interMap.isEmpty()){
                    
                    System.out.printf("%sNo products available.\n", space);
                } else {
                    
                    for (Map.Entry<String, Integer> inter : interMap.entrySet()){
                        
                        if (maxValue < inter.getValue()){
                            maxValue = inter.getValue();
                            key = inter.getKey();
                        }
                    }
                    System.out.printf("%sMost Expensive Product: %s, Price: %d\n", space, key, maxValue);
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

        printMostExpensiveProducts(inventory);

        scanner.close();
    }
}
