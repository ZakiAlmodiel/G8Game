package Heroes;

public class Selene extends Hero {

    private static final int DAMAGE_SKILL1 = 5;
    private static final int DAMAGE_SKILL2 = 15;
    private static final int DAMAGE_SKILL3 = 30;
    private static final int MANA_COST1 = 0;
    private static final int MANA_COST2 = 20;
    private static final int MANA_COST3 = 35;

    public Selene(String name) {
        super(name,
              "Light Touch",
              "Blessing",
              "Divine Grace",
              DAMAGE_SKILL1,
              DAMAGE_SKILL2,
              DAMAGE_SKILL3,
              MANA_COST1,
              MANA_COST2,
              MANA_COST3);
    }

    public void displayBackStory() {

        System.out.println("-----------------BACKSTORY-------------------");
        System.out.println();

        System.out.println(
            "Selene is a priestess chosen by the Moon Goddess. " +
            "She was once sheltered, " +
            "but now walks the battlefield to heal allies and smite the unholy."
        );
    }

    public void displaySkillOptions() {

        System.out.println(
            "Skill 1 (Light Touch) | " + skillOneMultiplier +
            " damage | " + skillOneManaCost + " Mana cost"
        );

        System.out.println(
            "Skill 2 (Blessing) | " + skillTwoMultiplier +
            " damage | " + skillTwoManaCost + " Mana cost"
        );

        System.out.println(
            "Skill 3 (Divine Grace) | " + skillThreeMultiplier +
            " damage | " + skillThreeManaCost + " Mana cost"
        );

        System.out.println("Skill 4 (Heal HP)");
        System.out.println("Skill 5 (Heal Mana)");
    }

    @Override
    public void preBattleDialogue() {
        System.out.printf("\nSelene: The moonlight shall guide my victory.\n");
    }

    @Override
    public void victoryDialogue() {
        System.out.printf("\nSelene: The stars bless my triumph.\n");
    }

    @Override
    public void defeatDialogue() {
        System.out.printf("\nSelene: The moon... fades...\n");
    }
}
