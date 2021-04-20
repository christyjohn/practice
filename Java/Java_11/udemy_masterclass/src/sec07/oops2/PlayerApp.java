package sec07.oops2;

public class PlayerApp {
    public static void main(String[] args) {
        Player player = new Player();
        player.fullName = "Christy JOhn";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health =  " + player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health =  " + player.healthRemaining());

        System.out.println("-------------------------------------------------");

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Christy JOhn", 200, "Sword");
        System.out.println("Initial health is " + enhancedPlayer.getHealth());
    }

}
