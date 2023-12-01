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
   return null;
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
