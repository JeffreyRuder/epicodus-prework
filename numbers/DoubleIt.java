import java.io.Console;

public class DoubleIt {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Give me a number, and I will double it!");
    String inputStringNumber = myConsole.readLine();
    Integer yourNumber = Integer.parseInt(inputStringNumber);
    Integer yourDoubledNumber = yourNumber * 2;
    System.out.println("I doubled it: " + Integer.toString(yourDoubledNumber));
  }
}
