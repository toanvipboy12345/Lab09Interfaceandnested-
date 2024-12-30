package lab404;

public class Staff extends Employee {
    private String title;

    public Staff(String name, String phoneNumber, String email, String department, double salary, String dateHired, String title) {
        super(name, phoneNumber, email, department, salary, dateHired);
        this.title = title;
    }

    @Override
    public double calculateBonus() {
        return 0.06 * getSalary();
    }

    @Override
    public int calculateVacation() {
        // Giả định nhân viên được nghỉ 4 tuần nếu làm trên 5 năm, 3 tuần nếu ít hơn
        return 4; // Quy tắc đơn giản
    }

    @Override
    public String toString() {
        return "Class: Staff, Name: " + getName() + ", Title: " + title + ", Email: " + getEmail();
    }
}
