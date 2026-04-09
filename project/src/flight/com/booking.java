package flight.com;

public class booking {

    private int bookid;
    private String destination;
    private String souceplace;
    private int budget;

    public booking(int bookid, String destination, String souceplace, int budget) {
        this.bookid = bookid;
        this.destination = destination;
        this.souceplace = souceplace;
        this.budget = budget;
    }

    public int getBookid() {
        return bookid;
    }

    public String getDestination() {
        return destination;
    }

    public String getSouceplace() {
        return souceplace;
    }

    public int getBudget() {
        return budget;
    }
}
