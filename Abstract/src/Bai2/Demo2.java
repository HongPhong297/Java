package Bai2;

public class Demo2 {
    public static void main(String[] args) {
        HOCVIEN myhv = new HOCVIEN();
        myhv.themNVNghienCuu();
        myhv.themNVPhucVu();
        myhv.themNVQuanLi();
        myhv.xuatDanhSach();
        System.out.println("tong luong = " + myhv.tongLuongHocVien());
    }
}
