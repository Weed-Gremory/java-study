// Classe base para todos os tipos de alimentos
class Food {
    private String name;
    
    public Food(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    @Override 
    public String toString() {
        return name;
    }
    
    // TODO: Sobrescrever toString() para retornar o nome do alimento
}

class Meat extends Food {
    public Meat(String name){
        super(name);
    }
}

class Vegetable extends Food {
    public Vegetable(String name){
        super(name);
    }
}

// TODO: Criar a classe Meat que estende Food


// TODO: Criar a classe Vegetable que estende Food
