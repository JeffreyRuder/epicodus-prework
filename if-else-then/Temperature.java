import java.io.Console;

public class Temperature {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("What is the temperature outside?");
    Integer userTemperature = Integer.parseInt(console.readLine());

    if (userTemperature < 40) {
      System.out.println("Wear a heavy jacket.");
    } else if (userTemperature >= 40 && userTemperature < 65) {
      System.out.println("Wear a light jacket.");
    } else {
      System.out.println("Just a shirt is okay.");
    }
  }
}
