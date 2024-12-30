package LAB402;

public class Main {
    public static void main(String[] args) {
        // Tạo nhân viên bán hàng
        NhanVienBanHang nhanVienBanHang = new NhanVienBanHang("Nguyễn Văn A", "Hà Nội", 100, 50000);
        nhanVienBanHang.hienThi();

        System.out.println("----------------------");

        // Tạo công nhân
        CongNhan congNhan = new CongNhan("Trần Thị B", "Hồ Chí Minh", 200, 30000);
        congNhan.hienThi();
    }
}
