import java.util.Scanner;

public class cl1 {


        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter your name");
            String name=sc.nextLine();
        //    System.out.println("name is "+name);
            System.out.println("enter your roll no");
            int rollNo=sc.nextInt();

            System.out.println("enter your section:");
            Scanner ac=new Scanner(System.in);
            String section=ac.nextLine();

            System.out.println("enter your branch ");
            String branch=ac.nextLine();
            System.out.println("name is "+name);
            System.out.println("roll no is "+rollNo);
            System.out.println("your section is "+section);
            System.out.println("branch is "+branch);



        }
    }

