package college;

public class period {

    private int periodid;
    private String periodname;


    public period(int periodid, String periodname) {
        this.periodid = periodid;
        this.periodname = periodname;
    }

    public int getPeriodid() {
        return periodid;
    }

    public String getPeriodname() {
        return periodname;
    }
}
