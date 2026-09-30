public class Person {
    private String name;
    private int age;
    private String city;

    public Person(String receivedName, int receivedAge, String receivedCity){
        name = receivedName;
        age = receivedAge;
        city = receivedCity;
    }

    public String getDescription(){
        return String.format("%s, age %d, from %s", name, age, city);
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getCity(){
        return city;
    }
    
    // TODO: Create a constructor with parameters: name, age, city
    // Use 'this' keyword to assign each parameter to the field
    
    // TODO: Create getName() method that returns this.name
    
    // TODO: Create getAge() method that returns this.age
    
    // TODO: Create getCity() method that returns this.city
    
    // TODO: Create getDescription() method that returns:
    // "<name>, age <age>, from <city>"
    // Use 'this' keyword to access each field
}