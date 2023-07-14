public class ch1 {
    public static void main(String[] args) {
        double a = 20, b = 80;
        double sum = (a + b) * 100;
        double remainder = sum % 40;
        boolean itTrue = remainder == 0;// boolean itTrue=(remainder==0)?true:false using ternary operator
        System.out.println(itTrue);
        if (remainder != 0) {// the another way to write the condition by using not operator like if(!itTrue)
            System.out.println("we got remainder is:" + remainder);

        }


    }
}
