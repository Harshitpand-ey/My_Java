class Dog20 {
    //Creating below a instance method Bark;
    public void Bark(){//See carefully there is no static keyword so it is instance method;

        System.out.println("WOLF");
    }
}
public class instanceMethod_Dog {
    public static void main(String[] args) {
        Dog20 rex=new Dog20();//create instance
        rex.Bark();//call instance method;
    }
}
