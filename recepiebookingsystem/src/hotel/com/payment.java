package hotel.com;

public class payment {
    private int paymentid;
    private int amount;
    private status pay;

    public payment(int paymentid,int amount,status pay){
        this.paymentid=paymentid;
        this.amount =amount;
        this.pay=pay;
    }

    public int getpaymentid() {
        return paymentid;
    }

    public int getamount() {
        return amount;
    }

    public status getstatus(){
        return pay;
    }


}
