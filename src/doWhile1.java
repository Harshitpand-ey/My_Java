public class doWhile1 {
    public static void main(String[] args) {
        int i=1;
        boolean state=true;
        do{
            System.out.println(i);
            i++;
            if(i>10){
                break;

            }
            state=(i>=0);

        }while(state);
    }
}
