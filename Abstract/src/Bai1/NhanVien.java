package Bai1;

import java.util.Scanner;

public abstract class NhanVien {
    protected String maNhanVien;
    protected String hoTen;
    protected String trinhDo;
    protected double luongCoBan;

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String hoTen, String trinhDo, double luongCoBan) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.trinhDo = trinhDo;
        this.luongCoBan = luongCoBan;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nv: ");
        maNhanVien = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap trinh do: ");
        trinhDo = sc.nextLine();
        System.out.print("Nhap luong co ban: ");
        luongCoBan = sc.nextDouble();
    }
    public void xuat() {
        System.out.println("ma nv: " + maNhanVien);
        System.out.println("ho ten: " + hoTen);
        System.out.println("trinh do: " + trinhDo);
        System.out.println("luong co ban: " + luongCoBan);
    }
    public abstract double tinhLuong();

}
