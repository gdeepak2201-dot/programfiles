package receipebook;
import java.util.*;
public class user {

    private int id;
    private String password;
    private String username;
    private List<uploads> records;

    user(int id,String username, String password){
        this.id=id;
        this.password=password;
        this.username=username;
        this.records= new ArrayList<>();
    }
     public String getname(){
        return username;
    }
    public int getid(){
        return id;
    }
    public void adduploads(uploads recipe){
        records.add(recipe);
    }

    public void displayProfile() {
        System.out.println("--- User Profile ---");
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Total Uploads: " + records.size());
    }

    public String toString() {
        return "User{id=" + id + ", username='" + username + "'}";
    }
}
