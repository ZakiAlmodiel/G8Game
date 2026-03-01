public class Raizn extends Hero {

    private static final int DAMAGE_SKILL1 = 10;
    private static final int DAMAGE_SKILL2 = 10;
    private static final int DAMAGE_SKILL3 = 35;
    private static final int MANA_COST1 = 10;
    private static final int MANA_COST2 = 8;
    private static final int MANA_COST3 = 40;

    public Raizn(String name) {
        super(name,
              "Power Lash",
              "Shield Bash",
              "Berserk Strike",
              DAMAGE_SKILL1,
              DAMAGE_SKILL2,
              DAMAGE_SKILL3,
              MANA_COST1,
              MANA_COST2,
              MANA_COST3);
    }

    public void displayBackStory() {        // Lore

        System.out.println("-----------------BACKSTORY-------------------");
        System.out.println();

        System.out.println(
            "Raizn was once just a boy from a small mountain village, " +
            "known only as Ralph to his kin. When raiders burned his home " +
            "and left him for dead, he swore never to be powerless again. " +
            "Training with nothing but scraps of steel and sheer will, he " +
            "grew into a warrior feared on every battlefield."
        );
    }

    public void displaySkillOptions() {     // Sets of Skills

        System.out.println(
            "Skill 1 (Power Lash) | " + skillOneMultiplier +
            " damage | " + skillOneManaCost + " Mana cost"
        );

        System.out.println(
            "Skill 2 (Shield Bash) | " + skillTwoMultiplier +
            " damage | " + skillTwoManaCost + " Mana cost"
        );

        System.out.println(
            "Skill 3 (Berserk Strike) | " + skillThreeMultiplier +
            " damage | " + skillThreeManaCost + " Mana cost"
        );

        System.out.println("Skill 4 (Heal HP)");
        System.out.println("Skill 5 (Heal Mana)");
    }

    @Override
    public void preBattleDialogue() {       //Flow of Dialogues
        System.out.printf(
            "\nRaizn: Let's make this quick, I've got better things to do.\n"
        );
    }

    @Override
    public void victoryDialogue() {
        System.out.printf("\nRaizn: Another one down. Who's next?\n");
    }

    @Override
    public void defeatDialogue() {
        System.out.printf("\nRaizn: Ugh... I'll get you next time...\n");
    }
}