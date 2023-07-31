//Task of this code is to find the sum of the digits like eg 125 so the sum of this numbers digits is 1+2+5=8;so this will be our output 8
public class ch11 {
    public static void main(String[] args) {
        System.out.println("sum of digits = "+sumDigits(1234));
        System.out.println("sum of digits = "+sumDigits(-100));

    }

    public static int sumDigits(int number) {
        int sum = 0;

        if (number < 0) {
            return -1;
        }
        else {
            for(int i=number;i>=1;i/=10){
                int remainder=i%10;
                sum+=remainder;


            }
            return sum;

        }

    }
}