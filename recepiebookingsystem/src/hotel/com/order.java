package hotel.com;

public class order {
    private int orderid;
    private String dishname;
    private int quality;

    order(int orderid , String dishname,int quality){
        this.orderid=orderid;
        this.dishname=dishname;
        this.quality=quality;
    }

    public int getorderid() {
        return orderid;
    }

    public String getdishname() {
        return dishname;
    }

    public int getquality() {
        return quality;
    }
}
