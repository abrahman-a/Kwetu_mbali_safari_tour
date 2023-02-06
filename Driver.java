import java.util.Scanner;
public class Driver extends Kwetu_mbali_Tour {
    private int DriverID;
    private String TransType;
public Driver(){
    super();
    DriverID = DriverID;
    TransType = TransType;
}
public int getDriverID(){
    return DriverID;
}
public String getTransType(){
    return TransType;
}
public void Driver1(){
    Scanner input = new Scanner(System.in);
    super.Mbali();
    System.out.println("Enter Your ID");
    DriverID = input.nextInt();
    System.out.println("Enter the transport type");
    TransType = input.next();
    System.out.println("Driver ID is :" +DriverID+ " driver select " +TransType);

}
}
