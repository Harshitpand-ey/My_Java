public class ch14BankAccount {
    private int AccountNumber;
    private double AccountBalance;
    private String AccountHolderName;
    private String AccountHolderEmail;
    private String AccouuntHolderPhoneNo;
    public ch14BankAccount(){//its name is same as class name or file name
        System.out.println("empty constructor called");//constructor it is basically default constructor
    }
public void depositFund(double amount){
    AccountBalance+=amount;
    System.out.println("deposit of $"+amount+" total account balance is:$"+AccountBalance);
}
public void withdrawlFund(double withdrawlAmount){
   if(AccountBalance-withdrawlAmount<=0){
       System.out.println("Insufficient funds");
   }
    else{
        AccountBalance -= withdrawlAmount;
        System.out.println("withdrawl of amount $" + withdrawlAmount + " current account balance is $" + AccountBalance);
    }}
    public int getAccountNumber() {
        return AccountNumber;
    }

    public double getAccountBalance() {
        return AccountBalance;
    }

    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public String getAccountHolderEmail() {
        return AccountHolderEmail;
    }

    public String getAccouuntHolderPhoneNo() {
        return AccouuntHolderPhoneNo;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        AccountBalance = accountBalance;
    }

    public void setAccountHolderName(String accountHolderName) {
        AccountHolderName = accountHolderName;
    }

    public void setAccountHolderEmail(String accountHolderEmail) {
        AccountHolderEmail = accountHolderEmail;
    }

    public void setAccouuntHolderPhoneNo(String accouuntHolderPhoneNo) {
        AccouuntHolderPhoneNo = accouuntHolderPhoneNo;
    }


}
