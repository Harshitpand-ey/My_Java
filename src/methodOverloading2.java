public class methodOverloading2 {
    public static void main(String[] args) {
        System.out.println("new score is "+calculateScore("tim",100));
        System.out.println("new score is "+calculateScore(10));

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("player's name " + playerName + " score is " + score);
        return score * 1000;
    }

    public static int calculateScore(int score) {
        calculateScore("Anonymous",1000);//so it(1000) is print with method print value but in return the value which we give in main method which is 10 got multiplied by the return value which is 1000 and gives value 10*1000=10000;
        return score * 1000;
    }

    /*public static int calculateScore() {//method without any argument
        System.out.println("Method with no parameters or argument");
        return 1;
    }
    //Below method is not correct because by chnaging tha datatype of declaration of method the method doesn't change if the parameter or method name do not change;
    /*
    public static void calculateScore() {//method without any argument
        System.out.println("Method with no parameters or argument");

    }*/
}


