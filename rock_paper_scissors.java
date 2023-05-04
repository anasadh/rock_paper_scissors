import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println("Please enter your move: rock, paper, or scissors.");
        String playerMove = scanner.nextLine().toLowerCase();
        
        int computerInt = random.nextInt(3) + 1;
        String computerMove = "";
        switch (computerInt) {
            case 1:
                computerMove = "rock";
                break;
            case 2:
                computerMove = "paper";
                break;
            case 3:
                computerMove = "scissors";
                break;
        }
        System.out.println("Computer chose: " + computerMove);
        
        if (playerMove.equals(computerMove)) {
            System.out.println("Tie!");
        }
        else if (playerMove.equals("rock")) {
            if (computerMove.equals("scissors")) {
                System.out.println("You win!");
            }
            else {
                System.out.println("Computer wins!");
            }
        }
        else if (playerMove.equals("paper")) {
            if (computerMove.equals("rock")) {
                System.out.println("You win!");
            }
            else {
                System.out.println("Computer wins!");
            }
        }
        else if (playerMove.equals("scissors")) {
            if (computerMove.equals("paper")) {
                System.out.println("You win!");
            }
            else {
                System.out.println("Computer wins!");
            }
        }
        else {
            System.out.println("Invalid move. Please try again.");
        }
    }
}