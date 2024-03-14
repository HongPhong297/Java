import java.util.Scanner;

public class ListStudent {
    private Student[] arr;
    private int n;
    private Scanner sc = new Scanner(System.in);

    public ListStudent() {
        inputN();
        arr = new Student[n];
        for (int i = 0 ; i < arr.length; i++)
            arr[i] = new Student();
    }
    public ListStudent(int n) {
        this.n = n;
        for (int i = 0 ; i < n; i++)
            arr[i] = new Student();
    }
    public ListStudent(ListStudent t) {
        n = t.n;
        arr = t.arr;
        sc = t.sc;
    }
    private void inputN() {
        System.out.print("Nhap so luong sinh vien: ");
        this.n = sc.nextInt();
    }

    public int getN() {
        return n;
    }

    public void inputList() {
        for (int i = 0 ; i < arr.length; i++) {
            System.out.println("Student #" + (i + 1));
            arr[i].inPut();
        }
        //sortList();
    }
    public void outputList() {
        for (int i = 0 ; i < n; i++) {
            arr[i].outPut();
        }
    }

    public void sortList() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if(arr[i].getScore() > arr[j].getScore()) {
                    Student temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
