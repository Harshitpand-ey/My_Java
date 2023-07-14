public class method1 {

        public static void main(String[] args) {
            boolean gameOver=true;
            int score=10000;
            int levelCompleted=8;
            int bonus=200;
            int finalScore=score;
            calculateScore(true,10000,levelCompleted,bonus);//here we use main method in which written from line21 so the whole logic is there it is used in the process when same logic is applied in more cases;
             score=800;
            levelCompleted=5;
            bonus=100;
            finalScore=score;
            if (gameOver){
                finalScore+=(levelCompleted*bonus);
               finalScore+=1000;
                System.out.println("final score is "+finalScore);
            }


        }
        public static void calculateScore(boolean gameOver,int score,int levelCompleted,int bonus){
//            boolean gameOver=true;
//            int score=10000;
//            int levelCompleted=8;
//            int bonus=200;
            int finalScore=score;
            if (gameOver){
                finalScore+=(levelCompleted*bonus);


                System.out.println("final score is "+finalScore);
            }
        }

        }



