import trainpackage.Appservice;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Appservice.adduser();
        Appservice.adddestination();
        Appservice.addtransport();
        Appservice.addhotel();
        Appservice app = new Appservice();

        app.confirmation("arunkumarhotel","flight");

    }
}