package Bai1;

public abstract class NVDaoTao extends NhanVien {
    protected String chuyenMon;

    public NVDaoTao() {

    }

    public NVDaoTao(String maNhanVien, String hoTen, String trinhDo, double luongCoBan, String chuyenMon) {
        super(maNhanVien, hoTen, trinhDo, luongCoBan);
        this.chuyenMon = chuyenMon;
    }



}
