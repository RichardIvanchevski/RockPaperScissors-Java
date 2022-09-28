import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String Rock = "Rock";
    private static final String Paper = "Paper";
    private static final String Scissors = "Scissors";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose [r]ock , [p]aper , [s]cissors");

        String playerMove = scanner.nextLine();

        if (playerMove.equals("r") || playerMove.equals("rock")) {
            playerMove = Rock;
        } else if (playerMove.equals("p") || playerMove.equals("paper")) {
            playerMove = Paper;
        } else if (playerMove.equals("s") || playerMove.equals("scissors")) {
            playerMove = Scissors;
        } else {
            System.out.println("Invalid Input. Try again...");
            return;
        }

        Random random = new Random();
        int computerRandomNumber = random.nextInt(4);
        if (computerRandomNumber == 0) {
            computerRandomNumber = random.nextInt(1, 3);
        }

        String computerMove = "";

        switch (computerRandomNumber) {
            case 1:
                computerMove = Rock;
                break;
            case 2:
                computerMove = Paper;
                break;
            case 3:
                computerMove = Scissors;
                break;
        }

        if ((playerMove.equals(Rock) && computerMove.equals(Scissors)) ||
                ((playerMove.equals(Paper) && computerMove.equals(Rock)) ||
                        ((playerMove.equals(Scissors) && computerMove.equals(Paper))))) {
            System.out.println("The computer choose " + computerMove);
            System.out.println("You win.");
        } else if (computerMove.equals(Rock) && playerMove.equals(Scissors) ||
                computerMove.equals(Paper) && playerMove.equals(Rock) ||
                computerMove.equals(Scissors) && playerMove.equals(Paper)) {
            System.out.println("The computer choose " + computerMove);
            System.out.println("You lose.");
        } else {
            System.out.println("The computer choose " + computerMove);
            System.out.println("Its a draw.");
        }
    }
}