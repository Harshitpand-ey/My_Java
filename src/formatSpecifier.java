public class formatSpecifier {
    public static void main(String[] args) {
        int age=32;
        System.out.printf("num is %d",age);//as we see here we haven't used println we used printf and a format specifier for int %d ;
        int YearOfBirth=2023-age;
        System.out.printf("%nAge is %d and YearOfBirth is %d",age,YearOfBirth);//we can use %n in place of \n both are same;
        System.out.printf("age is %f",(float)age);//here I type cast the age from int to float because the format specifier here is %f which is for decimal or float value;
        System.out.printf("age is %.2f",(float)age);//.2 is used before f because it will help in printing only two values after decimal;
        for(int i=1;i<1000000;i*=10){
            System.out.printf("%6d\n",i);//6d creates 6 spaces for int;
        }

    }
}
