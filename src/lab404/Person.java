package lab404;

public class Person {
    private String name;
    private String phoneNumber;
    private String email;

    public Person(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Class: Person, Name: " + name + ", Email: " + email;
    }
}
