package MultiThreading;
class K implements Runnable{
    public void run(){//Method  name must be run
        for(int i=0;i<5;i++){
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

class L implements Runnable{
    public void run(){//Method name must be run
        for(int i=0;i<5;i++){
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
public class MultiThreading2 {
    public static void main(String[] args) {
        Runnable obj1=new K();
        Runnable obj2=new L();
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();

    }
}
//Multithreading help in parallely running two methods or classes like as we do here with class A & class B method;