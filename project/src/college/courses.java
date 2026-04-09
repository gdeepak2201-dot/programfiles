package college;
import java.util.*;
public class courses {
    private int courseid;
    private String coursename;

    public courses(int courseid, String coursename) {
        this.courseid = courseid;
        this.coursename = coursename;
    }
    public int getCourseid(){
        return courseid;
    }
    public String getCoursename(){
        return coursename;
    }
}
