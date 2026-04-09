package college;

public class mark {
    private int stuid;
    private int courseid;
    private int coursemark;
    private String coursename;

    public mark(int stuid,  int coursemark) {
        this.stuid = stuid;
        this.coursemark = coursemark;
    }

    public int getStuid() {
        return stuid;
    }

    public int getCourseid() {
        return courseid;
    }

    public int getCoursemark() {
        return coursemark;
    }

    public String getCoursename() {
        return coursename;
    }
}
