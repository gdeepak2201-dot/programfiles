package receipebook;
import java.util.*;

public class bookmark {
    private int bookmarkid;
    private List<uploads>  saved;

    bookmark(int bookmarkid,List<uploads> saved){
        this.bookmarkid = bookmarkid;
        this.saved = new ArrayList<>();
    }

    public void addsaved(uploads food){
        saved.add(food);
    }

    public void displayrecepie(){
        if(saved.isEmpty()){
            System.out.print("empty");
        }
        else{
            for(uploads item :saved){
                System.out.print(item.getreceipename());
            }
        }
    }
}
