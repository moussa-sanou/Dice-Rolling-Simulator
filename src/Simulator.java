// Create an app that generate random number.

import java.util.Random;

public class Simulator {

    public static void main(String[] args) {

        // Create an instance for this class
        Random rand = new Random();

        int rolledNumber = rand.nextInt(6) + 1;
        System.out.println(display(rolledNumber));

    }

    // Create a new method which take an int and returns a string
    static String display(int value)
    {
        switch (value)
        {
            case 1: return "---------\n|       |\n|   o   |\n|       |\n---------";
            case 2: return "---------\n| o     |\n|       |\n|     o |\n---------";
            case 3: return "---------\n| o     |\n|   o   |\n|     o |\n---------";
            case 4: return "---------\n| o   o |\n|       |\n| o   o |\n---------";
            case 5: return "---------\n| o   o |\n|   o   |\n| o   o |\n---------";
            case 6: return "---------\n| o   o |\n| o   o |\n| o   o |\n---------";
            default: return "Not a valid die value";
        }

    }
}
