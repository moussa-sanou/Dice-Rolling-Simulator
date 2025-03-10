// Create an app that generate random number.
import  java.util.*;
//import java.util.Random;

public class Simulator {

    public static void main(String[] args) {

        // Create an instance to allow user to enter a number of roll they would like.
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("How many dice would you like to roll? ");
            int numberOfDice = scanner.nextInt();

            System.out.println("About to roll " + numberOfDice + " dice");

            Random rand = new Random();

            for (int i = 0; i < numberOfDice; i++)
            {
                int rolledNumber = rand.nextInt(6) + 1;
                System.out.println(display(rolledNumber));
            }

        } catch (InputMismatchException e)
        {
            System.out.println("Invalid input! Please enter a number between 1 and 10");
        }

    }

    // Create a new method which take an int and returns a string
    static String display(int value)
    {
        return switch (value)
        {
            case 1: yield "---------\n|       |\n|   o   |\n|       |\n---------";
            case 2: yield "---------\n| o     |\n|       |\n|     o |\n---------";
            case 3: yield "---------\n| o     |\n|   o   |\n|     o |\n---------";
            case 4: yield "---------\n| o   o |\n|       |\n| o   o |\n---------";
            case 5: yield "---------\n| o   o |\n|   o   |\n| o   o |\n---------";
            case 6: yield "---------\n| o   o |\n| o   o |\n| o   o |\n---------";
            default: yield "Not a valid die value";
        };

    }
}
