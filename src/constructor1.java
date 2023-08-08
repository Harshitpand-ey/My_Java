public class constructor1 {
    private int AccountNumber;
    private double AccountBalance;
    private String AccountHolderName;
    private String AccountHolderEmail;
    private String AccouuntHolderPhoneNo;
    public constructor1(int AccountNumber,double AccountBalance, String AccountHolderName,
                        String AccountHolderEmail,String AccouuntHolderPhoneNo){//it is the constructor statement
        System.out.println("account holder details are :");
        this.AccountNumber=AccountNumber;
        this.AccountBalance=AccountBalance;
        this.AccountHolderEmail=AccountHolderEmail;
        this.AccountHolderName=AccountHolderName;
        this.AccouuntHolderPhoneNo=AccouuntHolderPhoneNo;
    }

    public void depositFund(double amount){//A method for fund depositing
        AccountBalance+=amount;
        System.out.println("deposit of $"+amount+" total account balance is:$"
                +AccountBalance);
    }
    public void withdrawlFund(double withdrawlAmount){//A method for withdrawing the funds
        if(AccountBalance-withdrawlAmount<=0){
            System.out.println("Insufficient funds");
        }
        else{
            AccountBalance -= withdrawlAmount;
            System.out.println("withdrawl of amount $" + withdrawlAmount +
                    " current account balance is $" + AccountBalance);
        }}
    public int getAccountNumber(){
        //getter method for account number;

        return AccountNumber;
    }

    public double getAccountBalance() {
        //getter method for account balance;
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
        //A setter method to the set the value of account number
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


