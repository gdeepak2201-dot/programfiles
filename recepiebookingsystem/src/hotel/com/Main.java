import hotel.com.*;

public class Main{
    public static void main(String[] args){
        hontelapp app = new hontelapp();
        app.addall();
        app.order("dosa",new customer(2,"dhuyukshaaarunkumar"),3,3);
        app.order("dosa",new customer(3,"deepak"),4,8);
        app.order("dosa",new customer(4,"baskar"),2,1);
        app.printBilling(2,new payment(1,200,status.paid));
        app.printBilling(3,new payment(3,400,status.notpaid));
        System.out.println();

        app.servantallocate("server1",2);
        System.out.println();
        app.servantallocate("server2",3);
        System.out.println();
        System.out.println("category having foods");
        app.showmenu(category.veg);
        System.out.println();
        app.allocatetable(new customer(3,"deepak"),4,new servant(1,"ser1"));
        System.out.println();
        app.allocatetable(new customer(3,"baskar"),8,new servant(2,"ser2"));


    }
}