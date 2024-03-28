package Ex3;

import java.util.Scanner;

public class Teacher extends MPEmployee{
    private double remuneration;

    public Teacher() {
    }

    public Teacher(String name, int yob, double salary, String acceptanceDate, String level, String career, String trainingPlace, double remuneration) {
        super(name, yob, salary, acceptanceDate, level, career, trainingPlace);
        this.remuneration = remuneration;
    }

    public double getRemuneration() {
        return remuneration;
    }

    public void setRemuneration(double remuneration) {
        this.remuneration = remuneration;
    }
    @Override
    public void input() {
        Scanner sc= new Scanner(System.in);
        super.input();
        System.out.print("remuneration: ");
        this.remuneration = Double.parseDouble(sc.nextLine());
    }
    @Override
    public void output() {
        super.output();
        System.out.println("allowance: " + remuneration);
    }
}
