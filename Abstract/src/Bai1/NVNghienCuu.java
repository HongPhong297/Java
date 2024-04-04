package Bai1;

import java.util.Scanner;

public class NVNghienCuu extends NVDaoTao {
    private double phuCapDocHai;

    public NVNghienCuu() {
    }

    public NVNghienCuu(String maNhanVien, String hoTen, String trinhDo, double luongCoBan, String chuyenMon, double phuCapDocHai) {
        super(maNhanVien, hoTen, trinhDo, luongCoBan, chuyenMon);
        this.phuCapDocHai = phuCapDocHai;
    }


    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap chuyen mon: ");
        chuyenMon = sc.nextLine();
        System.out.print("Nhap phu cap doc hai: ");
        phuCapDocHai = sc.nextDouble();
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("chuyen mon: " + chuyenMon);
        System.out.println("phu cap: " + phuCapDocHai);
    }
    public double tinhLuong() {
        return luongCoBan  + phuCapDocHai;
    }

}
