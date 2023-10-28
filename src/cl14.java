import java.util.Scanner;

public class cl14 {

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] arr;
        arr=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int c=0;
            for (int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            System.out.println("Occurance of "+arr[i]+" is "+c);
        }
    }
}

