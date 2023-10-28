import java.util.Scanner;

public class sixth {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter length and breadth");
            int l=sc.nextInt();
            int b=sc.nextInt();
            area obj=new area();
            obj.area(l,b);
        }

    }

