import java.io.Console;

public class LeapYear {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("What year were you born in?");
    Integer birthYear = Integer.parseInt(console.readLine());

    System.out.println("You were alive during these leap years:");
    for (Integer year = birthYear; year < 2015; year++) {
      if (year % 4 == 0) {
        //Exceptions to this rule ignored for exercise
        System.out.println(year);
      }
    }
  }
}
