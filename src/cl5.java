import java.util.Scanner;

public class cl5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int r = 0;
        while(n!=0) {
//            int r = 0;
            int d = n % 10;
             r = (r * 10) + d;
            n = n / 10;

        }
       System.out.println("the number aftr swapping:"+r);
    }

}

