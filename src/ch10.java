/*task of this challange is to find number of even and odd numbers using method and then find only starting 5 even numbers then apply break and odd also*/
public class ch10 {
    public static void main(String[] args) {
        int i=5;
        int oddNumbersAre=0;
        int evenNumberare=0;
        while(i<=20){//No effect on using do while or while loop here.
            if(isEvenNumber(i)){
                System.out.println("even number:"+i);
            evenNumberare++;
            }
            if(!isEvenNumber(i)){
                ++oddNumbersAre;
            }


             if(evenNumberare>=5){//for numbers to even numbers between 5 to 20 till first initial 5 even number then apply break;
                 break;
             }
            /*it will work same as code written on line from 6 to 10;
            if(!isEvenNumber(i){
            continue;
            }
            System.out.println(i);
            evenNumberare++;*/
            i++;


        }
        System.out.println("number of even numbers between 5 to 20 are "+evenNumberare);
        System.out.println("numbers of odd numbers between 5 to 20 are "+oddNumbersAre);

    }
    public static boolean isEvenNumber(int number){
        if(number%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}
