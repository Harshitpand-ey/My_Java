public class
diagonalStar {
    public static void main(String[] args) {

        System.out.print(printSquareStar(7));
    }
    public static boolean printSquareStar(int number){
        if(number<5){
            System.out.println("Invalid Value");
        }
        else {
            for(int i=1;i<=number;i++){
                for(int j=1;j<=number;j++){

                    if ((i==1 ||i==number) || (j==1 || j==number)  || ((i==j/*it is for those stars which are in center of pattern*/)) || (j==number-i+1/*it is used for the star after the mid or center of the i part*/) ){
                        System.out.printf("*");
                    }
                    else {
                        System.out.printf(" ");
                    }


                }
                System.out.println();
            }
        }

        return false;
    }
}
