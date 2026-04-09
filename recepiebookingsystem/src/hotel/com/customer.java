package hotel.com;

public class customer {
    private int cusid;
    private String name;
    public customer(int cusid ,String name){
        this.cusid=cusid;
        this.name=name;
    }

    public int getcusid() {
        return cusid;
    }

    public String getname() {
        return name;
    }
}
