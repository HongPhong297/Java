package data;

import java.util.Scanner;

public class NhanVien {
    protected String maNhanVien;
    protected String tenNhanVien;
    protected int namSinh;
    protected String trinhDo;
    protected double luongCoBan;


    public NhanVien(String maNhanVien, String tenNhanVien, int namSinh, String trinhDo, double luongCoBan) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.namSinh = namSinh;
        this.trinhDo = trinhDo;
        this.luongCoBan = luongCoBan;
    }

    public NhanVien() {
        this.maNhanVien = null;
        this.tenNhanVien = null;
        this.namSinh = 0;
        this.trinhDo = null;
        this.luongCoBan = 0;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien: ");
        this.maNhanVien = sc.nextLine();
        System.out.print("Nhap ten nhan vien: ");
        this.tenNhanVien = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        this.namSinh = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap trinh do: ");
        this.trinhDo = sc.nextLine();
        System.out.print("Nhap luong co ban: ");
        this.luongCoBan = Double.parseDouble(sc.nextLine());
    }

    public void xuatThongTin() {
        System.out.println("Ma nhan vien:" + this.maNhanVien);
        System.out.println("Ten nhan vien: " + this.tenNhanVien);
        System.out.println("Nam sinh: " + this.namSinh);
        System.out.println("Trinh do: " + this.trinhDo);
        System.out.println("Luong co ban: " + this.luongCoBan);
    }
}
