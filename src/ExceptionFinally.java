public class ExceptionFinally {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        try{
            j=18/i;
        }
        catch (ArithmeticException e){
            System.out.println("Numbers cannot be divided by 0");
        }
        //We can write finally block just after the try block if we won't want to write catch block but it is recommendable to write catch block
        finally {//This block is always executed irrespective  of exception occurs or not
            System.out.println("bye");
        }
    }
}
