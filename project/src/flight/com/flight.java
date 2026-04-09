package flight.com;

public class flight {
    private int flightno;
    private int seat;
    private int duration;

    public flight(int flightno, int seat, int duration) {
        this.flightno = flightno;
        this.seat = seat;
        this.duration = duration;
    }

    public int getFlightno() {
        return flightno;
    }

    public int getSeat() {
        return seat;
    }

    public int getDuration() {
        return duration;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public void displaydetails(){
        System.out.println("flightno"+flightno+" "+"duration"+duration);
    }
}
