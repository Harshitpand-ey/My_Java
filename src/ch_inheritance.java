class Worker{
    private String name;
    private String birthdate;
    protected String endDate;//protected give flexibility to do some operations on endDate;




    public Worker(String name, String birthdate){//constructor with name and endDate
        this.birthdate=birthdate;
        this.name=name;

    }

    public int getAge() {
        int currentYear=2023;
        int birthYear=Integer.parseInt(birthdate.substring(6));
        return (currentYear-birthYear);
    }
    public double collectPay(){
        return 0.0;
    }
    public void terminate(String endDate){
        this.endDate=endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
public class ch_inheritance {
    public static void main(String[] args) {
        Employee salariedEmployee=new Employee("Ja","11/11/1985","2039");
        System.out.println(salariedEmployee);
        System.out.println(salariedEmployee.getAge()+" is the age");
        System.out.println(salariedEmployee.collectPay()+" is the collect pay");

       Employee joe=new Employee("joe","01/09/1987","23/08/2004");
        System.out.println(joe);
        System.out.println(joe.getAge()+" is the age");
        System.out.println(joe.collectPay()+" is the collect pay");
SalariedEmployee mark=new SalariedEmployee("mark","02/09/1999","06/03/2017",2390.89);
        System.out.println(mark);
        System.out.println("marks's paycheck is:"+mark.collectPay());
        mark.retired();
        System.out.println("pension total check is $"+mark.collectPay());


    }

}
class Employee extends Worker{
    private long employeeId;
    private String hireDate;
    private static int employeeNo=1;//static field is a place that let's you share data among all your instances;

    public Employee(String name, String birthdate,  String hireDate) {
        super(name, birthdate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
 class SalariedEmployee extends Employee{
    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthdate, String hireDate, double annualSalary) {
        super(name, birthdate, hireDate);
        this.annualSalary = annualSalary;
    }
    public double collectPay(){
        double paycheck=annualSalary/26;
        double adjustedPay=(isRetired)?0.9*paycheck:paycheck;
        return (int)adjustedPay;
    }
    public void retired(){
        terminate("12/11/2029");
        isRetired= true;
    }
}
