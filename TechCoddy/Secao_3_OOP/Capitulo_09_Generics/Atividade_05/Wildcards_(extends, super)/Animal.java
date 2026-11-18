// Classe base para todos os animais
class Animal {
    private String species;

    public Animal(String receivedSpecies) {
        species = receivedSpecies;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return species;
    }
    
    // TODO: Criar um construtor que inicialize species
    
    // TODO: Criar o método getSpecies()
}

class Carnivore extends Animal {
    public Carnivore(String receiveSpecies) {
        super(receiveSpecies);
    }
}

class Herbivore extends Animal {
    public Herbivore(String receiveSpecies) {
        super(receiveSpecies);
    }
}

// TODO: Criar a classe Carnivore que estenda Animal


// TODO: Criar a classe Herbivore que estenda Animal
