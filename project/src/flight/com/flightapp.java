package flight.com;
import java.util.*;

public class flightapp {
    int seatno=1;
    List<flight> allflight = new ArrayList<>();
    Map<booking,payment> allpayment = new HashMap<>();
    List<booking> allbooking = new ArrayList<>();

    public void addflight(){
        flight newflight =new flight(1,001,10);
        allflight.add(newflight);
        payment newpayment = new payment(1,status.notpaid,type.cash);
        booking newbooking = new booking(1,"from","to",20000);
        allpayment.put(newbooking,newpayment);

    }
    public void addpayment(int passid){
        for(Map.Entry<booking,payment> entry: allpayment.entrySet()){
            if(entry.getKey().getBookid()==passid){
                entry.getValue().setSt(status.success);
                System.out.println("seating allocated"+seatno);
            }
        }
    }

    public void addbooking(){
        booking newbook= new booking(1,"from","to",2000);
        allbooking.add(newbook);
    }

    public void searchflight(int flightno){
        for(flight f:allflight){
            if(f.getFlightno()==flightno){
                System.out.println(f.getFlightno()+" "+f.getDuration());
            }
        }
    }

    public void displayflightdetails(int flightno){
        for(flight f:allflight){
            if(f.getFlightno()==flightno){
                f.displaydetails();
            }
        }
    }

}
