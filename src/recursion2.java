public class recursion2 {
public static void printNumber(int n){
    if(n==0){//Base case
        return;
        }
    System.out.println(n);//Printing the recursive elements
    printNumber(n-1);//recursion
        }

    public static void main(String[] args) {
int n=5;
printNumber(n);
    }
}
