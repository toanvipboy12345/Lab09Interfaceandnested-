package lab404;
public class Student extends Person {
    private String program;

    public Student(String name, String phoneNumber, String email, String program) {
        super(name, phoneNumber, email);
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    @Override
    public String toString() {
        return "Class: Student, Name: " + getName() + ", Program: " + program + ", Email: " + getEmail();
    }
}
