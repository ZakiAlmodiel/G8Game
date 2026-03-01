// custom exception
class InvalidChoiceException extends Exception {
    public InvalidChoiceException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        Story.beforeFight(); //quick story, make story nya inside the before fight na method ty!!

        int heroOption = 0; //variable for choosing Hero

        // hero picking with try catch
        while (true) {
            try {
                System.out.println("Pick a Character: ");
                System.out.println("1 - testingHero ");
                System.out.println("2 - testingHero");
                System.out.println("3 - testingHero");
                System.out.println("4 - testingHero");
                System.out.println("5 - testingHero");
                System.out.print("Enter number: ");

                heroOption = sc.nextInt();

                    if (heroOption < 1 || heroOption > 5) {  /*make sure the heroOption is only 1-5 */
                        throw new InvalidChoiceException(
                        "Hero does not exist."
                    );
                    }

                break;

            } catch (InputMismatchException e) {
                System.out.println(
                    "Invalid input! Please enter a number only."
                );
                sc.nextLine(); // clear buffer

            } catch (InvalidChoiceException e) {
                System.out.println(e.getMessage());
            }
        }

        Hero hero = null; //to be assigned by what users choose

        switch (heroOption) {
            case 1: hero = new Sanya("Sanya"); break;
            case 2: hero = new Raizn("Raizn"); break;
            case 3: hero = new Mist("Mist"); break;
            case 4: hero = new Selene("Selene"); break;
            case 5: hero = new Xena("Xena"); break;
        }

        //ensure hero is not null
        if (hero == null) {
            System.out.println("Unexpected error: hero not created.");
            return;
        }

    
    }
}