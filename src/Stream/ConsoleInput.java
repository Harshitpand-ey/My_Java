package Stream;

import java.io.Console;

public class ConsoleInput {
    public static void main(String[] args) {
        char ch[];
        Console cs=System.console();
        String s= cs.readLine("Enter your name");
         ch=cs.readPassword("Enter the password");//Will come in ch name array
        System.out.println(s);
        System.out.println(ch);
    }
}
