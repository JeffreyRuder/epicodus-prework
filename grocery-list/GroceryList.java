public class GroceryList {

  public static void main(String[] args) {
    String[] myGroceryList = { "eggs", "bread", "milk", "mangos"};
    Integer[] groceryItemPrices = { 3, 2, 3, 4 };

    System.out.println("My grocery list:");
    for (Integer index = 0; index < myGroceryList.length; index++) {
      System.out.println(myGroceryList[index]);
    }

    Integer total = 0;
    for (Integer price : groceryItemPrices) {
      total += price;
    }

    System.out.println("Your total cost will be: $" + total);
  }

}
