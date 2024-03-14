public class Coodinate {
    private double x;
    private double y;


    public Coodinate() {
        this.x = 0;
        this.y = 0;
    }
    public Coodinate(double x, double y) {
        this.x= x;
        this.y = y;
    }
    public void doiXungTrucHoanh(){
        double y = -this.y;
        System.out.printf("Diem doi xung qua truc hoanh:(%-4.1f %-4.1f)\n",x,y);
        System.out.println();
    }
    public void xuatToaDo() {
        System.out.printf("Toa do cua diem trong khong gian 2 chieu la: (%-4.1f %-4.1f)\n",x,y);

    }
}
