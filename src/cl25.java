//Abstract Class
import java.util.Scanner;

abstract class SStudent{
    int roll;
    int regNo;
    public abstract void input();
    public abstract void course();
}
class kiitian extends SStudent{
    @Override
    public void input() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll number:");
        roll= sc.nextInt();
        System.out.println("Enter regNo:");
        regNo= sc.nextInt();
    }

    @Override
    public void course() {
        System.out.println("Roll number is "+roll
        +"\n Registeration number is "+regNo+
                "\n Course:-B.Tech.(Computer Science & Engg)");
    }
}
public class cl25 {
    public static void main(String[] args) {
        SStudent a=new kiitian();
        a.input();
        a.course();
    }
}
