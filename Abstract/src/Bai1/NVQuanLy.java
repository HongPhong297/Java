package Bai1;

import java.util.Scanner;

public class NVQuanLy extends NVDaoTao {
    private double phuCapCV;

    public NVQuanLy() {
    }

    public NVQuanLy(String maNhanVien, String hoTen, String trinhDo, double luongCoBan, String chuyenMon, double phuCapCV) {
        super(maNhanVien, hoTen, trinhDo, luongCoBan, chuyenMon);
        this.phuCapCV = phuCapCV;
    }


    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap chuyen mon: ");
        chuyenMon = sc.nextLine();
        System.out.print("Nhap phu cap: ");
        phuCapCV = sc.nextDouble();
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("chuyen mon: " + chuyenMon);
        System.out.println("phu cap: " + phuCapCV);
    }
    @Override
    public double tinhLuong() {
        return luongCoBan + phuCapCV;
    }
}
