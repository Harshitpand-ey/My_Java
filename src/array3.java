import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      //  int element= sc.nextInt();
        Scanner s = new Scanner(System.in);

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int element= sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                System.out.println(i);
            }
        }
    }
}
