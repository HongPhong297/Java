package Exercise1;

import java.util.Scanner;

public class Employee extends People{
    private double salary;
    private String acceptanceDate;
    private final DepartmentRoom department = new DepartmentRoom();

    public Employee() {
    }

    public Employee(String name, int yob, double salary, String acceptanceDate) {
        super(name, yob);
        this.salary = salary;
        this.acceptanceDate = acceptanceDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAcceptanceDate() {
        return acceptanceDate;
    }

    public void setAcceptanceDate(String acceptanceDate) {
        this.acceptanceDate = acceptanceDate;
    }

    public DepartmentRoom getDepartment() {
        return department;
    }

    @Override
    public void input() {
        Scanner sc= new Scanner(System.in);
        super.input();
        System.out.print("salary: ");
        this.salary = Double.parseDouble(sc.nextLine());
        System.out.print("acceptanceDate: ");
        this.acceptanceDate = sc.nextLine();
        department.input();
    }
    @Override
    public void output() {
        super.output();
        System.out.println("salary: " + salary);
        System.out.println("acceptanceDate: " + acceptanceDate);
        department.output();
    }
}
