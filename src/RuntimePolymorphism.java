class A{
    void show(){
        System.out.println("this is class A");
    }
}
class B extends A{
void show(){
    System.out.println("this is class B");
}
}
public class RuntimePolymorphism {
    public static void main(String[] args) {
        //In polymorphism inheritance is required;
        A o=new A();//here A method will print whatever will be on right side in polymorphism thats method or code will be executed
        o.show();
        A ob=new B();//here we call the method of B of class A as we see B is a child class of A so b inherits all the method of A so when we call B a automatically calls it won't throw error this is called polymorphism;
        ob.show();
    }
}
