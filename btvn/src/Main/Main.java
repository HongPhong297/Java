package Main;

import data.*;

public class Main {
    public static void main(String[] args) {
        NhanVien nv1 = new NVQuanLy();
        System.out.println("Bat dau nhap");
        nv1.nhapThongTin();
        NhanVien nv2 = new NVNghienCuu();
        System.out.println("Bat dau nhap");
        nv2.nhapThongTin();
        NhanVien nv3 = new NVPhucVu();
        System.out.println("Bat dau nhap");
        nv3.nhapThongTin();
        DanhSachNhanVien list1 = new DanhSachNhanVien();
        list1.themNhanVien(nv1);
        list1.themNhanVien(nv2);
        list1.themNhanVien(nv3);
        list1.xuatDSNVTheoLoai((byte) 2);
    }
}