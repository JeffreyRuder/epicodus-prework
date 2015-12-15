import java.io.Console;

public class EvensOdds {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Enter a positive number to even/odd to.");
    Integer limitNumber = Integer.parseInt(console.readLine());

    for (Integer number = 1; number <= limitNumber; number++) {
      if (number % 2 == 0) {
        System.out.println(number.toString() + " is even.");
      } else {
        System.out.println(number.toString() + " is odd.");
      }
    }
  }
}
