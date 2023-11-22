package Udemy;

public class ch7 {
    public static void main(String[] args) {
        printDayOfWeek(6);
    }
    public static void printDayOfWeek(int day){

        String dayOfWeek= switch (day){
            case 0-> "Sunday";
            case 1-> "Monday";
            case 2-> "Tuesday";
            case 3-> "Wednesday";
            case 4-> "Thursday";
            case 5-> "Friday";
            case 6-> "Saturday";
            default->
               " is not valid day";


        };
       System.out.println(day+"th day  of week is  "+dayOfWeek);
    }
}
