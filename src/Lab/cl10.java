package Lab;

import java.util.Scanner;

public class cl10 {
    public static void main(String[] args) {

        int sum=0;
        System.out.println("Enter the the number");

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       while (num>0||sum>9){
          if(num==0){
              num=sum;
              sum=0;
          }
          sum+=num%10;
          num/=10;
       }
        System.out.println("sum of the digits are"+sum);
    }
}
