import java.util.*;

public class cl12 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        int[] arr;
        arr=new int[n];
        System.out.println("enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int t;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }

            }
        }
        System.out.println("sorted array is:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }

}