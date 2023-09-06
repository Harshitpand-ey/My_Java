public class StringManipulation {
    public static void main(String[] args) {
        String birthDate="25/08/2004";
        int startingIndex=birthDate.indexOf("2004");
        System.out.println("Starting index is= "+startingIndex);//it will tell the index position of that string part;
        System.out.println("Birth year = "+birthDate.substring(startingIndex));//it will print the value of that substring which is present at index 6;
        System.out.println("Month="+birthDate.substring(3,5));//it will print the part of string that is present between 3 and 5 but include the element present at 3 but exclude the element present at 5;
        String newDate=String.join(",","25","11","2004");//this method is used for the type of delimiter or separator we want to use in our String;
        System.out.println("newDate="+newDate);
        newDate="25";//we are concating the String from line 10 to 14 it is alternate method for join but join is better than concat;
        newDate=newDate.concat(".");
        newDate=newDate.concat("08");
        newDate=newDate.concat(".");
        newDate=newDate.concat("2004");
        System.out.println("new Date="+newDate);
        //Two alternate method two concat the string on line 17 & 19;
        newDate="25"+"|"+"08"+"|"+"2004";
        System.out.println("Another way to concat the string="+newDate);
        newDate="25".concat("-").concat("08").concat("-").concat("2004");
        System.out.println("Newdate with some more form="+newDate);
        System.out.println("After replacing the character - to < :"+newDate.replace('-','<'));//this method is used to replace the specific character or string part of the String;
        System.out.println("After replacement of 2 by 21="+newDate.replace("2","21"));//it will replace 2 from the string by 21;
        System.out.println("replace the first < from our date String: "+newDate.replaceFirst("-","{"));//It will only replace the first - else will remain there;
        System.out.println("After replacing the - after > :"+newDate.replaceAll("-","---"));//It will replace all - to ---;//Preferred to use replace method instead of replaceAll method;
        System.out.println("ABC\n".repeat(4));//it will repeat four times;
        System.out.println("-".repeat(45));//- will be printed or repeated 4 times;
        System.out.println("ABC\n".repeat(4).indent(4));//indent provide 4 digit space;n specifies no. of shifts
        System.out.println("-".repeat(45));
        System.out.println("ABC\n".repeat(4).indent(-4));//negative is used to remove the spaces from the string by using indent method with -ve n value;

    }
}
