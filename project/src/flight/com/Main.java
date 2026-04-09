import flight.com.flightapp;
void main() {
    flightapp app= new flightapp();
    app.addflight();
    app.addbooking();
    app.addpayment(1);
    app.addpayment(1);
    app.searchflight(1);
    app.displayflightdetails(1);
}