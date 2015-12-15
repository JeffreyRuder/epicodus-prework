public class Excitement {
  public static void main(String[] args) {

    String[] excitingThings = {"programming", "weekends", "craft beer",
    "chocolate", "free money"};

    for (String thing : excitingThings) {
      String result = thing.toUpperCase() + "!";
      System.out.println(result);
    }
  }
}
