// Classe Course - demonstra tanto agregação (Professor) quanto composição (Lectures)
class Course {

    private String title;
    private Professor professor;
    private Lecture[] lectures;

    public Course (String receivedTitle, Professor receivedProfessor, int receivedLectures){
        title = receivedTitle;
        professor = receivedProfessor;
        lectures = new Lecture[receivedLectures];

        for (int i = 0; i < receivedLectures; i++){
            lectures[i] = new Lecture("Topic " + (i + 1), 45);
        }
    }

    public String getInfo (){
        return String.format("Course: %s\nInstructor: %s\nLectures: %d", title, professor.toString(), lectures.length);
    }

    public String listLectures (){
        StringBuilder s1 = new StringBuilder();
        
        for (int i = 0; i < lectures.length; i++){
            s1.append(lectures[i].toString() + "\n");
        }

        return String.format("%s", s1);
    }
    // TODO: Declare os campos privados:
    // - title (String)
    // - professor (Professor) - agregação: passado de fora
    // - lectures (Lecture[]) - composição: criado internamente
    
    // TODO: Crie o construtor que recebe title, professor e numberOfLectures
    // - Armazene title e professor
    // - Crie o array lectures e preencha com novos objetos Lecture
    // - Cada lecture no índice i tem topic "Topic " + (i + 1) e duration 45
    
    // TODO: Crie o método getInfo() que retorna:
    // Course: [title]
    // Instructor: [professor.toString()]
    // Lectures: [número de lectures]
    
    // TODO: Criar o método listLectures() que retorna o toString() de cada lecture em sua própria linha
    
}