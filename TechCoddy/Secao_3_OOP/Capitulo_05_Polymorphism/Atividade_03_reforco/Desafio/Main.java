import java.util.Scanner;
class Media {
    protected String title;
    
    public Media(String title) {
        this.title = title;
    }

    public void play() {
        System.out.println("Playing: " + this.title);
    }
}
class Song extends Media {
    private String artist;
    
    public Song(String title, String artist) {
        super(title);
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing song: " + title + " by " + artist);
    }

    public void showArtist() {
        System.out.println("Artist: " + this.artist);
    }
}

class Podcast extends Media {
    private int episode;
    
    public Podcast(String title, int episode) {
        super(title);
        this.episode = episode;
    }

    @Override
    public void play() {
        System.out.println("Playing podcast: " + title + " - Episode " + episode);
    }

    public void showEpisode() {
        System.out.println("Episode: " + this.episode);
    }
}

class Movie extends Media {
    private int duration;
    
    public Movie(String title, int duration) {
        super(title);
        this.duration = duration;
    }

    @Override
    public void play() {
        System.out.println("Playing movie: " + title + " (" + duration + " min)");
    }

    public void showDuration() {
        System.out.println("Duration: " + this.duration + " minutes");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Media m1 = new Song(sc.nextLine(), sc.nextLine());
        Media m2 = new Podcast(sc.nextLine(), Integer.parseInt(sc.nextLine()));
        Media m3 = new Movie(sc.nextLine(), Integer.parseInt(sc.nextLine()));
        
        m1.play();
        m2.play();
        m3.play();
        
        Song s1 = (Song) m1;
        s1.showArtist();

        Podcast p1 = (Podcast) m2;
        p1.showEpisode();
        
        Movie mv1 = (Movie) m3;
        mv1.showDuration();

        sc.close();
    }
}

