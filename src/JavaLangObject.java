public class JavaLangObject extends Object  {
    public static void main(String[] args) {
    Student4 max=new Student4("max",21);
        System.out.println(max);// the method toString() is accessed here not by max.toString() just by writing max;
    primaryStudent kin=new primaryStudent("kin",3,"lino");
        System.out.println(kin);
    }
}
class Student4 {
    private String name;
    private int age;

    Student4(String name, int age) {
        this.name = name;
        this.age = age;

    }


    @Override
    public String toString() {
        return name+" is "+age;//with the help of this the return statement of toString() method from line 22-26 can be written here;
    }
//        return "Student4{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
 class primaryStudent extends Student4{
private String parentName;
primaryStudent(String name,int age,String parentName){//constructor for the primary student;
    super(name,age);//we are inhereting the feature of Super class Student4 in this line
    this.parentName=parentName;
}

     @Override
     public String toString() {
    return parentName+" is parent of "+super.toString();//with the help of super.toString() we access the toString() method of parent class Student4;

//         return "primaryStudent{" +
//                 "parentName='" + parentName + '\'' +
//                 "} " + super.toString();
     }
 }