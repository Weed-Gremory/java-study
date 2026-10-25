// TODO: Crie um record chamado Ticket com três componentes:
// - movie (Movie)
// - seatNumber (String)
// - price (double)

// TODO: Adicione um construtor compacto que valida o preço
// Se price <= 0, lance IllegalArgumentException com a mensagem "Price must be positive"

// TODO: Adicione um método personalizado printTicket() que retorna uma string de múltiplas linhas:
// ========== TICKET ==========
// Movie: [título do filme]
// Genre: [gênero do filme]
// Duration: [duração formatada do movie]
// Seat: [seatNumber]
// Preço: $[price]
// ============================

record Ticket(Movie movie, String seatNumber, double price) {
    
    public Ticket {
        if (price <= 0) throw new IllegalArgumentException("Price must be positive");
    }

    public String printTicket (){
        return "========== TICKET ==========\nMovie: " + movie.title() + "\nGenre: " + movie.genre() + "\nDuration: " + movie.getFormattedDuration() + "\nSeat: " + seatNumber + "\nPrice: $" + price + "\n============================";
    }
    
    // TODO: Adicione um construtor compacto com validação de preço
    
    // TODO: Implemente o método printTicket()
    
}
