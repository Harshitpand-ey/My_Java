public class EnhancedPlayer {
    private String FullName;
    private int healthPercentage;//We change here thee name of parameter but there is no change in the main file that file is unknown to what the changes happen in encapsulated file;
    private String weapon;

    public EnhancedPlayer(String FullName) {
        this(FullName,100,"Sword");

    }

    public EnhancedPlayer(String FullName, int health, String weapon) {
        this.FullName = FullName;
     if(health<=0){
         this.healthPercentage =1;
     }
     else if(health>100){
         this.healthPercentage =100;
     }
     else {
         this.healthPercentage =health;
     }
        this.weapon = weapon;
    }
    public void loseHealth(int damage){
        healthPercentage = healthPercentage -damage;
        if(healthPercentage <=0){
            System.out.println("player is knocked out");
        }
    }
    public void extraHealth(int extraHealth){
        healthPercentage = healthPercentage +extraHealth;
        if(healthPercentage >=100){
            System.out.println("player is retored to 100%");
            healthPercentage =100;
        }
    }
    public int healthRemaining(){
        return healthPercentage;
    }
}
