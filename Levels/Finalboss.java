package Levels;
import java.util.Scanner;

import Enemy.Enemy;
import Heroes.Hero;
import Story.Details;

public class Finalboss {
    static Scanner sc = new Scanner(System.in);

    public static void battleMechanicFinal(Hero hero) {
        Enemy boss = new Enemy(
            "Azelor, Rift Keeper", 150, 10
        );

        int turn = 0;
        int victory = 0;

        System.out.println(
            "\n----------------- FINAL BOSS: " + boss.getEnemyName() + " -----------------"
        );

        Details.displayCurrentDetails(hero, boss);

        while (victory == 0) {
            turn++;
            
            // Player turn
            hero.displaySkillOptions();
            System.out.print("Pick a skill (1-5): ");
            
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
            }
            int skillNum = sc.nextInt();

            switch (skillNum) {
                case 1:
                    hero.skillOne(boss);
                    break;
                case 2:
                    hero.skillTwo(boss);
                    break;
                case 3:
                    hero.skillThree(boss);
                    break;
                case 4:
                    hero.healHP();
                    break;
                case 5:
                    hero.healMana();
                    break;
                default:
                    System.out.println("Invalid skill choice. Please pick a valid option.");
                    break;
            }

            // Check if boss defeated
            if (boss.getEnemyHp() <= 0) {
                victory = 1;
                Details.displayCurrentDetails(hero, boss);
                System.out.println("\nCONGRATULATIONS! You have defeated " + boss.getEnemyName());
                break;
            }

            // Boss turn
            if (turn % 5 == 0) {
                // Rift Phase
                int riftDamage = boss.getEnemyDamage() + 10;
                hero.takeDamage(riftDamage);
                hero.setHeroMana(hero.getHeroMana() - 5);
                
                // Boss heals
                boss.heal(5);
                
                System.out.println();
                System.out.println(
                    boss.getEnemyName() + " unleashes RIFT BLAST! Deals " +
                    riftDamage + " damage and drains 5 MP."
                );
                System.out.println(
                    boss.getEnemyName() + " draws power from the rift and regenerates 5 HP!"
                );
            } else {
                boss.enemyAttack(hero);
            }

            Details.displayCurrentDetails(hero, boss);

            if (hero.getHeroHp() <= 0) {
                victory = -1;
                System.out.println();
                hero.defeatDialogue();
                System.out.println("---------You have been defeated!---------");
                System.out.println("----------------GAME OVER!---------------");
                break;
            }
        }

        if (victory == 1) {
            hero.victoryDialogue();
            System.out.println("\n==== YOU HAVE SAVED THE REALM! GAME COMPLETE! ====");
        }
    }
}