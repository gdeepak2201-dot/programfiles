package receipebook;

public class review {
    String rating;
    int reviewid;

    review(int reviewid,String rating){
        this.rating=rating;
        this.reviewid=reviewid;
    }

    public void givefeedback(String rat){
        rating+=rat;
    }
    public String getfeed(){
        return rating;
    }
    public void displayrating(){
        System.out.print(rating);
    }
}
