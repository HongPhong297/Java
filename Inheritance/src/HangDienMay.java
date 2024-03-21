public class HangDienMay extends HangHoa{
    private double thoiGianBaoHanh;
    private double dienAp;
    private double congSuat;
    public HangDienMay() {
        super();
        thoiGianBaoHanh = 0;
        dienAp = 0;
        congSuat = 0;
    }
    public HangDienMay(String maHang, String tenHang, double donGia, double thoiGianBaoHanh, double dienAp, double congSuat) {
        super(maHang, tenHang, donGia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.dienAp = dienAp;
        this.congSuat = congSuat;
    }

    public double getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(double thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public double getDienAp() {
        return dienAp;
    }

    public void setDienAp(double dienAp) {
        this.dienAp = dienAp;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }
    @Override
    public void input() {
        System.out.println("---Nhap thong tin hang dien may---");
        super.input();
        System.out.print("Thoi gian bao hanh: ");
        thoiGianBaoHanh = sc.nextDouble();
        System.out.print("Dien Ap: ");
        dienAp = sc.nextDouble();
        System.out.print("Cong suat: ");
        congSuat = sc.nextDouble();
    }
    @Override
    public void output() {
        System.out.println("---Thong tin hang dien may---");
        super.output();
        System.out.println("thoi gian bao hanh: " + thoiGianBaoHanh);
        System.out.println("dien ap: " + dienAp);
        System.out.println("cong suat: " + congSuat);
    }


}
