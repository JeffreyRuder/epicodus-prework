import java.io.Console;

public class PingPong {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Please enter a positive integer to ping-pong to.");
    Integer pingPongLimit = Integer.parseInt(console.readLine());
    System.out.println("0");

    for (Integer number = 1; number <= pingPongLimit; number++) {
      if (number % 15 == 0) {
        System.out.println("ping-pong");
      } else if (number % 5 == 0) {
        System.out.println("pong");
      } else if (number % 3 == 0) {
        System.out.println("ping");
      } else {
        System.out.println(number.toString());
      }
    }
  }
}
