package flight.com;

public class passenger {
    private int passid;
    private String name;
    private String phone;

    public passenger(int passid, String name, String phone) {
        this.passid = passid;
        this.name = name;
        this.phone = phone;
    }

    public int getPassid() {
        return passid;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
