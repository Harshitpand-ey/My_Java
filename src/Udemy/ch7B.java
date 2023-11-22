package Udemy;

public class ch7B {
    public static void main(String[] args) {
        printWeekDay(1);

    }
    public static void printWeekDay(int day) {
        String dayOfWeek="Invalid Day";
        if (day == 0) {
            dayOfWeek= "Sunday";
        }
        else if (day == 1) {
            dayOfWeek= "Monday";
        }
        else if (day == 2) {
            dayOfWeek= "Tuesday";
        }
        else if (day == 3) {
            dayOfWeek= "Wednesday";
        }
        else if (day == 4) {
            dayOfWeek= "Thursday";
        }
        else if (day == 5) {
            dayOfWeek= "Friday";
        }
        else if (day == 6) {
            dayOfWeek= "Saturday";
        }
        System.out.println(day+" of the week is "+dayOfWeek);

    }
}
