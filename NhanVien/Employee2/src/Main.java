import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        test();
        testDSNV();
    }
    public static void test() {
        Scanner sc = new Scanner(System.in);
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new NhanVien("13212","Pere",3.2);
        NhanVien nv = new NhanVien("11344","Gew",8.3);

        NhanVien nv3 = new NhanVien(nv);
        // nv1
        nv1.nhapDuLieu();
        nv1.xuatDuLieu();
        // thay doi
        System.out.print("New name: ");
        String newName = sc.nextLine();
        nv1.setName(newName);
        System.out.println("Nhan vien sau khi doi ten");
        nv1.xuatDuLieu();
        nv2.xuatDuLieu();
        nv3.xuatDuLieu();
        NhanVien max = nv1;
        if(nv2.getHeSoLuong() > max.getHeSoLuong()) {
            max = nv2;
        }
        if (nv3.getHeSoLuong() > max.getHeSoLuong()) {
            max = nv3;
        }
        System.out.println(max.getName());
        System.out.println("Thong tin nhan vien co he so luong cao nhat!!!" );
        max.xuatDuLieu();



    }
    public static void testDSNV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        int soNhanVien = sc.nextInt();
        NhanVien[] arr = new NhanVien[soNhanVien];
        for (int i = 0 ; i < arr.length; i++)
            arr[i] = new NhanVien();
        for (int i = 0 ; i < arr.length; i++)
            arr[i].nhapDuLieu();
        for (NhanVien x : arr) {
            x.xuatDuLieu();
            System.out.println("Luong cua " + x.getName() + ": " + x.tinhLuong());
        }
        System.out.println("So luong nhan vien trong danh sach = " + NhanVien.inSoLuongNhanVien());

    }
}