import java.util.Scanner;

public class array2D2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt()
              ;
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        int element=sc.nextInt();
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==element){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
