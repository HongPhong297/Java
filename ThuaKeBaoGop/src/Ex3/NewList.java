package Ex3;


import Ex1.Employee;
import Ex1.People;
import Ex1.Student;

import java.util.ArrayList;

public class NewList{
    private ArrayList<People> mylist = new ArrayList<>();

    public NewList() {
    }

    public void addStudent() {
        People t = new Student();
        t.input();
        mylist.add(t);
    }
    public void addEmployeeManage() {
        People t = new EmployeeManage();
        t.input();
        mylist.add(t);
    }
    public void addTeacher() {
        People t = new Teacher();
        t.input();
        mylist.add(t);
    }
    public void showStudentList() {
        if(mylist != null)
            for (People x : mylist)
                if (x instanceof Student)
                    x.output();
    }
    public void showEmployeeManageList() {
        if(mylist != null)
            for (People x : mylist)
                if (x instanceof EmployeeManage)
                    x.output();
    }
    public void showTeacherList() {
        if(mylist != null)
            for (People x : mylist)
                if (x instanceof Teacher)
                    x.output();
    }

}
