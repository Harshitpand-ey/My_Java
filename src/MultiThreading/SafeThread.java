package MultiThreading;
class C{
    int count;
  public  synchronized void  increament(){//If we won't use the synchronised keyword the output of count is always different
      //So the synchronised keyword helps in to execute increament method once at a moment;
      //Basically means both threads won't be exxecuted at same moment;
        count++;
    }
}
public class SafeThread {
    public static void main(String[] args) throws InterruptedException {
        C ob=new C();
        Runnable ob1=()->{

            for(int i=0;i<1000;i++) {
                ob.increament();
            }
        };
        Runnable ob2=()->{

            for(int i=0;i<1000;i++){
                ob.increament();
            }
        };
//        System.out.println(ob.count);
        Thread t1=new Thread(ob1);
        Thread t2=new Thread(ob2);
        t1.start();
        t2.start();
        t1.join();//allows one thread to wait for the completion of another
        t2.join();
        System.out.println(ob.count);
    }
}
