public class constructorChaining1 {

        private int AccountNumber;
        private double AccountBalance;
        private String AccountHolderName;
        private String AccountHolderEmail;
        private String AccouuntHolderPhoneNo;
        public constructorChaining1(/*no arguments*/){// here we are doing constructor chaining with the help of this and our constructor is written on lines 13-21 we are just calling it here;
          //  System.out.println("it will throw error if it is above the this because anything in the overloading constructor above this statement will throw error");
            this(8987493,23.45,"Adit","adit@gmail.com","62007890");
            System.out.println("empty constructor called ");
        }
        public constructorChaining1(int AccountNumber,double AccountBalance, String AccountHolderName,
                            String AccountHolderEmail,String AccouuntHolderPhoneNo){
            System.out.println("account holder details are :");
          setAccountNumber(AccountNumber);//but this is not  good practice to call setters inside constructor and also the other methods except the other constructors//  this.AccountNumber=AccountNumber;
            this.AccountBalance=AccountBalance;
            this.AccountHolderEmail=AccountHolderEmail;
            this.AccountHolderName=AccountHolderName;
            this.AccouuntHolderPhoneNo=AccouuntHolderPhoneNo;
        }
        public constructorChaining1(double AccountBalance, String AccountHolderName,
                            String AccountHolderEmail){

            //the problem here is there is no account number nor account holder phone number;
            //these all constructor take reference from the main constructor which is above one
            //now we can add all things like account number and phone number instead it is not in arguments
            this(73471808,78,"Mani","hqhdw@hjhbjw.com","9839209e9092");
            System.out.println("it is mani's constructor");
        }

        public void depositFund(double amount){
            AccountBalance+=amount;
            System.out.println("deposit of $"+amount+" total account balance is:$"
                    +AccountBalance);
        }
        public void withdrawlFund(double withdrawlAmount){
            if(AccountBalance-withdrawlAmount<=0){
                System.out.println("Insufficient funds");
            }
            else{
                AccountBalance -= withdrawlAmount;
                System.out.println("withdrawl of amount $" + withdrawlAmount +
                        " current account balance is $" + AccountBalance);
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
