import java.util.Objects;

class Student {

    private String studentId;
    private String name;
    private double gpa;

    public Student (String receivedStudentId, String receivedName, double receivedGpa){
        studentId = receivedStudentId;
        name = receivedName;
        gpa = receivedGpa;
    }

    @Override
    public boolean equals (Object obj){
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Student s1 = (Student) obj;

        return studentId.equals(s1.studentId) && name.equals(s1.name);
    }

    @Override
    public int hashCode (){
        return Objects.hash(studentId, name);
    }
    // TODO: Declare três campos privados: studentId (String), name (String), gpa (double)
    
    // TODO: Crie um construtor que inicialize todos os três campos
    
    // TODO: Crie métodos getter para cada campo
    
    // TODO: Sobrescreva o método equals()
    // - Verifique se está comparando com a mesma referência (retorne true)
    // - Verifique se o outro é null ou de uma classe diferente (retorne false)
    // - Faça o cast e compare os campos studentId E name
    
    // TODO: Sobrescreva o método hashCode()
    // - Use Objects.hash() com os mesmos campos usados em equals()
}
