
import java.util.*;
class account
{
    long acc_no;
    double balance;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter account no and balance:");
        acc_no=sc.nextLong();
        balance=sc.nextDouble();

    }

    void display()
    {
        System.out.println("account no is"+acc_no);
        System.out.println("balance is"+balance);
    }

}
class peerson extends account
{
    String name;
    int adhaar_no;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name and adhaar no:");
        name=sc.next();
        adhaar_no=sc.nextInt();

    }
    void display()
    {
        System.out.println("name is "+name);
        System.out.println("adhaar no is "+adhaar_no);
        System.out.println("enter info of next person----");
    }
}

public class cl24 {
    public static void main(String[] args) {
        int i;
        account obj1=new account();
        peerson obj2=new peerson();
        for(i=1;i<=3;i++)
        {
            obj1.input();
            obj2.input();
            obj1.display();
            obj2.display();


        }
    }

}
