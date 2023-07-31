public class whileBreak {
    public static void main(String[] args) {
        int i=1;
        while(true){
            if(i>5){// it works as condition this while loop will run till the i become 5 after tha increament break will be applied;
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
