import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler entradas
        String songTitle = scanner.nextLine();
        String artistName = scanner.nextLine();
        String podcastTitle = scanner.nextLine();
        int episodeNumber = scanner.nextInt();

        Song m1 = new Song(songTitle, artistName);
        Media mu = m1;
        mu.play();
        Song m1a = (Song) mu;
        m1a.showArtist();

        Podcast p1 = new Podcast(podcastTitle, episodeNumber);
        Media po = p1;
        po.play();
        Podcast p1a = (Podcast) po;
        p1a.showEpisode();

        scanner.close();
        
        // TODO: Criar uma Song e fazer o upcast para uma referência Media
        
        // TODO: Chamar play() na referência Media (demonstra polimorfismo)
        
        // TODO: Fazer o downcast da referência Media de volta para Song
        
        // TODO: Chamar showArtist() na referência Song
        
        // TODO: Criar um Podcast e fazer o upcast para uma referência Media
        
        // TODO: Chamar play() na referência Media
        
        // TODO: Fazer o downcast da referência Media de volta para Podcast
        
        // TODO: Chamar showEpisode() na referência Podcast
    }
}
