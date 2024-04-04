package Bai1;

public class NVPhucVu extends NhanVien {

    public NVPhucVu() {
    }

    public NVPhucVu(String maNhanVien, String hoTen, String trinhDo, double luongCoBan) {
        super(maNhanVien, hoTen, trinhDo, luongCoBan);
    }

    @Override
    public double tinhLuong() {
        return luongCoBan;
    }


}
