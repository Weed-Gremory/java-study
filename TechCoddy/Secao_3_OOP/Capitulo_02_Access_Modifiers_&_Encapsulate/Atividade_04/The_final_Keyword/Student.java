class Student {

    private final String studentId;
    private final int enrollmentYear;
    private String name;

    public Student (String receivedStudentId, String receivedName, int receivedEnrollmentYear){
        studentId = receivedStudentId;
        enrollmentYear = receivedEnrollmentYear;
        name = receivedName;
    }

    public String getStudentId (){
        return studentId;
    }

    public int getEnrollmentYear (){
        return enrollmentYear;
    }

    public String getName (){
        return name;
    }

    public void setName (String newName){
        name = newName;
    }

    public String getInfo (){
        return String.format("ID: %s | Name: %s | Enrolled: %d", studentId, name, enrollmentYear);
    }
    // TODO: Declare a final field for studentId (String)
    
    // TODO: Declare a final field for enrollmentYear (int)
    
    // TODO: Declare a private field for name (String) - this one is NOT final
    
    // TODO: Create a constructor that takes studentId, name, and enrollmentYear
    // and initializes all fields
    
    // TODO: Create getter getStudentId()
    
    // TODO: Create getter getEnrollmentYear()
    
    // TODO: Create getter getName()
    
    // TODO: Create setter setName(String name)
    
    // TODO: Create method getInfo() that returns:
    // "ID: [studentId] | Name: [name] | Enrolled: [enrollmentYear]"
}
