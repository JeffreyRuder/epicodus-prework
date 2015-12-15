import java.io.Console;

public class AcademicFeedback {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("What was your grade in your last class? (A/B/C/D/F)");
    String userGrade = console.readLine();

    if (userGrade.startsWith("A") || userGrade.startsWith("B")) {
      System.out.println("Good job!");
    } else if (userGrade.startsWith("C")) {
      System.out.println("Well, a C is okay.");
    } else {
      System.out.println("Ouch, not a good grade.");
    }

  }
}
