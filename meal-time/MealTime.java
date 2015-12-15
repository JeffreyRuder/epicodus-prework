import java.io.Console;

public class MealTime {
  public static void main (String[] args) {
    askWhatYouAteFor("breakfast");
    askWhatYouAteFor("lunch");
    askWhatYouAteFor("dinner");
  }

  public static void askWhatYouAteFor(String meal) {
    Console myConsole = System.console();
    System.out.printf("What did you eat for %s? %n", meal);
    String yourMeal = myConsole.readLine();
    System.out.printf("You had %s for %s. %n", yourMeal, meal);
  }
}
