package Lab;

public class cl29 {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        try{
             j=18/i;
        }
        catch(ArithmeticException e){
            System.out.println("Numbers cannot be divided by 0 "+e);
        }
        finally {
            System.out.println("bye");
        }
        System.out.println(j);
    }
}
