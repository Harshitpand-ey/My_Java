//Run time polymorphism or Dynamic method dispatch
class Apple{
    void show(){
        System.out.println("this is apple");
    }
}
class Banana extends Apple{
    void show(){
        System.out.println("this is banana class inherited from Apple class");
    }
}
class Cherry extends Apple{
    void show(){
        System.out.println("this is cherry class inherited from Apple");
    }
}
public class cl23 {
    public static void main(String[] args) {
        Apple a=new Apple();
        a.show();
        Apple B=new Banana();
        B.show();
        Apple C=new Cherry();
        C.show();
    }
}
