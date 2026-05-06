package training;

public class medicine {
    private int medid;
    private String medname;
    private int dose;

    public medicine(int dose, int medid, String medname) { 
        this.dose = dose;
        this.medid = medid;    
        this.medname = medname;  
    }

    public int getid(){
        return medid;
    }
}
