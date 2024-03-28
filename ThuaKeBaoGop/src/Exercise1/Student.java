package Exercise1;

import java.util.Scanner;

public class Student extends People{
    private double point1;
    private double point2;
    private double point3;


    public Student() {
    }

    public Student(String name, int yob, double point1, double point2, double point3) {
        super(name, yob);
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public double getPoint1() {
        return point1;
    }

    public void setPoint1(double point1) {
        this.point1 = point1;
    }

    public double getPoint2() {
        return point2;
    }

    public void setPoint2(double point2) {
        this.point2 = point2;
    }

    public double getPoint3() {
        return point3;
    }

    public void setPoint3(double point3) {
        this.point3 = point3;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("point 1: ");
        this.point1 = Double.parseDouble(sc.nextLine());
        System.out.print("point 2: ");
        this.point2 = Double.parseDouble(sc.nextLine());
        System.out.print("point 3: ");
        this.point3 = Double.parseDouble(sc.nextLine());
    }
    @Override
    public void output() {
        super.output();
        System.out.println("point 1: " + point1);
        System.out.println("point 2: " + point2);
        System.out.println("point 3: " + point3);
    }
}
