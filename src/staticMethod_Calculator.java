 class Calculator {
    //creting a class for calculator then make a method below for the sum of integers
    public static void printSum(int a,int b){
        System.out.println("sum= "+(a+b));
    }

}
public class staticMethod_Calculator {
    public static void main(String[] args) {

    Calculator.printSum(5,10);//Here I call the static method using ClassName.methodName()  which is here Calculator.printSum();
    printHello("hello");//Here I call the method print hello which is below which inside the class staticMethod_Calculator;It can be also written as staticMethod_Calculator.printHello();

    }
    public static void printHello(String a){

        System.out.println(a);
    }
}
