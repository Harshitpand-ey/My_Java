public class Player {
    public String name;
    public int health;
    public String weapon;
    public void loseHealth(int damage){
        health=health-damage;
        if(health<=0){
            System.out.println("player is knocked out");
        }
    }
    public void extraHealth(int extraHealth){
        health=health+extraHealth;
        if(health>=100){
            System.out.println("player is retored to 100%");
            health=100;
        }
    }
    public int healthRemaining(){
        return health;
    }
}
