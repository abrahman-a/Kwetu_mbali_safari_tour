import java.util.Scanner;
public class BookingTicket  extends Kwetu_mbali_Tour{
    private String BookingType;
    private String BookingDate;
    private String BookingDescription;
public BookingTicket(){
    BookingType= BookingType;
    BookingDate = BookingDate;
    BookingDescription = BookingDescription;
}
public void Booking(){
    Scanner input = new Scanner(System.in);
    super.Mbali();
    System.out.println("Choose type of Booking(VIP,Economic)");
    BookingType=input.next();
    System.out.println("Enter Date of Booking");
    BookingDate=input.next();
    System.out.println("Enter description about your Booking");
    BookingType=input.next();
    System.out.println("You Booking "+ BookingType+ " The date of booking Selected is " +BookingDate+ " Your Comment: " +BookingDescription);
}
public String getBookingType(){
    return BookingType;
}
public String getBookingDate(){
    return BookingDate;
}
public String getBookingDesc(){
    return BookingDescription;
}

}
