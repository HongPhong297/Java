
public class Main {
    public static void main(String[] args) {
        HangHoa h = new HangThucPham();
        HangHoa h1 = new HangDienMay("132","banh mi",5000,5,12,52);
        HangHoa h2 = new HangDienMay();
        HangHoa h3 = new HangThucPham();
        ListHangHoa list1 = new ListHangHoa();
        list1.themHangHoa(h);
        list1.themHangHoa(h1);
        list1.themHangHoa(h2);
        list1.themHangHoa(h3);
        list1.xuatDanhSachTheoLoai((byte) 1);

    }
}