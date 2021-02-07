import java.util.Scanner;
import java.util.function.Consumer;

public class Challenge1 {
  public static void main(String[] args) {
    String question = "What is 2+5?";
    int[] choices = { 14, 7, 23 };
    int tries = 0;

    final Consumer<Integer> prtNum = num -> System.out.println(num);
    final Consumer<String> prtStr = str -> System.out.println(str);

    prtStr.accept(question);

    // Java's foreach notation
    for (int i : choices) {
      prtNum.accept(i);
    }

    Scanner input = new Scanner(System.in);
    int userInput = 0;
    while (userInput != 7) {
      try {
        tries++;
        if (tries > 1) {
          System.out.println("Please try again.");
        }
        userInput = input.nextInt();
      } catch (Exception e) {
        System.out.println("Please enter only numbers");
        input.nextLine();
      }

    }
    input.close();
    System.out.println("You succeeded after " + tries + " tries.");
  }
}
