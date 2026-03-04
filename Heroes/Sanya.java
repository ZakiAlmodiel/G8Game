package Heroes;

public class Sanya extends Hero {
    private static final int DAMAGE_SKILL1 = 10;
    private static final int DAMAGE_SKILL2 = 20;
    private static final int DAMAGE_SKILL3 = 30;
    private static final int MANA_COST1 = 15;
    private static final int MANA_COST2 = 35;
    private static final int MANA_COST3 = 50;

    public Sanya(String name) {
        super(name,
              "Awra",
              "Scaredycat",
              "Ikot",
              DAMAGE_SKILL1,
              DAMAGE_SKILL2,
              DAMAGE_SKILL3,
              MANA_COST1,
              MANA_COST2,
              MANA_COST3);
    }

    @Override
    public void displayBackStory() {
        System.out.println("-----------------BACKSTORY-------------------");
        System.out.println();
        System.out.println(
            "Sanya was once a performer, until one jealous evil tried to steal " +
            "all her fame and money, destroying her life and family's situation."
        );
    }

    @Override
    public void displaySkillOptions() {
        System.out.println(
            "Skill 1 (Awra) | " + getSkillOneMultiplier() +
            " damage | " + getSkillOneManaCost() + " Mana cost"
        );
        System.out.println(
            "Skill 2 (Scaredycat) | " + getSkillTwoMultiplier() +
            " damage | " + getSkillTwoManaCost() + " Mana cost"
        );
        System.out.println(
            "Skill 3 (Ikot) | " + getSkillThreeMultiplier() +
            " damage | " + getSkillThreeManaCost() + " Mana cost"
        );
        System.out.println("Skill 4 (Heal HP)");
        System.out.println("Skill 5 (Heal Mana)");
    }

    @Override
    public void preBattleDialogue() {
        System.out.printf("\nSanya: Another monster to purify from this land!\n");
    }

    @Override
    public void victoryDialogue() {
        System.out.printf("\nSanya: The light always triumphs over darkness!\n");
    }

    @Override
    public void defeatDialogue() {
        System.out.printf("\nSanya: I... failed to protect them...\n");
    }
}