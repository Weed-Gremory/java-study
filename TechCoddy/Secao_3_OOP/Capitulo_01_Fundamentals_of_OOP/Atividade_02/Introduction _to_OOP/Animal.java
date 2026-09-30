public class Animal {
    // TODO: Create a String field called 'name'
    
    String name;
    // TODO: Create a constructor that takes a String name parameter and assigns it
    
    public Animal (String receivedName){
        name = receivedName;
    }
    // TODO: Create a method called makeSound() that returns a String: "<name> makes a sound!"

    public String makeSound(){
        return String.format("%s makes a sound!", name);
    }
}