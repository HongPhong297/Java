package Exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Demo();
    }
    public static void Menu() {
        System.out.println("1. Input a student");
        System.out.println("2. Input a employee");
        System.out.println("3. Output a student");
        System.out.println("4. Output a employee");
        System.out.println("0. Out");
        System.out.print("Input your choice: ");
    }
    public static void Demo() {
        Scanner sc= new Scanner(System.in);
        byte choice;
        People student1 = new Student();
        People employee1 = new Employee();
        do {
            Menu();
            choice = sc.nextByte();
            switch (choice) {
                case 1:
                    student1.input();
                    break;
                case 2:
                    employee1.input();
                    break;
                case 3:
                    student1.output();
                    break;
                case 4:
                    employee1.output();
                    break;
                default:
                    choice = 0;
                    break;
            }

        }while (choice != 0);
    }
}