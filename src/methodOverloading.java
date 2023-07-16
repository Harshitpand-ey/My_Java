public class methodOverloading {
    public static void main(String[] args) {
        calculateScore("hii", 500);//it's only return the value inside of method not the return value which is score*1000;
        int call = calculateScore("Tim", 500);
        System.out.println("new score is " + call);// it will return the return value which is score*1000;
        calculateScore(45);//we called 2nd method which only one parameter int with the same method name;
        System.out.println(calculateScore(75));
        calculateScore();//gives output that method with no argument which is basically our 3rd overloaded method;
        System.out.println(calculateScore());//it returns the value of 3rd overloaded method which is 1;
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("player's name " + playerName + " score is " + score);
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("unnamed player name " + score + " scored ");
        return score * 1000;
    }

    public static int calculateScore() {//method without any argument
        System.out.println("Method with no parameters or argument");
        return 1;
    }
    //Below method is not correct because by chnaging tha datatype of declaration of method the method doesn't change if the parameter or method name do not change;
    /*
    public static void calculateScore() {//method without any argument
        System.out.println("Method with no parameters or argument");

    }*/
}
