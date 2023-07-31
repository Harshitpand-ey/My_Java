import java.util.Scanner;
public class ch12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 5 digits");
        boolean validInt = false;
        int i = 0;
            double sum = 0;


        while (i < 5) {
            System.out.println("Enter number #" + i + ":");
            String nextNumber = scanner.nextLine();
            try {
                double number = Double.parseDouble(nextNumber);
                i++;
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }

        }
        System.out.println("sum of entered data is "+sum);
    }
}

//    public static int checkNumber(int number){
//        if(number>=0||number<0){
//            return number;
//        }
//        else{
//            return -1;
//        }
//    }
//
//}
