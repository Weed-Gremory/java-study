// Classe Podcast que estende Media
class Podcast extends Media {

    private int episode;

    public Podcast (String receivedTitle, int receivedEpisode){
        super(receivedTitle);
        episode = receivedEpisode;
    }

    @Override
    public void play (){
        System.out.printf("Playing podcast: %s - Episode %d\n", getTitle(), episode);
    }

    public void showEpisode (){
        System.out.println("Episode: " + episode);
    }
    // TODO: Declare o campo episode (int)
    
    // TODO: Crie um construtor que receba title e episode
    // Use super() para inicializar a classe pai
    
    // TODO: Sobrescreva play() para imprimir: Playing podcast: [title] - Episode [episode]
    
    // TODO: Adicione o método showEpisode() que imprime: Episode: [episode]
}
