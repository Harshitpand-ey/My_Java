public class formattedString {
    public static void main(String[] args) {
        int age=24;
        String formattedString=String.format("age is %d%n",age);//it formats the int into String without argument;
        System.out.println(formattedString);
        //We can also format the String as I write in line 7;
        formattedString="age is %d".formatted(age);
        System.out.println(formattedString);
    }
}
