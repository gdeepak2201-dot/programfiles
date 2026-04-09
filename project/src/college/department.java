package college;

public class department {

    private int deptid;
    private  String deptname;

    public department(int deptid, String deptname) {
        this.deptid = deptid;
        this.deptname = deptname;
    }

    public int getDeptid() {
        return deptid;
    }

    public String getDeptname() {
        return deptname;
    }
}
