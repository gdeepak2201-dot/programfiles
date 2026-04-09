package hotel.com;

public class menu {
    private int menuid;
    private String dishname;
    private int price;
    private category cat;

    public menu(int menuid, String dishname, int price ,category cat) {
        this.menuid = menuid;
        this.dishname = dishname;
        this.price = price;
        this.cat =cat;
    }

    public int getmenuid() {
        return menuid;
    }

    public category getcategory(){
        return cat;
    }

    public void setmenuid(int menuid) {
        this.menuid = menuid;
    }

    public int getprice() {
        return price;
    }

    public void setprice(int price) {
        this.price = price;
    }

    public String getdishname() {
        return dishname;
    }

    public void setdishname(String dishname) {
        this.dishname = dishname;
    }
}
