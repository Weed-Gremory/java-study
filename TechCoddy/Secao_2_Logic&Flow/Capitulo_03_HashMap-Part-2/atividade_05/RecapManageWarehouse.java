import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class RecapManageWarehouse {
    public static void manageWarehouse(HashMap<String, Integer> warehouse, String[] operations) {
        // Write your code here

        for (String comand : operations){
            String[] parameters = comand.split(" ");
            int quantity = 0;


            if (parameters[0].equalsIgnoreCase("add")){
                quantity = Integer.valueOf(parameters[2]);

                if (warehouse.containsKey(parameters[1])){
                    warehouse.put(parameters[1], warehouse.get(parameters[1]) + quantity);
                } else {
                    warehouse.put(parameters[1], quantity);
                }
            }

            if (parameters[0].equalsIgnoreCase("remove")){
                quantity = Integer.valueOf(parameters[2]);
                warehouse.put(parameters[1], warehouse.get(parameters[1]) - quantity);

                if (warehouse.get(parameters[1]) <= 0){
                    warehouse.remove(parameters[1]);
                }
            }

            if (parameters[0].equalsIgnoreCase("check")){
                if (warehouse.containsKey(parameters[1])){
                    System.out.printf("true\n");
                } else {
                    System.out.printf("false\n");
                }
            }

            if (parameters[0].equalsIgnoreCase("print")){

                for (Map.Entry<String, Integer> item : warehouse.entrySet()){
                    System.out.printf("Product: %s, Quantity: %d\n", item.getKey(), item.getValue());
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String warehouseString = scanner.nextLine();
        String operationsString = scanner.nextLine();

        // Convert JSON string to HashMap
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> warehouse = new Gson().fromJson(warehouseString, mapType);

        // Convert JSON string to Array
        String[] operations = new Gson().fromJson(operationsString, String[].class);

        manageWarehouse(warehouse, operations);

        scanner.close();
    }
}
