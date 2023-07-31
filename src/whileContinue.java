public class whileContinue {

        public static void main(String[] args){
            int i=0;
            while(i<50){
                i+=5;
                if(i%25==0){// it helps to skip all the numbers in the range of 0 to 50 which are divisible by 25.
                    continue;//it is a great method to skip the numbers.
                }
                System.out.print(i+"_");
            }

        }
    }


