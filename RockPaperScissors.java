import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
  private enum Move {
    ROCK, PAPER, SCISSORS;

    public int compareMoves(Move otherMove) {
      // Tie
      if (this == otherMove)
        return 0;

      switch (this) {
        case ROCK:
          return (otherMove == SCISSORS ? 1 : -1);
        case PAPER:
          return (otherMove == ROCK ? 1 : -1);
        case SCISSORS:
          return (otherMove == PAPER ? 1 : -1);
      }

      // Should never reach here
      return 0;
    }
  }

  private class User {
    private Scanner inputScanner;

    public User() {
      inputScanner = new Scanner(System.in);
    }

    public Move getMove() {
      System.out.print("Rock, Paper or Scissors?");
      String userInput = inputScanner.nextLine();
      userInput = userInput.toUpperCase();
      char firstLetter = userInput.charAt(0);
      if (firstLetter == 'R' || firstLetter == 'P' || firstLetter == 'S') {
        switch (firstLetter) {
          case 'R':
            return Move.ROCK;
          case 'P':
            return Move.PAPER;
          case 'S':
            return Move.SCISSORS;
        }
      }
      return getMove();
    }

    public boolean playAgain() {
      System.out.print("Do you want to play again?");
      String userInput = inputScanner.nextLine();
      userInput = userInput.toUpperCase();
      return userInput.charAt(0) == 'Y';
    }
  }

  private class Computer {
    public Move getMove() {
      Move[] moves = Move.values();
      Random random = new Random();
      int index = random.nextInt(moves.length);
      return moves[index];
    }
  }

  private User user;
  private Computer computer;
  private int userScore;
  private int computerScore;
  private int numberOfGames;

  public RockPaperScissors() {
    user = new User();
    computer = new Computer();
    userScore = 0;
    computerScore = 0;
    numberOfGames = 0;
  }

  public static void main(String[] args) {
    Move move = Move.ROCK;
    System.out.println(move);
  }
}
