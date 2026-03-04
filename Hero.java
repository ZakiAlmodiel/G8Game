package Heroes;
import Enemy.Enemy;
import Story.Dialogue;




public class Hero extends Dialogue{
    public String heroName;
    public String skillOneName;
    public String skillTwoName;
    public String skillThreeName;
    public int maxHp = 100;
    public int maxMana = 100;
    public int heroHp = 100;
    public int heroMana = 100;
    public int skillOneMultiplier;
    public int skillTwoMultiplier;
    public int skillThreeMultiplier;
    
    public int skillOneManaCost;
    public int skillTwoManaCost;
    public int skillThreeManaCost;
    
    public Hero(
        String name, String skillOneName, 
        String skillTwoName, String skillThreeName, 
        int skillOneMultiplier, int skillTwoMultiplier, 
        int skillThreeMultiplier, int skillOneManaCost, 
        int skillTwoManaCost, int skillThreeManaCost
    ){
        
        this.heroName = name;
        this.skillOneName = skillOneName;
        this.skillTwoName = skillTwoName;
        this.skillThreeName = skillThreeName;
        
        this.skillOneMultiplier = skillOneMultiplier;
        this.skillTwoMultiplier = skillTwoMultiplier;
        this.skillThreeMultiplier = skillThreeMultiplier;
        
        this.skillOneManaCost = skillOneManaCost;
        this.skillTwoManaCost = skillTwoManaCost;
        this.skillThreeManaCost = skillThreeManaCost;
        // start at full health and mana based on max values
        this.heroHp = this.maxHp;
        this.heroMana = this.maxMana;
    }
    
    public void displayBackStory(){
        System.out.println("No back story");
    }

    public void displaySkillOptions(){
        System.out.println("No skills available");
    }
    
    // attack skills use 'this' instead of requiring a hero parameter
    public void skillOne(Enemy enemy) {
        int damage = skillOneMultiplier;
        int manaCost = skillOneManaCost;
        if(this.heroMana >= manaCost) {
            this.heroMana -= manaCost;
            enemy.enemyHp -= damage;
            if(enemy.enemyHp < 0) {
                enemy.enemyHp = 0; // never go negative
            }
            System.out.println(
                heroName + " uses "+ skillOneName+ 
                "! Deals " + damage + " damage.");
        } else {
            System.out.println("Not enough mana for " + skillOneName + "!");
        }
    }

    public void skillTwo(Enemy enemy) {
        int damage = skillTwoMultiplier;
        int manaCost = skillTwoManaCost;
        if(this.heroMana >= manaCost) {
            this.heroMana -= manaCost;
            enemy.enemyHp -= damage;
            if(enemy.enemyHp < 0) {
                enemy.enemyHp = 0;
            }
            System.out.println(
                heroName + " uses "+ skillTwoName+ 
                "! Deals " + damage + " damage.");
        } else {
            System.out.println("Not enough mana for " + skillTwoName + "!");
        }
    }

    public void skillThree(Enemy enemy) {
        int damage = skillThreeMultiplier;
        int manaCost = skillThreeManaCost;
        if(this.heroMana >= manaCost) {
            this.heroMana -= manaCost;
            enemy.enemyHp -= damage;
            if(enemy.enemyHp < 0) {
                enemy.enemyHp = 0;
            }
            System.out.println(
                heroName + " uses "+ skillThreeName+ 
                "! Deals " + damage + " damage.");
        } else {
            System.out.println("Not enough mana for " + skillThreeName + "!");
        }
    }
    
    public void healHP(){
        if(this.heroHp >= this.maxHp){
            System.out.printf("\nHP is currently full\n");
            this.heroHp = this.maxHp;
        } else {
            this.heroHp = Math.min(this.maxHp, this.heroHp + 20);
            System.out.printf("\nHP replenished by 20\n");
        }
    }
    
    public void healMana(){
        if(this.heroMana >= this.maxMana){
            System.out.printf("\nMP is currently full\n");
            this.heroMana = this.maxMana;
        } else {
            this.heroMana = Math.min(this.maxMana, this.heroMana + 20);
            System.out.printf("\nMP replenished by 20\n");
        }
    }
    @Override
    public void preBattleDialogue() {
        // default no dialogue
    }

    @Override
    public void victoryDialogue() {
        // default no dialogue
    }

    @Override
    public void defeatDialogue() {
        // default no dialogue
    }
}
