package hotel.com;

public class servant {
    private int serid;
    private String sername;

    public servant(int serid,String sername){
        this.serid=serid;
        this.sername=sername;
    }

    public int getserid() {
        return serid;
    }

    public void setserid(int serid) {
        this.serid = serid;
    }

    public String getsername() {
        return sername;
    }

    public void setsername(String sername) {
        this.sername = sername;
    }
}
