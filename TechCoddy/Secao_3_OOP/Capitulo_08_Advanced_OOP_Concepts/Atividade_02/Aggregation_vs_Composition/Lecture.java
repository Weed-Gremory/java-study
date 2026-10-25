// Classe Lecture - só faz sentido dentro de um curso (usada em composição)
class Lecture {

    private String topic;
    private int durationMinutes;

    public Lecture (String receivedTopic, int receivedDurationMinutes){
        topic = receivedTopic;
        durationMinutes = receivedDurationMinutes;
    }

    public String getTopic (){
        return topic;
    }

    public int getDurationMinutes (){
        return durationMinutes;
    }

    @Override
    public String toString (){
        return String.format("Lecture: %s (%d min)", topic, durationMinutes);
    }
    // TODO: Declarar campos privados: topic (String) e durationMinutes (int)
    
    // TODO: Criar construtor que inicializa ambos os campos
    
    // TODO: Criar métodos getter para topic e durationMinutes
    
    // TODO: Override toString() to return: Lecture: [topic] ([durationMinutes] min)
    
}