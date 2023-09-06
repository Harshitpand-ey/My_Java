public class String_Builder {
    public static void main(String[] args) {
        String helloWorld="Hello"+" "+"World";
        StringBuilder helloWorldBuilder=new StringBuilder("Hello "+"World");
       // helloWorld.indent(4);
        helloWorldBuilder.append(" and Goodbye");//append will concat the goodbye to Hello World
        printString(helloWorld);
        stringBuilder(helloWorldBuilder);
         StringBuilder emptyStart=new StringBuilder();
         emptyStart.append("a".repeat(17));//its capacity value will become 34;
         StringBuilder emptyStart32=new StringBuilder(32);
         emptyStart32.append("a".repeat(17));//its capacity value will be not changed it will remain 32 koi frk nhi padega;
         stringBuilder(emptyStart);
         stringBuilder(emptyStart32);
        StringBuilder builderPlus=new StringBuilder("Hello "+"World");

        builderPlus.append(" and Goodbye");
        builderPlus.deleteCharAt(16).insert(16,'g');//capital G changed into small g;we can also do this by replace method
        System.out.println(builderPlus);
        builderPlus.replace(16,17,"G");//it will include the char at 16th position and exclude the char at 17 position and replace the character of 16th position from g to G;
          builderPlus.reverse().setLength(7);// string ke akhri ke 7 element rahnge and unko reverse kr dega;
        System.out.println(builderPlus);

    }
    public static void printString(String string){
        System.out.println("String "+string);
        System.out.println("String length "+string.length());
    }
    public static void stringBuilder(StringBuilder builder){
        System.out.println("String "+builder);
        System.out.println("String length "+builder.length());
        System.out.println("capacity="+builder.capacity());
    }
}
