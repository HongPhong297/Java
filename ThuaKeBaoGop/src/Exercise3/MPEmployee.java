package Exercise3;

import Exercise1.Employee;

import java.util.Scanner;

public class MPEmployee extends Employee {
    private String level;
    private String career;
    private String trainingPlace;

    public MPEmployee() {
    }

    public MPEmployee(String name, int yob, double salary, String acceptanceDate, String level, String career, String trainingPlace) {
        super(name, yob, salary, acceptanceDate);
        this.level = level;
        this.career = career;
        this.trainingPlace = trainingPlace;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getTrainingPlace() {
        return trainingPlace;
    }

    public void setTrainingPlace(String trainingPlace) {
        this.trainingPlace = trainingPlace;
    }

    @Override
    public void input() {
        Scanner sc= new Scanner(System.in);
        super.input();
        System.out.print("level: ");
        this.level = sc.nextLine();
        System.out.print("career: ");
        this.career = sc.nextLine();
        System.out.print("trainingPlace: ");
        this.trainingPlace = sc.nextLine();
    }
    @Override
    public void output() {
        super.output();
        System.out.println("level: " + level);
        System.out.println("career: " + career);
        System.out.println("trainingPlace: " + trainingPlace);
    }
}
