package Main;
import java.util.InputMismatchException;
import java.util.Scanner;

import Heroes.Hero;
import Heroes.Mist;
import Heroes.Raizn;
import Heroes.Sanya;
import Heroes.Selene;
import Heroes.Xena;
import Levels.Finalboss;
import Levels.Level1;
import Story.Details;
import Story.Story;

class InvalidChoiceException extends Exception {
    public InvalidChoiceException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        TerminalMusic.playMusic();
        Scanner sc = new Scanner(System.in);
       
        Story.beforeFight();

        int heroOption = 0;

        while (true) {
            try {
                System.out.println("Pick a Character: ");
                System.out.println("1 - Sanya Lopez ");
                System.out.println("2 - Raizen");
                System.out.println("3 - Mist");
                System.out.println("4 - Selene");
                System.out.println("5 - Xena");
                System.out.print("Enter number: ");

                heroOption = sc.nextInt();

                if (heroOption < 1 || heroOption > 5) {
                    throw new InvalidChoiceException("Hero does not exist.");
                }

                break;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number only.");
                sc.nextLine();
            } catch (InvalidChoiceException e) {
                System.out.println(e.getMessage());
            }
        }

        Hero hero = null;

        switch (heroOption) {
            case 1: hero = new Sanya("Sanya"); break;
            case 2: hero = new Raizn("Raizn"); break;
            case 3: hero = new Mist("Mist"); break;
            case 4: hero = new Selene("Selene"); break;
            case 5: hero = new Xena("Xena"); break;
        }

        if (hero == null) {
            System.out.println("Unexpected error: hero not created.");
            TerminalMusic.stopMusic();
            sc.close();
            return;
        }

        hero.preBattleDialogue();  
        Details.displayPickingDetails(hero);

        int backstoryOption = 0;

        do {
            try {
                System.out.println("\n1 - Read back story");
                System.out.println("2 - Proceed to battle");
                System.out.print("Enter number: ");
                backstoryOption = sc.nextInt();

                if (backstoryOption != 1 && backstoryOption != 2) {
                    throw new InvalidChoiceException("Invalid option. Please choose 1 or 2.");
                }

                if (backstoryOption == 1) {
                    hero.displayBackStory();
                    System.out.print("Proceed to battle? (Type 2): ");
                    backstoryOption = sc.nextInt();

                    if (backstoryOption != 2) {
                        throw new InvalidChoiceException("You must type 2 to proceed.");
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Numbers only.");
                sc.nextLine();
                continue;
            } catch (InvalidChoiceException e) {
                System.out.println(e.getMessage());
                continue;
            }

        } while (backstoryOption != 2);

        System.out.println("\n----------------- BATTLE STARTED -------------------");
        Details.displayPickingDetails(hero);
        Story.beforeLevel1();
        Level1.battleMechanic1(hero);

        if (hero.getHeroHp() > 0) {
            Story.afterLevel1();
            System.out.println("\nYou have survived Level 1! Restoring HP and MP...");
            hero.fullRestore();

            System.out.println("\n----------------- FINAL BOSS ENCOUNTER -------------------");
            Details.displayPickingDetails(hero);
            Story.beforeBossFight();
            Finalboss.battleMechanicFinal(hero);
            Story.afterBossFight();
        }

        TerminalMusic.stopMusic();
        sc.close();
    }
}