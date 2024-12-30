package lab404;
public abstract class Employee extends Person {
    private String department;
    private double salary;
    private String dateHired;

    public Employee(String name, String phoneNumber, String email, String department, double salary, String dateHired) {
        super(name, phoneNumber, email);
        this.department = department;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getDateHired() {
        return dateHired;
    }

    public abstract double calculateBonus();

    public abstract int calculateVacation();

    @Override
    public String toString() {
        return "Class: Employee, Name: " + getName() + ", Department: " + department + ", Email: " + getEmail();
    }
}
