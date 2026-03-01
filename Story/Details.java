import Enemy.Enemy;
import Heroes.Hero;

public class Details {
    // display hero info
    public static void displayPickingDetails(Hero hero) {
        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println("You've picked " + hero.heroName);
        System.out.println("HP: " + hero.heroHp + "/" + hero.maxHp);
        System.out.println("Mana: " + hero.heroMana + "/" + hero.maxMana);
        System.out.println();
    }

    // display during battle
    public static void displayCurrentDetails(Hero hero, Enemy enemy) {
        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.printf("NAMES:%15s%25s\n", hero.heroName, enemy.enemyName);
        System.out.printf("HP:%17d %22d\n", hero.heroHp, enemy.enemyHp);
        System.out.printf("MP:%17d %22d\n", hero.heroMana, enemy.enemyMana);
        System.out.println();
    }
}