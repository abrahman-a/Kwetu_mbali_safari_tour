import java.util.Scanner;
public class Travel extends Kwetu_mbali_Tour {
    private double distance;
    private double payment;
public Travel(){
    super();
    this.distance = distance;
    this.payment = payment;
}
public void Travel1(){
    Scanner input = new Scanner(System.in);
    super.Mbali();
    System.out.println("Enter your distance travel");
    distance = input.nextDouble();
    System.out.println("Enter your price to get accurent amount to pay");
    payment=input.nextDouble();
}
public double getAmount(){
    return distance * payment;
}
public void setDistance(double NewDistance){
    if(NewDistance < 0){
        NewDistance = 0.0;
    }
    this.distance = NewDistance;
}
public void setPayment(double NewPayment){
    if(NewPayment < 0){
        NewPayment = 0.0;
    }
    this.payment = NewPayment;
}
public void DeleteTravel(String DeteleTravel){
    DeleteTravel(DeteleTravel);
}

}
