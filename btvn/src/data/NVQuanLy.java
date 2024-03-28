package data;

import java.util.Scanner;

public class NVQuanLy extends NhanVien{
    private String truongDaoTao;
    private String chuyenMon;
    private double phuCapChucVu;

    public NVQuanLy() {
        super();
        this.truongDaoTao = null;
        this.chuyenMon = null;
        this.phuCapChucVu = 0;
    }

    public NVQuanLy(String maNhanVien, String tenNhanVien, int namSinh, String trinhDo, double luongCoBan, String truongDaoTao, String chuyenMon, double phuCapChucVu) {
        super(maNhanVien, tenNhanVien, namSinh, trinhDo, luongCoBan);
        this.truongDaoTao = truongDaoTao;
        this.chuyenMon = chuyenMon;
        this.phuCapChucVu = phuCapChucVu;
    }

    public String getTruongDaoTao() {
        return truongDaoTao;
    }

    public void setTruongDaoTao(String truongDaoTao) {
        this.truongDaoTao = truongDaoTao;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    public double getPhuCapChucVu() {
        return phuCapChucVu;
    }

    public void setPhuCapChucVu(double phuCapChucVu) {
        this.phuCapChucVu = phuCapChucVu;
    }
    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhap truong dao tao: ");
        this.truongDaoTao = sc.nextLine();
        System.out.print("Nhap chuyen mon: ");
        this.chuyenMon = sc.nextLine();
        System.out.print("Nhap phu cap chuc vu: ");
        this.phuCapChucVu = Double.parseDouble(sc.nextLine());
    }
    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Truong dao tao: " + this.truongDaoTao);
        System.out.println("Chuyen mon: " + this.chuyenMon);
        System.out.println("Phu cap chuc vu: " + this.phuCapChucVu);
    }
}
