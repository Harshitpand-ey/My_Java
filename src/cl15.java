import java.util.Scanner;

public class cl15 {
        public static void main(String args[])
        {
            Scanner sc= new Scanner(System.in);
            int[][] arr;
            arr=new int[3][3];
            System.out.println("Enter the elements");
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            int sum = 0;
            for (int i=0;i<3;i++){
                sum += arr[i][i];
            }
            System.out.println("Sum of the elements are "+sum);
        }
    }

