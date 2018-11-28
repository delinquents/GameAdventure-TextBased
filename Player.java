public class Player {


    int playerMaxHP = 100;
    int playerAD = 35;
    int playerPotionStack = 3;
    int playerPotionHealingAmount = 30;
    int dropScale = 100;


    public Player(int playerMaxHP, int playerAD, int playerPotionStack, int playerPotionHealingAmount, int dropScale) {
        this.playerMaxHP = playerMaxHP;
        this.playerAD = playerAD;
        this.playerPotionStack = playerPotionStack;
        this.playerPotionHealingAmount = playerPotionHealingAmount;
        this.dropScale = dropScale;
    }
}
