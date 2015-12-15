import java.io.Console;

public class ShippingCost {
  public static void main(String[] args) {

    float packageWeight = getInput("package weight in pounds");
    float packageDistance = getInput("distance to travel in miles");
    float estimatedCost = estimateCost(packageWeight, packageDistance);
    System.out.printf("Your estimated cost is: $%.2f %n", estimatedCost);
  }

  public static float getInput(String inputType) {
    Console myConsole = System.console();
    System.out.printf("Please enter the %s. %n", inputType);
    String inputString = myConsole.readLine();
    return Float.parseFloat(inputString);
  }

  public static float estimateCost(float weight, float distance) {
    float modifier = 1.1f;
    float estimatedCost = (weight / 10) + (distance / 5) * modifier;
    return estimatedCost;
  }
}
