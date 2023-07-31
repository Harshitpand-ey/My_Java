import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {

        int CurrentYear=2023;
       // System.out.println(takingInputFromConsole(CurrentYear));
        System.out.println(takingInputFromScanner(CurrentYear));

    }
    //Taking input from console and it will only run in java terminal from line 10-16;
//    public static String takingInputFromConsole(int currentYear){
//        String name=System.console().readLine("hi What's your name? ");
//        System.out.println("thanks "+name+" for studying java");
//        String DateOfBirth=System.console().readLine("What year you were born? ");
//        int age=currentYear-Integer.parseInt(DateOfBirth);
//        return"current age is "+age+" years old";
//    }
    //From line 20-31 will run in IDE here we use Scanner to take input;
    public static String takingInputFromScanner(int currentyear){
        Scanner scanner=new Scanner(System.in);
        System.out.println("what's your name");
        String name=scanner.nextLine();

        System.out.println("thanks "+name+" for studying java");
        System.out.println("your year of birth is? ");
        boolean validDOB=false;
        int age=0;
        do {
            System.out.println("enter year of birth>="+(currentyear-125)+" & <="+currentyear);
           // String DateOfBirth = scanner.nextLine();
             //age = currentyear - Integer.parseInt(DateOfBirth);
          try {
              age = checkData(currentyear, scanner.nextLine());
              validDOB = age < 0 ? false : true;
          }
          catch (NumberFormatException e){
              System.out.println("Characters are not allowed");
          }
        }while(!validDOB);
        return"current age is "+age+" years old";

    }
    public static int checkData(int currentYear,String dateOfBirth){
        int dob=Integer.parseInt(dateOfBirth);
        int minimumYear=currentYear-125;
        if(dob<minimumYear||dob>currentYear){
            return -1;
        }
        return (currentYear-dob);


    }

}
