import training.user;
import training.medicine;

import java.util.ArrayList;
import java.util.List;

void main(){
    List<user> alluser = new ArrayList<>();
    List<medicine> allmedicine = new ArrayList<>();
    alluser.add(new user(1,"deepak","8089086294"));
    System.out.print(alluser.getFirst().getId()+" "+alluser.getFirst().getName());
}
