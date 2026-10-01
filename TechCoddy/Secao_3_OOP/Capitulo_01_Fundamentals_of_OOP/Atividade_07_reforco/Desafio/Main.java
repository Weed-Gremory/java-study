import java.util.Scanner;

class Movie {
    private String title;
    private String director;
    private int year;
    private double rating;

    public Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }

    public boolean isClassic() {
        return year < 2000;
    }

    public String getInfo() {
        return String.format("%s (%d) by %s, rated %.1f", title, year, director, rating);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String director = sc.nextLine();
        int year = Integer.parseInt(sc.nextLine());
        double rating = Double.parseDouble(sc.nextLine());

        Movie movie = new Movie(title, director, year, rating);
        System.out.println(movie.getInfo());
        System.out.println("Classic: " + movie.isClassic());

        sc.close();
    }
}
