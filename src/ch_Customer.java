public class ch_Customer {
private String name;
private int CreditLimit;
private String emailId;
public String getName(){
    return name;
}
public int getCreditLimit(){
    return CreditLimit;
}
public String getEmailId(){
    return emailId;
}
public ch_Customer(String name, int CreditLimit, String emailId){
    System.out.println("customer details are");
    this.name=name;
    this.CreditLimit=CreditLimit;
    this.emailId=emailId;
}
public ch_Customer(){
    this("Har",45,"hars@gmail.com");
}
public ch_Customer(String name, String emailId){
    this("har",879,"harshit@gmail.com");
}
}
