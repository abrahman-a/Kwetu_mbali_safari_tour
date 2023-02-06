public class Kwetu_mbali_TourTest {
    public static void main(String[] args){
        BookingTicket bk = new BookingTicket();
        bk.Booking();
        Travel vel = new Travel();
        vel.Travel1();
        Visitor vis = new Visitor();
        vis.Visitor1();
        Driver dv = new Driver();
        dv.Driver1();
        System.out.println("The amout to be paid is: "+vel.getAmount());
    }
       
       
}
