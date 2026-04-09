package receipebook;
import java.util.*;

public class appservice {
    private List<user> globaluser;
    private List<uploads> globalrecipes;
    private List<review> globalreview;

    appservice(){
        this.globaluser = new ArrayList<>();
        this.globalrecipes = new ArrayList<>();
        this.globalreview = new ArrayList<>();
    }

    public void registerUser(int id, String username, String password) {
        user newUser = new user(id, username, password);
        globaluser.add(newUser);
        System.out.println("User registered: " + username);
    }

    public void addingreceipe(int uploadid,String receipename,String description){
        user creator = find(uploadid);
        if(creator!=null){
            uploads newupload = new uploads(uploadid,receipename,description);
            globalrecipes.add(newupload);
        }
        else {
            System.out.println("Error: User ID " + uploadid + " not found.");
        }
    }

    public void searchRecipe(String query) {
        search searchEngine = new search(query, globalrecipes);
        searchEngine.searching();
    }

    public void addreview(int reviewid,String rating){
        review newreview = new review(reviewid,rating);
        globalreview.add(newreview);
    }

    private user find(int id) {
        for(user people: globaluser){
            if(people.getid()==id){
                return people;
            }
        }
        return null;
    }

    public void displayuser(){
        for(user people: globaluser){
            System.out.println(people.getname());
        }
    }

    public void displayfoods(){
        for(uploads food:globalrecipes){
            System.out.println(food.getreceipename());
        }
    }

    public void displayreview(){
        for(review  feed: globalreview){
            System.out.println(feed.getfeed());
        }
    }
}
