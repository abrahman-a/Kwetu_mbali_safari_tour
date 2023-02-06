import java.util.Scanner;
public class  Kwetu_mbali_Tour {
    private String name;
    private String Address;
public Kwetu_mbali_Tour(){
    name=name;
    Address = Address;
}
public String getName(){
    return name;
}
public String getAddress(){
    return Address;
}
public void setName(String NewName){
    name = NewName;
}
public void setAddress(String NewAddress){
    Address = NewAddress;
}

public void Mbali(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter: name ");
    name =input.next();
    System.out.println("Enter Address: ");
    Address = input.next();
    System.out.println("The name is : " +name+ " Address selected " +Address);
}
}