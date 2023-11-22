 class ABC{
    public void show() throws ClassNotFoundException{

            Class.forName("demPo");
    }
}
 public class ExceptionThrows {
    public static void main(String[] args) {
        ABC ob=new ABC();
        try {
            ob.show();
        }
        catch (ClassNotFoundException e){//This is used to handle the exception
            System.out.println("Class is not present with that name");
        }
    }
}
