package college;
import java.util.*;

public class teacher {
    private int teacherid;
    private String teachername;
    List<String> courses;

    public teacher(int teacherid, String teachername, List<String> courses) {
        this.teacherid = teacherid;
        this.teachername = teachername;
        this.courses =courses;
    }

    public int getTeacherid() {
        return teacherid;
    }

    public String getTeachername() {
        return teachername;
    }

    public List<String> getCourses() {
        return courses;
    }
    public void displaycourse(){
        for(int i=0;i<courses.size();i++){
            System.out.println(courses.get(i));
        }
    }
}
