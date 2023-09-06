import java.util.Scanner;

public class h1 {



        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.nextLine();
                int x=sc.nextInt();
                //Complete this line
                System.out.printf("%-15s%03d\n",s1,x);//-15 is used to make the space of 15 characters from string to int value;
            }
            System.out.println("================================");
            sc.close();

        }

    }





