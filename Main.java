import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        boolean running = true;
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        Player player1 = new Player(100,35,3,30,75);

         int playerMaxHP = player1.playerMaxHP;
         int playerAD = player1.playerAD;
         int playerPotionStack = player1.playerPotionStack;
         int playerPotionHealingAmount = player1.playerPotionHealingAmount;
         int dropScale = player1.playerPotionStack;



         List<Enemy> enemies = new ArrayList<>();
         Enemy enemy1 = new Enemy("Night Elf",35,65);
         Enemy enemy2 = new Enemy("Orc",45,75);
         Enemy enemy3 = new Enemy("Zed",50,60);
         Enemy enemy4 = new Enemy("Katarin",65,50);

         enemies.add(enemy1);
         enemies.add(enemy2);
         enemies.add(enemy3);
         enemies.add(enemy4);


        System.out.println("\tWelcome to Dungeon! \n");

        NEWGAME:
        while(running){

            Enemy foundEnemy = enemies.get(rand.nextInt(enemies.size()));

            int enemyHP = foundEnemy.getEnemyHP();
            int enemyAD = foundEnemy.getEnemyAD();


            System.out.println("-------------------------------------------------------------");
            System.out.println("\t #Enemy " + foundEnemy.getName() +" has apperead!\n");
            System.out.println("Your HP: "+ playerMaxHP + "     Enemy "+ foundEnemy.getName()+" HP: " + enemyHP );
            System.out.println("Your health potion stack left: " + playerPotionStack+ ".");
            System.out.println("--------------------------------------------------------------");


            while(foundEnemy.getEnemyHP() > 0 ){


                System.out.println("\n\t What would u like to do now?\n\t");
                System.out.println("1. Attack");
                System.out.println("2. Drink potion.");
                System.out.println("3. Run!");

                int number =scan.nextInt();
                scan.nextLine();

               switch (number) {
                   case 1:

                       int damageDealt = rand.nextInt(playerAD);
                       int damageTaken = rand.nextInt(enemyAD);

                       playerMaxHP -= damageTaken;
                       enemyHP -= damageDealt;

                       System.out.println("\t #Your striked " + foundEnemy.getName() + " for " + damageDealt + " dmg.\n");
                       System.out.println("\t Your HP: " + playerMaxHP);
                       System.out.println("\t Enemy HP: " + enemyHP + ", but u got "+damageTaken +" dmg in return. ");


                       if (playerMaxHP < 1) {
                           System.out.println("You have takend to much dmg to go on.");
                           System.out.println("Sorry u lost game.");
                           break NEWGAME;
                       } else if (enemyHP < 1) {
                           System.out.println("\n\n" + foundEnemy.getName() + " has been defeted!!!");
                           int randomDropChance = rand.nextInt(dropScale);
                           if (randomDropChance > 50) {
                               playerPotionStack++;
                               System.out.println("\n\t###You got one extra health potion!!! ### \n");
                           }
                           continue NEWGAME;
                       }
                       break ;
                     case 2:
                           if(playerPotionStack > 0){
                                playerMaxHP += playerPotionHealingAmount;
                                playerPotionStack--;
                               System.out.println("\t Your have drinked health potion for +30hp amount \n"+ "\n\tYour HP now is: "+ playerMaxHP );
                           }else{
                               System.out.println("\nYou dont have any health potions left");
                           }
                           break;
                      case 3:
                           System.out.println("You have skiped an enemy!!!");
                           continue NEWGAME;
                           default:
                               break;
               }
            }
        }
    }
}
