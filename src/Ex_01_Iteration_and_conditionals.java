import java.util.Random;

public class Ex_01_Iteration_and_conditionals {

    public static void main(String[] args)
    {
        System.out.println("WHILE...................................");
        //The statement(s) will be executed as long as condition evaluates to true. statement(s) may be a single statement or a block of statements.
        boolean stop = false;

        while(!stop)
        {
            Random rand = new Random();
            int int_random = rand.nextInt(6) + 1;

            System.out.println("you rolled: " + int_random);

            if (int_random == 6) {
                System.out.println("Done.");
                stop = true;
            }
        }

        System.out.println("DO-WHILE...............................");
        //Statement(s) will be executed once. Then the condition will be evaluated, if it evaluates to true the do block will be executed again.
        // This process repeats until the given condition becomes false.  statement(s) may be a single statement or a block of statements
        stop = false;

        do {
            Random rand = new Random();
            int int_random = rand.nextInt(6) + 1;

            System.out.println("you rolled: " + int_random);

            if (int_random == 6) {
                System.out.println("Done.");
                stop = true;
            }
        } while (!stop);

        System.out.println("FOR..................................");
        for (int i = 1; i <= 5; i++) {
            System.out.println("The value of variable i is " + i);
        }

        System.out.println("FOR-EACH.............................");
        String[] names = { "Fred", "Wilma", "Bambam" };

        for (String name : names) {
            System.out.println("Name is " + name);
        }

    }
}
