import java.util.Scanner;

public class cl9 {
    public static void main(String[] args) {
        System.out.println("enter your marks");
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>=90){
            System.out.println("O");
        }
        if(marks>=80&&marks<90){
            System.out.println("E");
        }
        if(marks>=70&&marks<80){
            System.out.println("A");

        }
        if(marks>=60&&marks<70){
            System.out.println("B");
        }
        if(marks>=50&&marks<60){
            System.out.println("C");

        }
        if(marks>=40&&marks<50){
            System.out.println("D");
        }
        if(marks<40){
            System.out.println("Fail");
        }

    }
}
