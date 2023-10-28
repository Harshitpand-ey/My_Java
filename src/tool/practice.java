package tool;
class Mobile{
    static int price;
}
public class practice{
    public static void main(String[]args){
        Mobile o=new Mobile();
        Mobile.price=100;
        System.out.println(Mobile.price);
        Mobile a=new Mobile();
        Mobile.price=12;
        System.out.println(Mobile.price);

    }
}