package LAB402;

public class CongNhan extends NhanVien {
    private int soLuongSanPham;
    private double luongMoiSanPham;

    public CongNhan(String ten, String diaChi, int soLuongSanPham, double luongMoiSanPham) {
        super(ten, diaChi);
        this.soLuongSanPham = soLuongSanPham;
        this.luongMoiSanPham = luongMoiSanPham;
    }

    @Override
    public double tinhLuong() {
        return soLuongSanPham * luongMoiSanPham;
    }


    @Override
    public void hienThi() {
        System.out.println("Tên công nhân: " + ten);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Số lượng sản phẩm: " + soLuongSanPham);
        System.out.println("Lương mỗi sản phẩm: " + luongMoiSanPham);
        System.out.println("Lương: " + tinhLuong());
    }
}
