package Lab;

public class ch9Debugger {
    public static void main(String[] args) {
        int sum=0;
        int countOfMatches=0;
        for(int num=1;num<=1000;num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                sum = sum + num;
                countOfMatches++;
                System.out.println("number is =" + num);
            }
            if (countOfMatches == 5) {// it is used to print the sum of numbers till 5 numbers where 3 and 5 common numbers are found;

                break;
            }
        }
            System.out.println(sum);


        }
    }

