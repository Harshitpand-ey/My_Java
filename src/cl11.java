import java.util.Scanner;

public class cl11 {
    public static void main(String[] args) {
        int n;
        int noOfEven=0;
        int noOfOdd=0;
        System.out.println("enter the size of array");
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                noOfEven++;
            } else if (arr[i]%2!=0) {
                noOfOdd++;

            }
        }
        System.out.println("number of odd = "+noOfOdd);
        System.out.println("number of even = "+noOfEven);
    }
}
