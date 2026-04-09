package receipebook;
import java.util.*;

public class search{
    private int userid;
    private String foodname;
    List<uploads> receipe;
    search(String foodname,List<uploads> receipe){
        this.receipe = receipe;
        this.foodname=foodname.toLowerCase();
    }

    public void searching(){
        boolean flag=true;
        for(uploads item:receipe){
            if(item.getreceipename().toLowerCase().equals(foodname)){
                System.out.println(item.getdescription());
                flag = false;
            }
        }
        if(flag){
            System.out.println("not found");
        }
    }


}


