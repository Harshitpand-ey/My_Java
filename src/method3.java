public class method3 {

    public static void main(String[] args) {





        int highScore=calculateScore(true, 800, 5, 100);
        System.out.println(highScore);


        System.out.println( calculateScore(true,10000,8,200));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            //System.out.println("the score is "+finalScore);

        }
        return finalScore;//As we used int in place of void so return is required and we write with return what we take as output from that method;
    }
}


