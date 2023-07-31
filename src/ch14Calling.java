public class ch14Calling {
    public static void main(String[] args) {
        ch14BankAccount Harshitbank=new ch14BankAccount();
        Harshitbank.setAccountHolderName("Harshit");
        Harshitbank.setAccountBalance(1089);
        Harshitbank.setAccountHolderEmail("harshit@gmail.com");
        Harshitbank.setAccouuntHolderPhoneNo("8203728923");
        System.out.println("Account Holder's name "+Harshitbank.getAccountHolderName());
        System.out.println("Account holder mail and phone number and current account balance is "+Harshitbank.getAccountHolderEmail()+" "+Harshitbank.getAccouuntHolderPhoneNo()+" "+Harshitbank.getAccountBalance());
     Harshitbank.depositFund(100);
     Harshitbank.withdrawlFund(90);
    }
}
