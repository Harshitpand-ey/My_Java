interface computer{//it is the interface class
    void code();
}
class laptop implements computer{
   public void code(){
       System.out.println("code run compile");
    }
}
class Desktop  implements computer{
    public void code(){
        System.out.println("code run compile faster");
    }
}
class developer{
    public void devApp(computer lap){

        lap.code();
    }
}
public class Interface {
    public static void main(String[] args) {
        computer o=new laptop();
        computer a=new Desktop();
        developer harshit=new developer();
        harshit.devApp(o);
        harshit.devApp(a);

    }
}
