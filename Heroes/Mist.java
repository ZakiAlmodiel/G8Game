package Heroes;


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
}