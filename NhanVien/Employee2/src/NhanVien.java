import java.util.Scanner;

public class NhanVien {
    private String id,name;
    private double heSoLuong;
    private static double luongCoBan;
    private static int soLuongNhanVien = 0;
    public NhanVien() {
        id = "56789";
        name = "Phong";
        heSoLuong = 5;
        luongCoBan = 1200000;
        soLuongNhanVien++;
    }
    public NhanVien(String id, String name,double heSoLuong) {
        this.id = id;
        this.name = name;
        this.heSoLuong = heSoLuong;
        luongCoBan = 1200000;
        soLuongNhanVien++;
    }
    public NhanVien(NhanVien t) {
        this.id = t.id;
        this.name= t.name;
        this.heSoLuong = t.heSoLuong;
        luongCoBan = 1200000;
        soLuongNhanVien++;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public void nhapDuLieu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("id: ");
        id = sc.nextLine();
        System.out.print("name: ");
        name = sc.nextLine();
        System.out.print("he so luong: ");
        heSoLuong = sc.nextDouble();
    }
    public void xuatDuLieu() {
        System.out.printf("|id: %-8s|name: %-20s|HeSoLuong: %4.1f|",id,name,heSoLuong);
        System.out.println();
    }
    public double tinhLuong() {
        return heSoLuong * luongCoBan;
    }
    public static int inSoLuongNhanVien() {
        return NhanVien.soLuongNhanVien;
    }

}
