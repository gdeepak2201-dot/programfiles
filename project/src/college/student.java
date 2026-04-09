package college;

public class student {
    private int rollno;
    private String name;
    private String dept;

    public student(int rollno, String name, String dept) {
        this.rollno = rollno;
        this.name = name;
        this.dept = dept;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }
}


