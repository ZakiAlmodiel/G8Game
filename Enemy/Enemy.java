public class Enemy{
    public String enemyName;
    public int enemyHp;
    public int enemyMana;
    public int enemyDamage;
    static int dialogueCounter = 0;

    // Constructor for initializer
    public Enemy(String name, int hp, int attack){
        this.enemyName = name;
        this.enemyHp = hp;
        this.enemyDamage = attack;
    }
    
    
    public void enemyAttack(Hero hero){  // Attack Computations
        int damage = 1*enemyDamage;
        hero.heroHp -= 1*enemyDamage;
        System.out.println();
        System.out.print(
            enemyName+" has attacked you! Dealt "+
            damage+" damage"
        );
    }
    
    public void enemyDefeatedDialogue(){    // Sets of dialogues
        String[] deathDialogues = {
            "Enemy: Nooo... my gold...",
            "Enemy: Impossible... I'm... strong...",
            "Enemy: My spells... failed me...",
            "Enemy: Death... takes me again...",
            "Enemy: I... am... eternal..."
        };
        System.out.printf("\n%s\n", deathDialogues[dialogueCounter]);
        dialogueCounter++;
    }

}

