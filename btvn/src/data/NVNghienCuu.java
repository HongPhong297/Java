package data;

import java.util.Scanner;

public class NVNghienCuu extends NVQuanLy{
    private double phuCapDocHai;

    public NVNghienCuu() {
        super();
        this.phuCapDocHai = 0;
    }

    public NVNghienCuu(String maNhanVien, String tenNhanVien, int namSinh, String trinhDo, double luongCoBan, String truongDaoTao, String chuyenMon, double phuCapChucVu, double phuCapDocHai) {
        super(maNhanVien, tenNhanVien, namSinh, trinhDo, luongCoBan, truongDaoTao, chuyenMon, phuCapChucVu);
        this.phuCapDocHai = phuCapDocHai;
    }

    public double getPhuCapDocHai() {
        return phuCapDocHai;
    }

    public void setPhuCapDocHai(double phuCapDocHai) {
        this.phuCapDocHai = phuCapDocHai;
    }

    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhap phu cap doc hai: ");
        this.phuCapDocHai = Double.parseDouble(sc.nextLine());
    }
    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Phu cap doc hai: " + this.phuCapDocHai);
    }
}
