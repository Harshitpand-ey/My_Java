import java.util.Scanner;

interface Emploee{
    void getDetails();
}
interface Maanager extends Emploee{
    void getDeptDetails();
}
class Head implements Maanager{
    int EmpId;String EmpName;
   int DeptId;String DeptName;
   public void getDetails(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter employee id and employee name");
       EmpId= sc.nextInt();
       EmpName= sc.next();
   }
   public void getDeptDetails(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter department id and Department name");
       DeptId= sc.nextInt();
       DeptName= sc.next();
    }
    void display(){
        System.out.println("Empid is "+EmpId);
        System.out.println("EmpName is "+EmpName);
        System.out.println("DeptName is "+DeptName);
        System.out.println("DeptId is "+DeptId);
        }
}
public class cl28 {
    public static void main(String[] args) {
        Head h=new Head();
        h.getDetails();
        h.getDeptDetails();
        h.display();
    }
}
