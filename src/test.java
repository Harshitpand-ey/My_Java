public class test {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(45690809));

    }

        public static int sumFirstAndLastDigit(int number){
            int lastDigit=number%10;
            int firstDigit=0;
            int reverse=0;
            int sum=0;
            if(number>0){ for(int i=number;i>=1;i/=10){
                int reverseLastDigit=i%10;
                reverse=(reverse*10)+reverseLastDigit;
            }
                firstDigit=reverse%10;
                sum=firstDigit+lastDigit;
                return sum;

            }
            else{
                return -1;
            }
        }

    }

