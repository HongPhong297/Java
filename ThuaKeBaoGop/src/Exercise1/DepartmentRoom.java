package Exercise1;

import java.util.Scanner;

public class DepartmentRoom {
    private String idOfDepartment;
    private String nameOfDepartment;

    public DepartmentRoom() {
    }

    public DepartmentRoom(String idOfDepartment, String nameOfDepartment) {
        this.idOfDepartment = idOfDepartment;
        this.nameOfDepartment = nameOfDepartment;
    }

    public String getIdOfDepartment() {
        return idOfDepartment;
    }

    public void setIdOfDepartment(String idOfDepartment) {
        this.idOfDepartment = idOfDepartment;
    }

    public String getNameOfDepartment() {
        return nameOfDepartment;
    }

    public void setNameOfDepartment(String nameOfDepartment) {
        this.nameOfDepartment = nameOfDepartment;
    }

    public void input() {
        Scanner sc= new Scanner(System.in);
        System.out.print("id of room: ");
        this.idOfDepartment = sc.nextLine();
        System.out.print("name of room: ");
        this.nameOfDepartment = sc.nextLine();
    }
    public void output() {
        System.out.println("id of room: " + idOfDepartment);
        System.out.println("name of room: " + nameOfDepartment);
    }
}
