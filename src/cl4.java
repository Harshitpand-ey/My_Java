import java.util.Scanner;

public class cl4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 number");
        int x=sc.nextInt();
        System.out.println("enter 2nd number");
        int y=sc.nextInt();
        int temp=x;
        x=y;
        y=temp;
        System.out.println("after swap");
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
}
