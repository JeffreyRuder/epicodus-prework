public class FavoriteFoods {
  public static void main(String[] args) {
    String[] myFavoriteFoods = {"pizza", "nachos", "ice cream", "tacos",
    "mangos", "oatmeal", "wings", "steak", "asparagus"};

    for (Integer index = 0; index < 5; index++) {
      System.out.println("I am eating " + myFavoriteFoods[index] + ".");
    }

    System.out.println("I'm full now.");
  }
}
