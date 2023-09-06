import java.util.Scanner;

public class man1 {
    public static void main(String[] args) {
        int i,j,even=0,evenSum=0,odd=0,oddSum=0,totalSum=0;
        System.out.println("enter the numbers");
        Scanner sc=new Scanner(System.in);
        for(i=1;i<=20;i++){
            i=sc.nextInt();
            if(i%2==0){
                System.out.println("even");
                even++;
                evenSum+=i;
            }
            else{
                System.out.println("odd");
                odd++;
                oddSum+=i;
            }
        }
        System.out.println(odd);
        System.out.println(even);
        System.out.println(oddSum);
        System.out.println(evenSum);
    }
}
