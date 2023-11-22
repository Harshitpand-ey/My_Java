package Lab;

import java.util.Scanner;

public class cl3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter number 1");
        int num1=sc.nextInt();
        System.out.println("enter number 2");
        int num2=sc.nextInt();
        int add=num1+num2;
        int subtract=num1-num2;
        int multiplication=num1*num2;
        double division=num1/num2;
        System.out.println(add);
        System.out.println(subtract);
        System.out.println(multiplication);
        System.out.println(division);
    }
}
