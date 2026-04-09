package college;

import java.util.ArrayList;
import java.util.*;

public class collegeapp {
    List<student> allstudent=new ArrayList<>();
    List<teacher> alltecher = new ArrayList<>();
    List<courses> allcourses = new ArrayList<>();
    Map<student,mark> allmarks = new HashMap<>();
    Map<department,List<courses>> allcourse  = new HashMap<>();


    public void addstudent(int roll ,String name,String phone){
        student newstudent = new student(roll,name,phone);
        allstudent.add(newstudent);
        List<String > cour=new ArrayList<>();
        cour.add("java");
        cour.add("python");
        teacher newtecher= new teacher(1,"teacher1",cour);
        alltecher.add(newtecher);
        allmarks.put(newstudent,new mark(1,80));

    }
    public void displayallstudent(){
        for(student s:allstudent){
            System.out.print(s.getName()+" "+s.getRollno()+" "+s.getDept());
        }
        for(teacher t:alltecher){
            System.out.print(t.getTeachername()+" ");
            List<String> cour=t.getCourses();
            for(int i=0;i<cour.size();i++){
                System.out.print(cour.get(i));
            }
        }
    }
    public void search(){
        for(Map.Entry<student,mark> entry : allmarks.entrySet()){
            System.out.print(entry.getValue().getCoursemark());
        }
    }

}
