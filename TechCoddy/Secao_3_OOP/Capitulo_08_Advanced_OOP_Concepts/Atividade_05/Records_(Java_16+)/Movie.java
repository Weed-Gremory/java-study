// TODO: Crie um record chamado Movie com três componentes:
// - title (String)
// - genre (String)
// - durationMinutes (int)

// TODO: Adicione um método personalizado getFormattedDuration() que retorna
// a duração no formato: "[hours]h [minutes]m"
// Exemplo: 142 minutos se tornam "2h 22m"
// Dica: Use divisão inteira (/) para as horas e módulo (%) para os minutos restantes

record Movie(String title, String genre, int durationMinutes) {
    
    public String getFormattedDuration (){
        int hours = durationMinutes / 60;
        int minutes = durationMinutes - (hours * 60);

        return hours + "h " + minutes + "m";
    }
    // TODO: Implemente o método getFormattedDuration()
    
}
