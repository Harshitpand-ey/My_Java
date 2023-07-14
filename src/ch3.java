public class ch3 {

    public static void main(String[] args) {
       int highScoreposition=calculateHighScorePosition(1500);
       displayHighScorePosition("Tim",highScoreposition);
         highScoreposition=calculateHighScorePosition(900);
        displayHighScorePosition("Tim",highScoreposition);
         highScoreposition=calculateHighScorePosition(400);
        displayHighScorePosition("Tim",highScoreposition);
         highScoreposition=calculateHighScorePosition(90);
        displayHighScorePosition("Tim",highScoreposition);
    }
    public static void displayHighScorePosition(String playerName,int highScorePosition){
        System.out.println("players name "+playerName+" got the position "+highScorePosition+"got");

    }
   public static int calculateHighScorePosition(int score){

       if(score>=1000){
            return 1;

        }
        else if(score>=500&&score<1000){
             return 2;

        }
        else if(score>=100&&score<500){
             return 3;

        }
        else{
            return 4;
        }


    }

}
