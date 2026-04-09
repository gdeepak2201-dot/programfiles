package trainpackage;
import java.util.*;

public class Appservice {
    public static List<user> alluser= new ArrayList<>();
    public static List<destination> alldestination = new ArrayList<>();
    public static List<transport> alltransport = new ArrayList<>();
    public static  List<hotel> allhotel=new ArrayList<>();



    public static void adduser(){
        user newuser = new user(101,"deepak");
        alluser.add(newuser);
    }
    public static void adddestination(){
        destination newdest = new destination(1,2000,"goa","10:00pm" ,"11:00am");
        alldestination.add(newdest);
    }

    public static void addtransport(){
        transport newtrans= new transport(2,"flight",30,3000);
        alltransport.add(newtrans);
        transport newtrans1= new transport(2,"train",60,5000);
        alltransport.add(newtrans1);
    }

    public static void addhotel(){
        hotel newhotel = new hotel(1,10,"arunkumarhotel");
        allhotel.add(newhotel);
    }
    public static boolean transportbooking(String mode){
        for(transport h : alltransport) {
            if (h.getseat() > 0 && h.getmode().equalsIgnoreCase(mode)) {
                return true;
            }
        }
        return false;
    }

    public  static boolean hotelbooking(String hotelname) {
        for (hotel h : allhotel)
            if ( h.gethotelname().equalsIgnoreCase(hotelname) && h.getvaccancy() > 0 ) {
                h.roombooking();
                return true;

            }
        return false;
        }

    public void confirmation(String hotelname, String mode) {
        boolean transportAvailable = Appservice.transportbooking(mode);
        boolean hotelAvailable = Appservice.hotelbooking(hotelname);

        if (transportAvailable && hotelAvailable) {
            System.out.println("Booking confirmed for " + mode + " and hotel " + hotelname);

        } else if (!transportAvailable && hotelAvailable) {
            System.out.println("Hotel available but no transport seats left.");
        } else if (transportAvailable && !hotelAvailable) {
            System.out.println("Transport available but hotel is full.");
        } else {
            System.out.println("Sorry, neither transport nor hotel is available.");
        }
    }


}
