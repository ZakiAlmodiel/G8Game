public class Finalboss {
    static Scanner sc = new Scanner(System.in);

    //single boss with special attacks and phases
    
    public static void battleMechanicFinal(Hero hero) {
        // higher HP and stronger damage
        Enemy boss = new Enemy(
            "Azelor, Rift Keeper", 150, 10
        );

        int turn = 0;
        int victory = 0;

        System.out.println(
            "\n----------------- FINAL BOSS: " + boss.enemyName + " -----------------"
        );

    while (victory == 0) {
        turn++;
    // Player turn
        hero.displaySkillOptions();
        System.out.print("Pick a skill (1-5): ");
        
    while (!sc.hasNextInt()) {
        System.out.println("Invalid input. Please enter a number.");
        sc.next();
    }
        int skillNum = sc.nextInt();

    switch (skillNum) {
        case 1:
            

        case 2:
           

        case 3:
           

        case 4:
           

        case 5:
           
        default:
            System.out.println(
                "Invalid skill choice. Please pick a valid option."
            );
            break;
    }
}



