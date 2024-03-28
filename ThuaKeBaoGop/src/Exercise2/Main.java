package Exercise2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Demo();
    }
    public static void Menu() {
        System.out.println("1. Add a student");
        System.out.println("2. Add a employee");
        System.out.println("3. Show student list");
        System.out.println("4. Show a employee list");
        System.out.println("0. Out");
        System.out.print("Input your choice: ");
    }
    public static void Demo() {
        Scanner sc= new Scanner(System.in);
        MList list = new MList();
        byte choice;

        do {
            Menu();
            choice = sc.nextByte();
            switch (choice) {
                case 1:
                    list.addStudent();
                    break;
                case 2:
                    list.addEmployee();
                    break;
                case 3:
                    list.showStudentList();
                    break;
                case 4:
                    list.showEmployeeList();
                    break;
                default:
                    choice = 0;
                    break;
            }

        }while (choice != 0);
    }
}

