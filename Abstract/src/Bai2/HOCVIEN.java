package Bai2;

import Bai1.NVNghienCuu;
import Bai1.NVPhucVu;
import Bai1.NVQuanLy;
import Bai1.NhanVien;

import java.util.ArrayList;

public class HOCVIEN {
    private final ArrayList<NhanVien> ds = new ArrayList<>();

    public HOCVIEN() {
    }

    public void themNVPhucVu() {
        System.out.println("Bat dau nhap nhan vien phuc vu");
        NhanVien t = new NVPhucVu();
        t.nhap();
        ds.add(t);
        System.out.println("Nhap thanh cong");
    }
    public void themNVQuanLi() {
        System.out.println("Bat dau nhap nhan vien quan li");
        NhanVien t = new NVQuanLy();
        t.nhap();
        ds.add(t);
        System.out.println("Nhap thanh cong");
    }
    public void themNVNghienCuu() {
        System.out.println("Bat dau nhap nhan vien nghien cuu");
        NhanVien t = new NVNghienCuu();
        t.nhap();
        ds.add(t);
        System.out.println("Nhap thanh cong");
    }

    public void xuatDanhSach() {
        for (NhanVien x : ds) {
            System.out.println(x.getClass().getSimpleName());
            x.xuat();
        }

    }

    public double tongLuongHocVien() {
        double luong = 0;
        for (NhanVien x : ds)
            luong += x.tinhLuong();
        return luong;
    }
}
