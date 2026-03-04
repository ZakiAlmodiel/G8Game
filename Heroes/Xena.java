package Heroes;

public class Xena extends Hero {
    private static final int DAMAGE_SKILL1 = 15;
    private static final int DAMAGE_SKILL2 = 10;
    private static final int DAMAGE_SKILL3 = 35;
    private static final int MANA_COST1 = 10;
    private static final int MANA_COST2 = 5;
    private static final int MANA_COST3 = 35;

    public Xena(String name) {
        super(name,
              "Blade of Redemption",
              "Chakram Throw",
              "Wrath of Ares",
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
            "Once a feared warlord who led countless raids across kingdoms, " +
            "Xena turned from her dark past to seek redemption. Haunted by the " +
            "lives she destroyed, she now roams the lands battling evil. With " +
            "her skills, wit, and iconic chakram, she protects the innocent " +
            "and confronts her destiny."
        );
    }

    @Override
    public void displaySkillOptions() {
        System.out.println(
            "Skill 1 (Blade of Redemption) | " + getSkillOneMultiplier() +
            " damage | " + getSkillOneManaCost() + " Mana cost"
        );
        System.out.println(
            "Skill 2 (Chakram Throw) | " + getSkillTwoMultiplier() +
            " damage | " + getSkillTwoManaCost() + " Mana cost"
        );
        System.out.println(
            "Skill 3 (Wrath of Ares) | " + getSkillThreeMultiplier() +
            " damage | " + getSkillThreeManaCost() + " Mana cost"
        );
        System.out.println("Skill 4 (Heal HP)");
        System.out.println("Skill 5 (Heal Mana)");
    }

    @Override
    public void preBattleDialogue() {
        System.out.printf("\nXena: Silent death approaches...\n");
    }

    @Override
    public void victoryDialogue() {
        System.out.printf("\nXena: Another life extinguished in silence.\n");
    }

    @Override
    public void defeatDialogue() {
        System.out.printf("\nXena: Even shadows... can fall...\n");
    }
}