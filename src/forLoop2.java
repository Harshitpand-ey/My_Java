public class forLoop2 {
    public static void main(String[] args) {
        for(double rate=2;rate<=5;rate++){//it is basically the giving the interest rate amount at 2%,3%,4% &5%;
            double intersetamount=calculateInterest(10000,rate);
            System.out.println(intersetamount+" of interest rate"+rate+" of 10000 ");
        }
    }
    public static double calculateInterest(double amount,double rate){
        return (amount*(rate/100));
    }
}
