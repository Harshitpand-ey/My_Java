public class twelve {
    public static void main(String[] args) {
        if(args.length>0){
            try{
                int firstNum=Integer.parseInt(args[0]);
                int secNum=Integer.parseInt(args[1]);
                int thirdnum=Integer.parseInt(args[2]);
                int largest = thirdnum > (firstNum > secNum ? firstNum : secNum) ? thirdnum : ((firstNum > secNum) ? firstNum : secNum);
                System.out.println(largest);

            }
            catch (NumberFormatException nfe){
                System.out.println("argument/s must be integer value");
            }
        }
    }
}
