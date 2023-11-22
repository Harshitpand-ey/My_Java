package Lab;

import java.util.Scanner;

class NegativeNumberException extends Exception{
    public NegativeNumberException(){
        super();
    }
    public String toString(){
        return "NegativeNumberException number should be positive";
    }
}

public class cl30 {
    public void ProcessInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        if(num<0){
            try{
                throw new NegativeNumberException();
            }
            catch (NegativeNumberException e){
                System.out.println(e);
            }
        }
        else{
            int j=2*num;
            System.out.println(j);
        }
    }
    public static void main(String[] args) {
       cl30 ab=new cl30();
       ab.ProcessInput();
    }

}
