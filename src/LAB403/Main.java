package LAB403;

public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng Document
        Document doc = new Document("Đây là nội dung ban đầu.");

        // Ghi nội dung vào file
        String filename = "document.txt";
        doc.write(filename);

        // Đọc nội dung từ file
        doc.read(filename);

        // Mã hóa nội LAB404
        doc.encrypt();

        // Giải mã nội dung
        doc.decrypt();
    }
}
