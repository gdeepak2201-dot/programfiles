package trainpackage;
import java.util.*;

public class destination {
    private int destid;
    private int budget;
    private String place;
    private String fromtime;
    private String totime;


    destination(int destid,int budget,String place,String fromtime,String totime){
        this.destid=destid;
        this.budget=budget;
        this.fromtime=fromtime;
        this.totime=totime;
    }

    public String getdest(){
        return place;
    }
    public int getBudget(){
        return budget;
    }



}
