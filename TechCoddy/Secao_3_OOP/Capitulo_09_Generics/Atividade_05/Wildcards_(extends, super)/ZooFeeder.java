import java.util.List;

class ZooFeeder {

    public static void printInventory(List<?> items){
        for (Object item : items){
            System.out.println(item.toString());
        }
    }

    public static int calculateTotalFood(List<? extends Food> foods){
        return foods.size();
    }

    public static void addMeatToStock(List<? super Meat> stock, String meatName){
        Meat name = new Meat(meatName);
        stock.add(name);
    }
    
    // TODO: Crie o método printInventory usando um curinga sem limites (?)
    // Este método deve imprimir cada item da lista em sua própria linha
    
    
    // TODO: Crie o método calculateTotalFood usando um curinga com limite superior (? extends Food)
    // Este método deve retornar a quantidade de itens na lista
    
    
    // TODO: Crie o método addMeatToStock usando um curinga com limite inferior (? super Meat)
    // Este método deve criar um novo objeto Meat e adicioná-lo ao estoque
    
}
