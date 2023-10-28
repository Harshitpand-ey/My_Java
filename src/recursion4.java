public class recursion4 {
    public static void printSum(int i,int n,int sum){
        if(i==n){//Base case;
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1,5,sum);//Recursion
    }

    public static void main(String[] args) {
        int n=5;
        printSum(1,5,0);
    }
}
