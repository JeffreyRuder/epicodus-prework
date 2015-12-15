import java.io.Console;

public class SillyEncrypt {

  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Please enter a phrase to encrypt.");
    String inputPhrase = myConsole.readLine();

    String resultPhrase = encryptPhrase(inputPhrase);
    System.out.println("The encrypted phrase is:");
    System.out.println(resultPhrase);
  }

  public static String encryptPhrase(String originalPhrase) {
    return originalPhrase.replaceAll("e", "*");
  }

}
