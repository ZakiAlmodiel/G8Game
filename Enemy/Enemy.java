package Enemy;

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

    
}