public class Encapsulation {
    public static void main(String[] args) {
//       Player player=new Player();
//       player.name="Harshit";
//       player.health=20;
//       player.weapon="Sword";
//       int damage=10;
//       player.loseHealth(damage);
//        System.out.println("Remaining health"+player.healthRemaining());
//        player.health=200;//problem is health cannot be more than 100 but here we set the value of health to 200;
//        player.loseHealth(11);
//        System.out.println("player health remaining"+player.healthRemaining());
EnhancedPlayer player=new EnhancedPlayer("Harshit",200,"Sword");
        System.out.println("remaining health is "+player.healthRemaining());//Still we pass the health as 200 but it is 100 because we set the parameter of health between 0 to 100 in constructor;

    }
}
