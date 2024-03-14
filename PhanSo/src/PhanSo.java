import java.util.Scanner;

public class PhanSo {
    private int tu;
    private int mau;
    private final Scanner  sc = new Scanner(System.in);
    public PhanSo() {
        System.out.println("xin chao ");
        this.tu = 0;
        this.mau = 1;
    }

    public PhanSo(int tu, int mau) {
        System.out.println("Xin chao");
        this.tu = tu;
        if (mau == 0) {
            System.out.println("Nhap lai mau: ");
            this.mau = sc.nextInt();
        }

        //this.mau = mau != 0 ? mau : 1;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }


    public void inPut() {
        System.out.print("tu = ");
        tu = sc.nextInt();
        do {
            System.out.print("mau = ");
            mau = sc.nextInt();
            if (mau == 0)
                System.out.println("mau phai khac 0");

        } while (mau == 0);
    }

    public void outPut() {
        if (mau < 0) {
            tu *= -1;
            mau *= -1;
        }
        System.out.println("phan so cua ban la: " + tu + "/" + mau);
    }

    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void rutGon() {
        int i = timUSCLN(tu, mau);
        tu = tu / i;
        mau = mau / i;
    }

    public void congPhanSo(PhanSo ps2) {
        tu = (tu * ps2.mau) + (mau * ps2.tu);
        mau = mau * ps2.mau;
    }
    public void truPhanSo(PhanSo ps2) {
        tu = (tu * ps2.mau) - (mau * ps2.tu);
        mau = mau * ps2.mau;
    }
    public void nhanPhanSo(PhanSo ps2) {
        tu = tu * ps2.tu;
        mau = mau * ps2.mau;
    }
    public void chiaPhanSo(PhanSo ps2) {
        tu = tu * ps2.mau;
        mau = mau * ps2.tu;
    }

}
