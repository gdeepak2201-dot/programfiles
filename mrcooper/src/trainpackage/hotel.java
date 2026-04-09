package trainpackage;

public class hotel {
    private int hotelid;
    private int vaccancy;
    private String hotelname;

    hotel(int hotelid,int vaccancy,String hotelname){
        this.hotelid=hotelid;
        this.hotelname=hotelname;
        this.vaccancy=vaccancy;
    }

    public int getvaccancy(){
        return vaccancy;
    }
    public String gethotelname(){
        return hotelname;
    }

    public void roombooking(){
        if(vaccancy>0){
            this.vaccancy--;
            System.out.print("room available");
        }
        else{
            System.out.print("no rooms available");
        }
    }
}
