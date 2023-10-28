public class recursion3 {
    public static void printNumber(int n){
        if(n==6){//Base case
            return;
        }
        System.out.println(n);//Printing the recursive elements
        printNumber(n+1);//recursion
    }

    public static void main(String[] args) {
        int n=1;
        printNumber(n);
    }
}
