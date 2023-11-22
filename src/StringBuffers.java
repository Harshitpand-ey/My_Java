public class StringBuffers {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("Harshit ");
        str.append("Pandey");//Add the string into the previous one by append
        System.out.println(str);
        System.out.println(str.capacity());//It prints the capacity of string by default it is 16
        System.out.println(str.length());//It prints the length of string
        System.out.println(str.insert(4,"Jasu"));//It used to insert the string between a string
        System.out.println(str.reverse());//Used to reverse a string
        System.out.println(str.deleteCharAt(12));//Used to delete character from specific index
        System.out.println(str.replace(12,14,"ki"));//used to replace a specific string by new string by emtering the starting and last index and that string whic we have to insert;
        System.out.println(str.substring(3,5));//It helps in to print that part of the string by entering the initial and final position from where we want to print;
        System.out.println(str.delete(1,7));//Used to delete a string from one position to another;
        System.out.println(str.charAt(7));//used to print the character present at that index;
        char[]target=new char[50];
        str.getChars(3,5,target,0);//used to print the the part of string by making array of characters(string)
        System.out.println(target);

    }
}
