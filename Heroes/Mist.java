public class Mist extends Hero{


    // subject to change (stats)
    private static final int DAMAGE_SKILL1 = 10;
    private static final int DAMAGE_SKILL2 = 20;
    private static final int DAMAGE_SKILL3 = 15;
    private static final int MANA_COST1 = 15;
    private static final int MANA_COST2 = 30;
    private static final int MANA_COST3 = 20;
    public Mist(String name){
        super(
            name,
            "Mistblade",
            "CloudShift",
            "HazeShift", 
            DAMAGE_SKILL1,
            DAMAGE_SKILL2,
            DAMAGE_SKILL3,
            MANA_COST1, 
            MANA_COST2, 
            MANA_COST3);
    }

    public void displayBackStory(){
        
        System.out.println("-----------------BACKSTORY-------------------");
        System.out.println();
        System.out.println(
        "Mist had been a lone hunter ever since he was a child."+
         "He wielded claw katars made from antlers,\n"+
         "ensuring that the animals he hunted stayed dead (close-combat)."+
         "One night, while searching for food \nin the rainforest,"+
         "he encountered a strange, flood-like cloud sweeping through the trees."+
         "He tried \nto run, but its speed was just unfortunately great…..");
    }
    
    public void displaySkillOptions(){
        System.out.println(
            "Skill 1 (Mistblade) | " + skillOneMultiplier + 
            " damage | " + skillOneManaCost + " Mana cost");
        System.out.println(
            "Skill 2 (CloudShift) | " + skillTwoMultiplier + 
            " damage | " + skillTwoManaCost + " Mana cost");
        System.out.println(
            "Skill 3 (HazeShift) | " + skillThreeMultiplier + 
            " damage | " + skillThreeManaCost + " Mana cost");
        System.out.println("Skill 4 (Heal HP)");
        System.out.println("Skill 5 (Heal Mana)");
    }
    @Override
    public void preBattleDialogue(){
        System.out.printf("\nMist: My blade hungers for battle once more.\n");
    };
    @Override
    public void victoryDialogue(){
        System.out.printf("\nMist: Hmph. Not even a challenge.\n");
    };
    @Override
    public void defeatDialogue(){
        System.out.printf("\nMist: My... blade... betrayed me...\n");
    };
}