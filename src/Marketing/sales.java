
package Marketing;

import General.employee;

import java.util.Scanner;

public class sales extends employee {
    public sales(int empid, String ename)

    {
        super(empid, ename);
    }
public double tallowance(int basic){

    double earning=.5*earning( basic);
    return earning;
}

    public static void main(String[] args) {
        int empid;
        String name;
        int basic;
        Scanner sc=new Scanner(System.in);
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the employee id and emploee name");
        empid=sc.nextInt();
        name=s.nextLine();
        System.out.println("Enter the basic salary");
        basic=sc.nextInt();
        sales salesPerson=new sales(empid,name);
        System.out.println("The emp id of the employee is "+salesPerson.empid);
        System.out.println("Total earning is "+ salesPerson.earning(basic));
    }
}
