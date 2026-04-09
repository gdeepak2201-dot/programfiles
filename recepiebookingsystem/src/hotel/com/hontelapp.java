package hotel.com;
import java.util.*;

import java.util.ArrayList;

public class hontelapp {

    List<menu> allmenu = new ArrayList<>();
    List<customer> allcustomer = new ArrayList<>();
    Map<customer,Integer> bill = new HashMap<>();
    Map<servant,Integer> allservant = new HashMap();
    Queue<menu> allorder = new LinkedList<>();



    public void addall(){
        menu  newmenu = new menu(1,"dosa",100,category.veg);
        menu newmenu1 = new menu(2,"idly",300,category.juice);
        customer cust1 = new customer(2,"deepak");
        servant ser1= new servant(4,"server1");
        servant ser2= new servant(4,"server2");
        allservant.put(ser1,0);
        allservant.put(ser2,0);
        allcustomer.add(cust1);
        allmenu.add(newmenu);
        allmenu.add(newmenu1);
    }

    public void order(String food ,customer cust,int quantity,int tableno){
        for(menu m:allmenu){
            if(m.getdishname().equals(food)){
                int total = bill.getOrDefault(cust,0);
                bill.put(cust,total+m.getprice()*quantity);
                allcustomer.add(cust);
                allorder.add(m);
            }
        }
    }
    public void printBilling(int id,payment pay) {
        System.out.println("--- Final Bills ---");
        for (Map.Entry<customer, Integer> entry : bill.entrySet()) {
            if(entry.getKey().getcusid()==id){
                System.out.println("name:"+entry.getKey().getname() +" "+"price:"+" "+entry.getValue());
                if(pay.getstatus()==status.paid){
                    System.out.println("bill paid");
                }
                else{
                    System.out.println("not paid");
                }
            }
        }

    }

    public void servantallocate(String servername, int tableno) {
        for (Map.Entry<servant, Integer> entry : allservant.entrySet()) {
            servant s = entry.getKey();
            if (s != null && s.getsername() != null && s.getsername().equals(servername)) {
                allservant.put(s, tableno);
                System.out.println("Allocated to: " + s.getsername());
                return;
            }
        }
        System.out.println("Servant not found or name is null.");
    }

    public void allocatetable(customer cust,int tableno,servant ser){
        while(!allorder.isEmpty()){
            System.out.println(cust.getname()+" "+"allocated to"+" "+tableno+" "+"and served by"+" "+ser.getsername());
            allorder.poll();
        }
    }

    public void showmenu(category type){
        for(menu m:allmenu){
            if(m.getcategory()==type){
                System.out.print(m.getdishname()+" "+m.getprice());
            }
        }
    }
}
