import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private double score;


    public Student() {

    }

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
    public Student(Student t) {
        this.id = t.id;
        this.name = t.name;
        this.score = t.score;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public void inPut() {
        Scanner sc = new Scanner(System.in);
        System.out.print("id: ");
        id = sc.nextLine();
        System.out.print("name: ");
        name = sc.nextLine();
        System.out.print("score: ");
        score = sc.nextDouble();

    }
    public void outPut() {
        System.out.printf("|id: %7s|name: %-15s|score: %-4.1f\n"
                                ,id,name,score);
    }



}
