import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler entradas
        String title = scanner.nextLine();
        String genre = scanner.nextLine();
        int durationMinutes = Integer.parseInt(scanner.nextLine());
        String seatNumber = scanner.nextLine();
        double price = Double.parseDouble(scanner.nextLine());

        Movie movie = new Movie(title, genre, durationMinutes);
        Ticket ticket = new Ticket(movie, seatNumber, price);

        System.out.print(ticket.printTicket());

        scanner.close();
        
        // TODO: Crie um record Movie com title, genre e durationMinutes
        
        // TODO: Crie um record Ticket com o movie, seatNumber e price
        
        // TODO: Imprima o ticket usando o método printTicket()
        
    }
}
