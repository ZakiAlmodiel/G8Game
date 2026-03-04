package Levels;
import java.util.Scanner;

import Enemy.Enemy;
import Heroes.Hero;
import Story.Details;
public class Level1{
    
    static Scanner sc = new Scanner(System.in);
    
    public static void battleMechanic1(Hero hero){

    int victory = 0;
    
        for (int difficulty = 1; difficulty <= 3; difficulty++) {
            String[] monsterNames = {"Tremor", "Hurricane", "Blaze"};

            Enemy enemy = new Enemy(
                monsterNames[difficulty-1], 25 + (difficulty * 5), 6 + difficulty
            );

            victory = 0;
            Details.displayCurrentDetails(hero, enemy); // Fixed: Added Main.
            
                do{
                hero.displaySkillOptions();
            System.out.print("Pick a skill (1-5): ");
            // validate input to avoid InputMismatchException
            while (!sc.hasNextInt()) {
                System.out.println(
                    "Invalid input. Please enter a number."
                );
                sc.next();
            }
            int skillNum = sc.nextInt();
            switch(skillNum){
        case 1:
            if (hero.heroMana >= hero.skillOneManaCost) {
                System.out.println();
                hero.skillOne(enemy);
            } else {
                System.out.println();
                System.out.println(
                    "Not enough mana for Skill 1! Replenish mana"
                );
            }
            break;
    
        case 2:
            if (hero.heroMana >= hero.skillTwoManaCost) {
                System.out.println();
                hero.skillTwo(enemy);
            } else {
                System.out.println();
                System.out.println(
                    "Not enough mana for Skill 2! Replenish mana"
                );
            }
            break;
    
        case 3:
            if (hero.heroMana >= hero.skillThreeManaCost) {
                System.out.println();
                hero.skillThree(enemy);
            } else {
                System.out.println();
                System.out.println(
                    "Not enough mana for Skill 3! Replenish mana"
                );
            }
            break;
    
        case 4:
            hero.healHP();
            break;
    
        case 5:
            hero.healMana();
            break;
        default:
            System.out.println(
                "Invalid skill choice. Please pick a valid option."
            );
            break;
    }
            
            enemy.enemyAttack(hero);
            
            
        if(enemy.enemyHp <= 0){
            enemy.enemyHp = 0;
            victory=1;
            Details.displayCurrentDetails(hero, enemy); // Fixed: Added Main.

                hero.victoryDialogue();
                enemy.enemyDefeatedDialogue();
                System.out.println(
                    "\nCONGRATULATIONS! You have defeated the monster "+enemy.enemyName
                );
        }
            else {
            Details.displayCurrentDetails(hero, enemy); // Fixed: Added Main.
        }
        
            if (hero.heroHp<= 0){
                victory = -1;
                System.out.println();
                hero.defeatDialogue();
                System.out.println(
                    "---------You have been defeated!---------"
                );
                break;
        }
        
        }while(victory == 0);

        if(victory == -1){
                System.out.println(
                    "----------------GAME OVER!---------------"
                );
                break;
        }
        
        }
        // After all encounters, if hero is still alive, print finished message
        if (hero.heroHp > 0) {
            System.out.println(
                "\n----CONGRATULATIONS! YOU HAVE FINISHED LEVEL 1----"
            );
        }
    }
}
