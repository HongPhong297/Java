package Ex3;

import Ex1.Employee;

import java.util.Scanner;

public class EmployeeManage extends MPEmployee {
    private double allowance;

    public EmployeeManage() {
    }

    public EmployeeManage(String name, int yob, double salary, String acceptanceDate, String level, String career, String trainingPlace, double allowance) {
        super(name, yob, salary, acceptanceDate, level, career, trainingPlace);
        this.allowance = allowance;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }
    @Override
    public void input() {
        Scanner sc= new Scanner(System.in);
        super.input();
        System.out.print("allowance: ");
        this.allowance = Double.parseDouble(sc.nextLine());
    }
    @Override
    public void output() {
        super.output();
        System.out.println("allowance: " + allowance);
    }

}
