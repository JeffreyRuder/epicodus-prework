public class PotluckII {
  public static void main(String[] args) {
    String[] peopleComing = {"Alice", "Bob", "Harry", "Sally"};
    String[] thingsToBring = {"nachos", "beer", "pizza", "wings"};

    Integer counter = 0;

    for (String person : peopleComing) {
      System.out.printf("%s should bring %s to the potluck. %n",
      person, thingsToBring[counter]);
      counter += 1;
    }

  }
}
