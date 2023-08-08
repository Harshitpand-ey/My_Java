public class constructor1_Calling {
    public static void main(String[] args) {


        constructor1 Harshit = new constructor1(89700219, 788, "harshit", "hars@gmail.com", "90976965797");//this is using instead of the setter
        System.out.println("Account Holder's name "+Harshit.getAccountHolderName());
        System.out.println("Account holder mail and phone number and current account balance and account number is "+Harshit.getAccountHolderEmail()+" "+Harshit.getAccouuntHolderPhoneNo()+" "+Harshit.getAccountBalance()+" "+Harshit.getAccountNumber());
    }
}