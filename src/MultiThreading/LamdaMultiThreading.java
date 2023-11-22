package MultiThreading;

public class LamdaMultiThreading {
    public static void main(String[] args) {
        Runnable ob1=()->{

                for(int i=0;i<5;i++) {
                    System.out.println("hii");
                    try {
                        Thread.sleep(10);//Used to stop the execution of the current program for specific duration of time
                    } catch (InterruptedException e) {
                        System.out.println("Exception occurs");
                    }
                }
        };
       Runnable ob2=()->{

               for(int i=0;i<5;i++){
                   System.out.println("hello");
                   try{
                       Thread.sleep(10);//Used to stop the execution of the current program for specific duration of time
                   }
                   catch (InterruptedException e){
                       System.out.println("Exception occurs");
                   }
               }
       };
       Thread t1=new Thread(ob1);
       Thread t2=new Thread(ob2);
       t1.start();
       t2.start();
    }
}
