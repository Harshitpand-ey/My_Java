public class continueBreakWhile {
    public static void main(String[] args) {
        int i=0;
        while(i<20){
            i++;
            if(i<=5){
                System.out.println("the numbers skipped "+i);
                continue;//it will skip all the elements which are less than or equal to 5;
            }
            System.out.println("print the number "+i);
            if(i>=10){
                break;//it will stop the loop from the number greater than or equal to 10;`
            }
        }
    }
}
