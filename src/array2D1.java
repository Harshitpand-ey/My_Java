import java.util.Scanner;

public class array2D1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows and coulmn of matrix");
        int m=sc.nextInt();
        int n= sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }

    }
}
