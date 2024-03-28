package Exercise1;

import java.util.Scanner;

public class People {
    protected String name;
    protected int yob;

    public People() {
    }

    public People(String name, int yob) {
        this.name = name;
        this.yob = Math.min(yob, 2024);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("your name: ");
        this.name = sc.nextLine();
        System.out.print("your yob: ");
        this.yob = Integer.parseInt(sc.nextLine());
    }
    public void output() {
        System.out.println("name :" + name);
        System.out.println("yob: " + yob);
    }
}
