//When Exception occurs catch block executed else try block executed;
public class ExceptionHandling2 {
    public static void main(String[] args) {
        int i=2;
        int j=0;
        int arr[]=new int[5];
        try {
            j = 18 / i;//It will throw exception or error because denominator cannot be zero
            // System.out.println(j);
            System.out.println(arr[5]);//It is the out of bound exception because it's index position starts from 0 to 4
        }
        catch (ArithmeticException e){
            System.out.println("Something is wrong in expression "+e);//e will print the type of exception
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is between 0 to 4 so no index 5 is available "+e);

        }
        catch (Exception e){//Basically it is the parent Block to catch all the exceptions it is the safer side to catch all exception which we won't know that can be arises too.
            //Exception is a class which holds all type of exceptions in it and 'e' is a object
            System.out.println("Something Went wrong");
        }
        System.out.println(j);//Zero will print if there is exception because we initialise the j with 0 so if there is error previous value is  printed;
        System.out.println("Bye");//If we won't use try and catch method Bye will also be not printed code stops executing;

    }
}
