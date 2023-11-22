class A{
    public void show(){
        try {
            Class.forName("block");
        }
        catch (ClassNotFoundException e){
            System.out.println("This class name file is not present");
        }
    }
}
public class ExceptionThrows {
    public static void main(String[] args) {


        A ob = new A();
        ob.show();
    }
}