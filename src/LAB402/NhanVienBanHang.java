package LAB402;

public class NhanVienBanHang extends NhanVien {
    private int soLuongBanDuoc;
    private double tienMoiSanPham;

    public NhanVienBanHang(String ten, String diaChi, int soLuongBanDuoc, double tienMoiSanPham) {
        super(ten, diaChi);
        this.soLuongBanDuoc = soLuongBanDuoc;
        this.tienMoiSanPham = tienMoiSanPham;
    }

    @Override
    public double tinhLuong() {
        return soLuongBanDuoc * tienMoiSanPham;
    }

    @Override
    public void hienThi() {
        System.out.println("Tên nhân viên bán hàng: " + ten);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Số lượng bán được: " + soLuongBanDuoc);
        System.out.println("Tiền mỗi sản phẩm: " + tienMoiSanPham);
        System.out.println("Lương: " + tinhLuong());
    }
}
