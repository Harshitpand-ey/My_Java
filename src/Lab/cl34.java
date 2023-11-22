package Lab;

import java.util.Scanner;

public class cl34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        String strLower = str.toLowerCase();
        System.out.println(strLower);
        //    String strReverse=str.reverse();
        // System.out.println(strReverse);
        String str2 = sc.next();
        if (str.equals(str2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        String Liku = "Hello World";
        String jio = str + Liku;
        System.out.println("Insert the string " + jio);
       String upperCaseStr=str.toUpperCase();
        System.out.println(upperCaseStr);
        String lowerCaseStr=str.toLowerCase();
        System.out.println(lowerCaseStr);
         if(str.contains("H")){
             System.out.println("Present");
         }
         else{
             System.out.println("Not present");
         }
        System.out.println(str.indexOf("H"));
        int vCount = 0, cCount = 0;
        str=str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {

                vCount++;
            }

            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {

                cCount++;
            }
        }
        System.out.println(vCount+" vowels && "+cCount+" consonant");
        String str12= "Geeks", nstr="";
        char ch;
        for (int i=0; i<str.length(); i++)
        {
         //   ch= str12.charAt(i); //extracts each character
          //  nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
        if(str12==nstr){
            System.out.println("palindrom");
        }
        else{
            System.out.println("Not palindrom");
        }
    }
    }
