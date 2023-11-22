package General;

public class employee {
    protected int empid;
    private String eName;
    public employee(int empid,String eName){
        this.empid=empid;
        this.eName=eName;

    }
    public double earning(double basic){
     double earning=basic+(.8*basic)+(.15*basic);
     return earning;
    }
    public String getName() {
        return eName;
    }
}
