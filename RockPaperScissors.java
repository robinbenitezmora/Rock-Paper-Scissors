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
   return null;
  }
 }

 public RockPaperScissors() {
 }

 public static void main(String[] args) {
  Move move = Move.ROCK;
  System.out.println(move);
 }
}
