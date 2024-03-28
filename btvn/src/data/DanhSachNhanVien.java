package data;

public class DanhSachNhanVien {
    private NhanVien[] list;
    private int soLuong;


    public DanhSachNhanVien() {
        list = new NhanVien[10];
        soLuong = 0;
    }

    public void themNhanVien(NhanVien t) {
        list[soLuong] = t;
        soLuong++;
    }

    public void xuatDSNVTheoLoai(byte loai) {
        if (loai == 1)
            for (int i = 0 ; i < soLuong; i++) {
                if (list[i] instanceof NVQuanLy)
                    list[i].xuatThongTin();
            }
        if (loai == 2)
            for (int i = 0 ; i < soLuong; i++) {
                if (list[i] instanceof NVNghienCuu)
                    list[i].xuatThongTin();
            }
        if (loai == 3)
            for (int i = 0 ; i < soLuong; i++) {
                if (list[i] instanceof NVPhucVu)
                    list[i].xuatThongTin();
            }
    }
}
