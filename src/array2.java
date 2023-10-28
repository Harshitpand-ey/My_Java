import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
       int n;
        System.out.println("enter the size of array");
        Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
        int marks[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            marks[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(marks[i]);
        }
    }
}
