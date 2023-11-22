package Udemy;

public class ch8 {
    public static void main(String[] args) {

        int count=0;
        for(int number=11;number<=50;number++){
            if(countPrime(number)){
                System.out.println("prime number is "+number);
                count++;

            }
            if(count==3){
                System.out.println("Found 3-Exiting the for loop");
                break;
            }


        }
        System.out.println("total number of prime numbers between 0 to 1000 is "+count);

    }
    public static boolean countPrime(int number){

            for(int divior=2;divior<=number/2;divior++){
                if(number%divior==0){
                    return false;
                }
            }

        return true;
    }
}
