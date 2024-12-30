package lab404;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Student
        Student student = new Student("Nguyễn Văn A", "0123456789", "nguyenvana@gmail.com", "Computer Science");
        System.out.println(student);

        // Tạo đối tượng Faculty
        Faculty faculty = new Faculty("Trần Văn B", "0987654321", "tranvanb@gmail.com", "IT Department", 2000, "01/01/2020", "9AM-5PM", "Senior Lecturer");
        System.out.println(faculty);
        System.out.println("Bonus: " + faculty.calculateBonus());
        System.out.println("Vacation weeks: " + faculty.calculateVacation());

        // Tạo đối tượng Staff
        Staff staff = new Staff("Lê Thị C", "0111222333", "lethic@gmail.com", "HR Department", 1500, "01/01/2018", "Manager");
        System.out.println(staff);
        System.out.println("Bonus: " + staff.calculateBonus());
        System.out.println("Vacation weeks: " + staff.calculateVacation());
    }
}
