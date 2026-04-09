package flight.com;

public class payment {
    private int paymentid;
    private status st;
    private type paymentmode;

    public payment(int paymentid, status st, type paymentmode) {
        this.paymentid = paymentid;
        this.st = st;
        this.paymentmode = paymentmode;
    }

    public int getPaymentid() {
        return paymentid;
    }

    public status getSt() {
        return st;
    }

    public type getPaymentmode() {
        return paymentmode;
    }

    public void setSt(status st) {
        this.st = st;
    }

    public void setPaymentmode(type paymentmode) {
        this.paymentmode = paymentmode;
    }
}
