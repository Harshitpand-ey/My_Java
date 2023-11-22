package MultiThreading;
class A extends Thread{
    public void run(){//Method  name must be run
        for(int i=0;i<100;i++){
            System.out.println("hii");
            try{
                Thread.sleep(10);//Used to stop the execution of the current program for specific duration of time
            }
            catch (InterruptedException e){
                System.out.println("Exception occurs");
            }
        }
    }
}

class B extends Thread{
    public void run(){//Method name must be run
        for(int i=0;i<100;i++){
            System.out.println("hello");
            try{
                Thread.sleep(10);
            }
            catch (InterruptedException e){
                System.out.println("Exception occured");
            }
        }
    }
}
public class Multithreading1 {
    public static void main(String[] args) {
     A obj1=new A();
     B obj2=new B();
        System.out.println(obj1.getPriority());
        obj2.setPriority(Thread.MAX_PRIORITY);
     obj1.start();//helps us to start the Thread's execution
     try{
         Thread.sleep(8);
     }
     catch (InterruptedException e){
         System.out.println("Exception occurs");
     }
     obj2.start();
    }
}
//Multithreading help in parallely running two methods or classes like as we do here with class A & class B method;