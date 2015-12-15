import java.io.Console;

public class MadLibs {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Please enter a noun.");
    String myNoun = myConsole.readLine();

    System.out.println("Please enter an adjective.");
    String myAdjective = myConsole.readLine();

    System.out.println("Your result is:");
    System.out.printf("The %s %s ran to the store. %n", myAdjective, myNoun);
  }
}
