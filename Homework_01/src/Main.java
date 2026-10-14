import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //Declarations
        String playerA;
        String playerB;
        final String Rock = "R";
        final String Paper = "P";
        final String Scissors = "S";
        String trash = "";

        // User Interaction
        System.out.println("Rock, Paper, Scissors!");

        System.out.println("Player A's turn:");
        playerA = in.next();
        if (!(playerA.equalsIgnoreCase(Rock) ||
            playerA.equalsIgnoreCase(Paper) ||
            playerA.equalsIgnoreCase(Scissors)))
        {
            trash = in.nextLine();
            System.out.println("You didn't input a correct action. \nTry another move");
            System.exit(0);

        }

        System.out.println("Player B's turn:");
        playerB = in.next();
        if (!(playerB.equalsIgnoreCase(Rock) ||
              playerB.equalsIgnoreCase(Paper) ||
              playerB.equalsIgnoreCase(Scissors)))
        {
            trash = in.nextLine();
            System.out.println("You didn't input a correct action. \nTry another move");
            System.exit(0);

        }
        // Outcomes
        if (playerA.equalsIgnoreCase(playerB))
        {
            System.out.println("It's a Draw!");
        }
        else if (playerA.equalsIgnoreCase("R") &&
                playerB.equalsIgnoreCase("S"))
        {
            System.out.println("Rock beats Scissors!");
            System.out.println("Player A Wins!");
        }
        else if (playerA.equalsIgnoreCase("P") &&
                playerB.equalsIgnoreCase("R"))
        {
            System.out.println("Paper beats Rock!");
            System.out.println("Player A Wins!");
        }
        else if (playerA.equalsIgnoreCase("S") &&
                playerB.equalsIgnoreCase("P"))
        {
            System.out.println("Scissors beats Paper!");
            System.out.println("Player A Wins!");
        }
        else if (playerA.equalsIgnoreCase("S") &&
                playerB.equalsIgnoreCase("R"))
        {
            System.out.println("Rock beats Scissors!");
            System.out.println("Player B Wins!");
        }
        else if (playerA.equalsIgnoreCase("R") &&
                playerB.equalsIgnoreCase("P"))
        {
            System.out.println("Paper beats Rock!");
            System.out.println("Player B Wins!");
        }
        else
        {
            System.out.println("Scissors beats Paper!");
            System.out.println("Player B Wins!");
        }
    }
}