package LAB403;

import java.io.*;

public class Document implements IStorage, IEncryptable {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    // Triển khai phương thức của IStorage
    @Override
    public void read(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            content = "";
            String line;
            while ((line = br.readLine()) != null) {
                content += line + "\n";
            }
            System.out.println("Nội dung đã đọc từ file:");
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("Đọc file thất bại: " + e.getMessage());
        }
    }

    @Override
    public void write(String filename) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write(content);
            System.out.println("Ghi file thành công.");
        } catch (IOException e) {
            System.out.println("Ghi file thất bại: " + e.getMessage());
        }
    }

    // Triển khai phương thức của IEncryptable
    @Override
    public String encrypt() {
        StringBuilder encrypted = new StringBuilder();
        for (char c : content.toCharArray()) {
            encrypted.append((char) (c + 3)); // Dịch mỗi ký tự lên 3 đơn vị
        }
        content = encrypted.toString();
        System.out.println("Nội dung sau khi mã hóa:");
        System.out.println(content);
        return content;
    }

    @Override
    public String decrypt() {
        StringBuilder decrypted = new StringBuilder();
        for (char c : content.toCharArray()) {
            decrypted.append((char) (c - 3)); // Dịch mỗi ký tự xuống 3 đơn vị
        }
        content = decrypted.toString();
        System.out.println("Nội dung sau khi giải mã:");
        System.out.println(content);
        return content;
    }
}
