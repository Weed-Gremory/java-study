class Student {
    // TODO: Define the four fields with different access modifiers:
    // - private: studentId (String)
    // - default (no modifier): grade (int)
    // - protected: name (String)
    // - public: school (String)

    private String studentId;
    int grade;
    protected String name;
    public String school;

    public Student (String receivedStudenId, String receivedName, int receivedGrade, String receivedSchool){
        studentId = receivedStudenId;
        grade = receivedGrade;
        name = receivedName;
        school = receivedSchool;
    }

    public String getInfo (){
        return String.format("[%s] %s - Grade %d at %s", studentId, name, grade, school);
    }
    
    
    // TODO: Create a constructor that takes all four parameters
    // and initializes all fields
    
    // TODO: Implement getInfo() method that returns:
    // "[studentId] name - Grade grade at school"
    
}
