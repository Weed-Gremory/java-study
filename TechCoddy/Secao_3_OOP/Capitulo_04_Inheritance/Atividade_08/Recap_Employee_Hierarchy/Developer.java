// Classe Developer que estende Employee
class Developer extends Employee {

    private String language;

    public Developer (String receivedName, double receivedSalary, String receivedLanguage){
        super(receivedName, receivedSalary);
        language = receivedLanguage;
    }

    @Override
    public void work (){
        System.out.printf("%s is coding in %s\n", getName(), language);
    }

    public String getDeveloperDetails (){
        return String.format("Developer: %s earns $%.2f, Language: %s\n", getName(), getSalary(), language);
    }
    // TODO: Declare um campo para language (String)
    
    // TODO: Crie um construtor que aceite name, salary e language
    // Use super() para inicializar os campos da classe pai
    
    // TODO: Sobrescreva o método work() para imprimir: "[name] is coding in [language]"
    
    // TODO: Crie o método getDeveloperDetails() que retorna:
    // "Developer: [name] earns $[salary], Language: [language]"
    // Use String.format("%.2f", salary) para formatação
}
