package Lab;

public class cl32 {
        public static void main(String[] args) {

            int arr[]=new int[4];
            try {
                arr[0]=1;
                arr[1]=2;
                arr[2]=3;
                arr[3]=4;
                arr[4]=5;
            }
            catch (ArithmeticException e){
                System.out.println("Something is wrong in expression "+e);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index is between 0 to 4 so no index 5 is available "+e);

            }
            catch (Exception e){
                System.out.println("Something Went wrong");
            }

            System.out.println("Bye");//If we won't use try and catch method Bye will also be not printed code stops executing;

        }
    }


