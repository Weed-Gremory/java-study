// Classe Song que estende Media
class Song extends Media {

    private String artist;

    public Song (String receivedTitle, String receivedArtist){
        super(receivedTitle);
        artist = receivedArtist;
    }

    @Override
    public void play (){
        System.out.printf("Playing song: %s by %s\n", getTitle(), artist);
    }

    public void showArtist (){
        System.out.println("Artist: " + artist);
    }
    // TODO: Declare o campo artist (String)
    
    // TODO: Crie um construtor que receba title e artist
    // Use super() para inicializar a classe pai
    
    // TODO: Sobrescreva play() para imprimir: Playing song: [title] by [artist]
    
    // TODO: Adicione o método showArtist() que imprime: Artist: [artist]
}
