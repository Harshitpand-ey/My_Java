public class checka {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }


        public static int getLargestPrime(int number){
            int largestfactor=0;
            if(number<2){
                return -1;
            }
            for(int divisor=number-1;divisor>=2;divisor--){
                if(number%divisor==0){
                    number=divisor;
                }
            }
            return number;

        }
    }


