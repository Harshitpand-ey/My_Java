public class multiLineString {
    public static void main(String[] args) {
        String multiLine= """
                Multiple line of String
                \u2022 Through triple quote;
                     \u2022 we can concanate it without +
                """;//The amount of space we give it will be same in output also and if we write in new line without using \n it will print in new line.
        System.out.println(multiLine);
    }
}
