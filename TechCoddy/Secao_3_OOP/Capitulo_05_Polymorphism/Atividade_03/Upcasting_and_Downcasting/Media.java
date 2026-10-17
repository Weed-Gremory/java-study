// Classe base para todos os tipos de mídia
class Media {
    
    private String title;

    public Media (String receivedTitle){
        title = receivedTitle;
    }

    public String getTitle (){
        return title;
    }

    public void play (){
        System.out.println("Playing: " + title);
    }
    // TODO: Declare o campo title (String)
    
    // TODO: Crie um construtor que inicialize o title
    
    // TODO: Crie um método getter getTitle()
    
    // TODO: Crie um método play() que imprima: Playing: [title]
}
