import java.util.Scanner;

public class ch13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean notChar=false;
        double min= Double.MAX_VALUE;
        
        double max= Double.MIN_VALUE;

      do{
         System.out.println("enter numbers and this loop will end when user enters the characters:");
          String number= sc.nextLine();
          try{
              double num = Double.parseDouble(number);

              if(num>max){
                  max=num;
              } else if (num<min) {
                  min=num;
                  
              }


          }
          catch (NumberFormatException e) {
            break;
          }

      }while(!notChar);
        System.out.println("maximum is "+max);
        System.out.println("minimum is "+min);
    }
}
