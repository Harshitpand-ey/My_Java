public class forLoop3 {
    public static void main(String[] args) {
        for(double ratePercent=7.5;ratePercent<=10;ratePercent=ratePercent+0.25){
            double interestAmount=calculateInterest(100,ratePercent);
            System.out.println("$100 interest amount is "+interestAmount+" at "+ratePercent);
        }

    }

    public static double calculateInterest(double amount,double rate){
        return (amount*(rate/100));
    }
}
