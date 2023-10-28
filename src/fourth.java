import java.util.Scanner;

 class rough9 {


        long acc_no;
        double balance;
        void input()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter account no and balance");
            acc_no=sc.nextLong();
            balance=sc.nextDouble();

        }

        void display()
        {
            System.out.println("account no is"+acc_no);
            System.out.println("balance is"+balance);
        }

    }
    class person extends rough9
    {
        String name;
        int adhaar_no;
        void input1()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter name and adhaar no");
            name=sc.nextLine();
            adhaar_no=sc.nextInt();

        }
        void display()
        {
            System.out.println("name is "+name);
            System.out.println("adhaar no is "+adhaar_no);
            System.out.println("enter info of next person");
        }
    }

    public class fourth  {
        public static void main(String[] args) {
            int i;
            rough9 obj1=new rough9();
            person obj2=new person();
            for(i=1;i<=3;i++)
            {
                obj1.input();
                obj2.input1();
                obj1.display();
                obj2.display();
            }

        }

    }

