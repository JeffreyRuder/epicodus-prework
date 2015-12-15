import java.io.Console;

public class FavoriteNumber {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("What is my favorite number?");
    String favoriteNumber = myConsole.readLine();
    System.out.printf("Your favorite number is %s %n", favoriteNumber);
  }
}
