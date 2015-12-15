import java.io.Console;

public class TextCalculator {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Do you want to add, subtract, multiply, or divide?");
    String yourOperation = myConsole.readLine();

    System.out.println("Please enter the first number.");
    String stringFirstNumber = myConsole.readLine();
    float firstNumber = Float.parseFloat(stringFirstNumber);

    System.out.println("Please enter the second number.");
    String stringSecondNumber = myConsole.readLine();
    float secondNumber = Float.parseFloat(stringSecondNumber);

    float resultNumber = 0;
    switch (yourOperation) {
      case "add": resultNumber = firstNumber + secondNumber;
        break;
      case "subtract": resultNumber = firstNumber - secondNumber;
        break;
      case "multiply": resultNumber = firstNumber * secondNumber;
        break;
      case "divide": resultNumber = firstNumber / secondNumber;
        break;
      default: System.out.println("Invalid operation.");
        break;
    }

    System.out.printf("The result is: %f %n", resultNumber);
  }
}
