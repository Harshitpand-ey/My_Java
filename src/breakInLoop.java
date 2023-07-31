public class breakInLoop {//In this code we apply break in for loop;
    public static void main(String[] args) {
        for(double ratePercent=7.5;ratePercent<=10;ratePercent=ratePercent+0.25){
            double interestAmount=calculateInterest(100,ratePercent);
            if(interestAmount>8.5){//jaise hi amount 8.5 se jyada ho break laga do yani agge code run hi na kre;
                break;//it will stop the further running of for loop because we apply break in it after the amount of $8.5 it similar to the break we apply in switch but here its role is different;
            }
            System.out.println("$100 interest amount is $"+interestAmount+" at "+ratePercent);
        }

    }

    public static double calculateInterest(double amount,double rate){
        return (amount*(rate/100));
    }
}

