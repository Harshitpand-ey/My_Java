//When Exception occurs catch block executed else try block executed;
class HarshitException extends Exception{
    public HarshitException(String str){
        super(str);//calling the constructor of super class which is Exception class here//It helps to print the string which we write in the constructor in line 18 throw object;

    }
}
//When Exception occurs catch block executed else try block executed;
public class ExceptionCustom {
    public static void main(String[] args) {
        int i=20;
        int j=0;

        try {
            j = 18 / i;//It will throw exception or error because denominator cannot be zero
            if(j==0){
                //here we create object of the exception(Arithmetic exception);
                throw new HarshitException("I don't want value of j as 0");//It is my own kind of exception for which we 1st create an class that extends class Exception then we create it constructor then call it here
                //If we want to print any message for that throw exception we pass it into the cnstructor;
                //If the value of j is 0 means denominator is greater than numerator give the default value which is catch block through the 'throw'
            }
        }
        catch (HarshitException e){//My own kind of exception or customised exception;
            j=18/1;//Default value if exception or error happens in try block;
            System.out.println("It is the default value "+e);
        }

        catch (Exception e){//Basically it is the parent Block to catch all the exceptions it is the safer side to catch all exception which we wont know that can be arises too.
            System.out.println("Something Went wrong");
        }
        System.out.println(j);//Zero will print if there is exception because we initialise the j with 0 so if there is error previous value is  printed;
        System.out.println("Bye");//If we won't use try and catch method Bye will also be not printed code stops executing;

    }
}
