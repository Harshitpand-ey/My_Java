//When Exception occurs catch block executed else try block executed;
public class ExceptionHandling1 {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        try {
             j = 18 / i;//It will throw exception or error because denominator cannot be zero
           // System.out.println(j);
        }
        catch (Exception e){//Exception is a class which holds all type of exceptions in it and 'e' is a object
            System.out.println("Something went wrong "+e);//e will print the type of exception
        }
        System.out.println(j);//Zero will print if there is exception because we initialise the j with 0 so if there is error previous value is  printed;
        System.out.println("Bye");//If we won't use try and catch method Bye will also be not printed code stops executing;

    }
}
