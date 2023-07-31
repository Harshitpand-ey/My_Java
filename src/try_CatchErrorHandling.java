public class try_CatchErrorHandling {
    public static void main(String[] args) {

        int CurrentYear=2023;
        try {
            System.out.println(takingInputFromConsole(CurrentYear));//it will throw error as we know console not works in IDE so we use scanner which will be in catch;
        }
        catch (NullPointerException e) {
            System.out.println(takingInputFromScanner(CurrentYear));//it will come as output because as we all know scanner is valid in IDE currently our code will not give any output because it Scanner method doesn't return anything now;
        }
    }
    //Taking input from console and it will only run in java from line 10-16;
    public static String takingInputFromConsole(int currentYear){
        String name=System.console().readLine("hi What's your name? ");
        System.out.println("thanks "+name+" for studying java");
        String DateOfBirth=System.console().readLine("What year you were born? ");
        int age=currentYear-Integer.parseInt(DateOfBirth);
        return"current age is "+age+" years old";
    }
    public static String takingInputFromScanner(int currentyear){
        return "";
    }
}


