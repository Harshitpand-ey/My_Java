import java.util.Scanner;

public class ExceptionFinally2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter number");
            int num= sc.nextInt();
            System.out.println(num);
        }
        finally {
            sc.close();//It is for closing the resource here our scanner is resource
        }
    }
}
