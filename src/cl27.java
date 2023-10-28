import java.util.Scanner;

interface  SalaryCalculator{
    double earnings(double basic);
    double deduction(double basic);
    double bonus(double basic);
}
class Manager implements SalaryCalculator{
    @Override
    public double deduction(double basic) {
       return (.12*basic);
    }

    @Override
    public double earnings(double basic) {
        return basic + (0.8 * basic) + (0.15 * basic);
    }
    public double bonus(double basic) {
        return 0; // Bonus not implemented for Manager
    }
}
class SubStaff extends Manager{
    @Override
    public double bonus(double basic) {
    return (.5*basic);
    }
}
public class cl27 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the basic salary");
        double basic= sc.nextDouble();
        Manager ob=new Manager();
        System.out.println("Earning is ="+ob.earnings(basic));
        System.out.println("Deduction is ="+ob.deduction(basic));
        System.out.println("Bonus is ="+ob.bonus(basic));
    }
}
