import java.util.HashMap;

public class AddressBook {
  public static void main(String[] args) {
    HashMap<String, String> addressBook = new HashMap<String, String>();

    addressBook.put("Jane", "123 Main St., Anytown, OR");
    addressBook.put("Gandalf", "678 Wizard Way, Middle Earth");
    addressBook.put("Arya Stark", "Temple of the Many-Faced God, Braavos");
    addressBook.put("Bill Gates", "Some St., Redmond, WA");

    for (String name : addressBook.keySet()) {
      System.out.printf("%s: %s %n", name, addressBook.get(name));
    }
  }
}
