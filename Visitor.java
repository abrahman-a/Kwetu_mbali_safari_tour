import java.util.Scanner;
public class Visitor extends Kwetu_mbali_Tour {
    private int    CustomerMobile;
    private String CustomerEmail;
    private String CustemerGender;
public Visitor(){
    this.CustomerMobile = CustomerMobile;
    this.CustomerEmail  = CustomerEmail;
    this.CustemerGender = CustemerGender;
}
public int getCustomerMobile(){
    return CustomerMobile;
}
public String getCustomerEmail(){
    return CustomerEmail;
}
public String getCustomerGender(){
    return CustemerGender;
}
public void Visitor1(){ 
    Scanner input = new Scanner(System.in);
    super.Mbali();
    System.out.println("Enter Mobile Number: ");
    CustomerMobile = input.nextInt();
    System.out.println("Enter your email");
    CustomerEmail = input.next();
    System.out.println("Enter your Gender");
    CustemerGender = input.next();
    System.out.println("Customer Mobile number" +CustomerMobile+ " Email address is: " +CustomerEmail+ " Your Gender " +CustemerGender);
}

}
