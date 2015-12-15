import java.io.Console;

public class TwoDigits {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Please enter a number to check.");
    String stringInput = console.readLine();
    Integer userInput = Integer.parseInt(stringInput);

    if ((userInput >= 10) && (userInput <= 99)) {
      System.out.println(stringInput + " has two digits!");
    } else {
      System.out.println(stringInput + " doesn't have two digits.");
    }
  }
}
