public class StringMethod {
    public static void main(String[] args) {
        StringPrint("Hello World");
        StringPrint("");
        StringPrint("\t \n");//it is a blank string;
        String HelloWorld="Hello World";
        System.out.printf("index of r in Hello World is =%d\n",HelloWorld.indexOf('r'));//This line will print the index position of 'r' in Hello World;
        System.out.printf("index of World in hello world =%d\n",HelloWorld.indexOf("World"));//index position of world in hello world;
        System.out.printf("index of  first l in hello world =%d\n",HelloWorld.indexOf('l'));
        System.out.printf("index of last l in hello World =%d",HelloWorld.lastIndexOf('l'));
        System.out.printf("\nindex of l=%d ",HelloWorld.indexOf('l',3));//start searching l from starting to ending from index position 3;
        System.out.printf("\n index of l=%d\n",HelloWorld.lastIndexOf('l',8));//start searching l from last to first from index position 8;
       String helloWorldlower=HelloWorld.toLowerCase();
       if(HelloWorld.equals(helloWorldlower)){//comparing to the helloWorldLower string;
           System.out.println("values match exactly\n");
       }
       if(HelloWorld.equalsIgnoreCase(helloWorldlower));{
            System.out.println("values match ignoring cases\n");
        }
        if(HelloWorld.startsWith("Hello"));{
            System.out.println("String starts with word Hello\n");
        }
        if(HelloWorld.endsWith("World"));{
            System.out.println("String ends with the word World\n");
        }
        if(HelloWorld.contains("World"));{
            System.out.println("String contains the word World\n");
        }
        if(HelloWorld.contentEquals("Hello World"));{//compare the string it basically comparing the object only;
            System.out.println("Values match exactly\n");
        }
    }

    public static void StringPrint(String string) {
        int length = string.length();//this method helps in printing the length of the string;
        System.out.printf("length of the string is %d\n", length);
        if (string.isEmpty()){//helps in finding is the string is empty or not;
            System.out.println("string is empty");
            return;
        }
        if(string.isBlank()){
            System.out.println("string is blank");//so no first and last element so it will not print anything;
        }


            System.out.printf("character at index 0 is %c\n", string.charAt(0));//it helps in printing the character at index position 0;
            System.out.printf("last character of the string is %c\n", string.charAt(length - 1));//(length-1) is the last index of the String so it will print the character whic is present on the last position of string;
        }
    }
