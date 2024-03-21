public class HangThucPham extends HangHoa{
    private String ngaySanXuat;
    private String ngayHetHan;

    public HangThucPham() {

    }

    public HangThucPham(String maHang, String tenHang, double donGia, String ngaySanXuat, String ngayHetHan) {
        super(maHang, tenHang, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
    @Override
    public void input() {
        System.out.println("---Nhap thong tin hang thuc pham---");
        super.input();
        System.out.print("ngay san xuat: ");
        ngaySanXuat = sc.nextLine();
        System.out.print("ngay het han: ");
        ngayHetHan = sc.nextLine();
    }
    @Override
    public void output() {
        System.out.println("---Xuat thong tin hang thuc pham---");
        super.output();
        System.out.println("ngay san xuat: " + ngaySanXuat);
        System.out.println("ngay het han: " + ngayHetHan);
    }
}
