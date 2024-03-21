import java.util.Scanner;

public class HangHoa {
    protected String maHang;
    protected String tenHang;
    protected double donGia;
    protected final Scanner sc = new Scanner(System.in);

    public HangHoa() {
        maHang = "";
        tenHang = "";
        donGia = 0;
    }

    public HangHoa(String maHang, String tenHang, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void input() {
        System.out.print("Nhap ma hang hoa: ");
        maHang = sc.nextLine();
        System.out.print("Nhap ten hang hoa: ");
        tenHang = sc.nextLine();
        System.out.println("Nhap don gia: ");
        donGia = sc.nextDouble();
    }
    public void output() {
        System.out.println("ma hang hoa: " + maHang);
        System.out.println("ten hang hoa: " + tenHang);
        System.out.println("don gia: " + donGia);
    }
}
