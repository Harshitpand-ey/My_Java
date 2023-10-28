package tool;
class A{
    void show(){
        System.out.println("show method");
    }
   static class B{
        void config(){
            System.out.println("config method");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();
        A.B obj1=new A.B();//object to get methods of inner class B;
        obj1.config();
    }
}
