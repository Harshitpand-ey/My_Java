class Student{
    private String name;
    private String sec;
    private int rollNo;

    public Student(String name, String sec, int rollNo) {
        this.name = name;
        this.sec = sec;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sec='" + sec + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
    public void studentStuff(String name,String sec,int rollNo){
        System.out.println(name+" is name "+sec+" is sec "+rollNo+" is the roll no ");
    }
}
public class inheritance_2  {

    public static void main(String[] args) {
        Ankit ar=new Ankit();
       doStudentStuff(ar,"Ankit");






    }
    public static void doStudentStuff(Student student, String name)
    {
        doStudentStuff(student,"");
        System.out.println(student);
    }
}
class Ankit extends Student {
    public Ankit(){
        super("Hars","c",32);
    }
}
