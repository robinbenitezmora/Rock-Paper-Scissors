import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
 private enum Move {
  ROCK, PAPER, SCISSORS;
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
 }

 private class Computer {
  public Move getMove() {
   Move[] moves = Move.values();
   Random random = new Random();
   int index = random.nextInt(moves.length);
   return moves[index];
  }
 }

 public RockPaperScissors() {
 }

 public static void main(String[] args) {
  Move move = Move.ROCK;
  System.out.println(move);
 }
}
