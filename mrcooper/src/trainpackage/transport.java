package trainpackage;

public class transport {
    private int transportid;
    private String mode;
    private int seats;
    private int cost;


    transport(int transportid,String mode,int seats,int cost){
        this.mode=mode;
        this.transportid=transportid;
        this.seats=seats;
        this.cost=cost;
    }

    public String getmode(){
        return mode;
    }

    public int getcost(){
        return cost;
    }
    public int getseat(){
        return seats;
    }

    public void transportbooking(){
        seats--;
        if(seats<10){
            cost+=1000;
        }
    }


}

