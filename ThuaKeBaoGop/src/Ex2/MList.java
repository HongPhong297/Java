package Ex2;

import Ex1.Employee;
import Ex1.People;
import Ex1.Student;

import java.util.ArrayList;

public class MList {
    private ArrayList<People> mylist = new ArrayList<>();

    public MList() {
    }

    public void addStudent() {
        People t = new Student();
        t.input();
        mylist.add(t);
    }
    public void addEmployee() {
        People t = new Employee();
        t.input();
        mylist.add(t);
    }

    public void showStudentList() {
        if(mylist != null)
            for (People x : mylist)
                if (x instanceof Student)
                    x.output();
    }
    public void showEmployeeList() {
        if(mylist != null)
            for (People x : mylist)
                if (x instanceof Employee)
                    x.output();
    }
}
