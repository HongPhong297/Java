import org.w3c.dom.ls.LSOutput;

public class ListHangHoa {
    private HangHoa[] list = new HangHoa[10];
    private int soLuong;


    public ListHangHoa() {
        this.soLuong = 0;
    }

    public void themHangHoa(HangHoa t) {
        if (soLuong > 9)
            System.out.println("Vuot qua so luong");
        else {
            list[soLuong] = t;
            System.out.println("Them thanh cong");
            soLuong++;
        }
    }

    //    public void xuatDanhSachTheoLoai(byte loai) {
//        if (soLuong == 0)
//            System.out.println("List rong");
//        else {
//            for (HangHoa x : list) {
//                if (x != null) {
//                    if (x.getClass().getName().equals("HangThucPham") && loai == 1)
//                        x.output();
//                    if (x.getClass().getName().equals("HangDienMay") && loai == 2)
//                        x.output();
//                }
//            }
//        }
//    }
    public void xuatDanhSachTheoLoai(byte loai) {
        if (soLuong == 0)
            System.out.println("List rong");
        else {
            if (loai == 1)
                for (HangHoa x : list) {
                    if (x != null)
                        if (x.getClass().getName().equals("HangThucPham"))
                            x.output();
                }
            if (loai == 2)
                for (HangHoa x : list) {
                    if (x != null)
                        if (x.getClass().getName().equals("HangDienMay"))
                            x.output();
                }
        }


    }
}
