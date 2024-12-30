package lab404;

public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String phoneNumber, String email, String department, double salary, String dateHired, String officeHours, String rank) {
        super(name, phoneNumber, email, department, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public double calculateBonus() {
        return 1000 + 0.05 * getSalary();
    }

    @Override
    public int calculateVacation() {
        if (rank.equalsIgnoreCase("Senior Lecturer")) {
            return 5;
        } else {
            return 4;
        }
    }

    @Override
    public String toString() {
        return "Class: Faculty, Name: " + getName() + ", Rank: " + rank + ", Email: " + getEmail();
    }
}
