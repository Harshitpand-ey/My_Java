abstract class AB{

    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("Play music");
    }
        }
   abstract class C extends AB {
       @Override
       public void drive() {
           System.out.println("Drive the car");
       }


//       public void fly() {
//           System.out.println("car is flying");
//       }
   }
   class UpdatedC extends C{//It is the conrete class;
    public void fly(){
        System.out.println("Car is flying");
    }
   }
public class Abstract {
    public static void main(String[] args) {
        AB a=new UpdatedC();
        a.drive();
        a.fly();
        a.playMusic();
    }
}
