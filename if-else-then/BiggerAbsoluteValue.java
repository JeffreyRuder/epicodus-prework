import java.io.Console;

public class BiggerAbsoluteValue {

  public static void main(String[] args) {
    Console console = System.console();
    System.out.println("Please enter a number other than 0.");
    String stringUserNumber = console.readLine();
    Integer userNumber = Integer.parseInt(stringUserNumber);
    Integer result = changeNumber(userNumber);
    System.out.println("The result is: " + Integer.toString(result));
  }

  public static Integer changeNumber(Integer number) {
    if (number > 0) {
      return number + 1;
    } else {
      return number - 1;
    }
  }

}
