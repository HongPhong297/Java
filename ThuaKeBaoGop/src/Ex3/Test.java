package Ex3;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        demo();
    }
    public static void demo() {
        Scanner sc= new Scanner(System.in);
        NewList list = new NewList();
        byte choice;

        do {
            Menu();
            choice = sc.nextByte();
            switch (choice) {
                case 1:
                    list.addStudent();
                    break;
                case 2:
                    list.addEmployeeManage();
                    break;
                case 3:
                    list.addTeacher();
                    break;
                case 4:
                    list.showStudentList();
                    break;
                case 5:
                    list.showEmployeeManageList();
                    break;
                case 6:
                    list.showTeacherList();
                    break;
                default:
                    choice = 0;
                    break;
            }

        }while (choice != 0);
    }
    public static void Menu() {
        System.out.println("1. Add a student");
        System.out.println("2. Add a employeeManage");
        System.out.println("3. Add a teacher");
        System.out.println("4. Show a student list");
        System.out.println("5. Show a employeeManage list");
        System.out.println("6. Show a teacher list");
        System.out.println("0. Out");
        System.out.print("Input your choice: ");
    }

}


