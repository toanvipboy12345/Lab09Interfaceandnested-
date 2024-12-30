package LAB402;

public abstract class NhanVien {
    protected String ten;
    protected String diaChi;

    public NhanVien(String ten, String diaChi) {
        this.ten = ten;
        this.diaChi = diaChi;
    }

    // Phương thức trừu tượng tính lương
    public abstract double tinhLuong();

    // Phương thức trừu tượng hiển thị thông tin
    public abstract void hienThi();
}
