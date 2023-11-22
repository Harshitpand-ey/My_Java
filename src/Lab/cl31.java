package Lab;

import java.util.Scanner;

class HrsException extends Exception{
    public HrsException(){
        super();
    }

}
class MinException extends Exception{
    public MinException(){
        super();
    }
   // public String toString(){
     //   return "Invalid Minute";
    //}
}
class SecException extends Exception{
    public SecException(){
        super();
    }
   // public String toString(){
      //  return "Invalid second";
    }
//}
class Time{
    int hours;
    int minutes;
    int seconds;
    public void InputUser(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter time");
        hours=sc.nextInt();
        minutes= sc.nextInt();
        seconds= sc.nextInt();
        if(hours>24 ||hours<0){
            try{
                throw new HrsException();
            }
            catch (HrsException e){
                System.out.println("Caught the exception Exception occurred: InvalidHourException:hour is not greater than 24");
            }
        }
        if(minutes>60||minutes<0){
            try {
                throw new MinException();
            }
            catch (MinException e){
                System.out.println("Exception occurred: InvalidMinuteException:Minute is not greater than 60");
            }
        }
        if(seconds>60||seconds<0){
            try{
                throw new SecException();
            }
            catch (SecException e){
                System.out.println("Exception occurred: InvalidSecondException:Second is not greater than 60");
            }
        }

        else{
            System.out.println("Correct time is ->"+hours+":"+minutes+":"+seconds);
        }
    }
}
public class cl31 {
    public static void main(String[] args) {
    Time t=new Time();
    t.InputUser();
    }
}
