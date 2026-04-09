package training;

public class user {
    private int id;
    private String  name;
    private String phone;

    user(){

    }

    public user(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
