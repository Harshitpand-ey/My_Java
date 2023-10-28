import java.util.Scanner;

public class kulu {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        //    Scanner s=new Scanner(System.in);
            boolean found=false;

            int i;
            System.out.print("enter size of array: ");
            int n = sc.nextInt();
            int m[] = new int[n];

            System.out.print("enter array: ");
            for (i = 0; i < n; i++) {
                m[i] = sc.nextInt();
            }
            System.out.println("enter element to be searched: ");
            int x = sc.nextInt();



        for(i=0;i<n;i++){
            if(x == m[i]){
                found=true;

                break;
            }
        }
            if(found=true){
                System.out.println("element found");
            }
            else{
                System.out.println("element not found");
            }
        }
    }
/*float count=0;
        float arr[] = new float[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextFloat();
            count = arr[i]+count;


        }
        System.out.println(count);  */

