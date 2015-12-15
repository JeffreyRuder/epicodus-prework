import java.io.Console;

public class Potluck {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("What is your first name?");
    Integer nameInt = console.readLine().compareTo("A");

    if (nameInt < 10) {
      System.out.println("Bring chips to the potluck.");
    } else if (nameInt >= 10 && nameInt <= 13) {
      System.out.println("Bring dip to the potluck.");
    } else if (nameInt > 13 && nameInt < 15) {
      System.out.println("Bring drinks to the potluck.");
    } else {
      System.out.println("Bring a main dish to the potluck.");
    }
  }
}
