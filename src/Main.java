import java.util.Scanner;
// import java.util.function.Consumer;

public class Main {

  public static double calculateTotalPrice(double listedMealPrice, double tipRate, double taxRate) {
    double tip = tipRate * listedMealPrice;
    double tax = taxRate * listedMealPrice;
    double result = listedMealPrice + tip + tax;
    return result;
  }

  public static void print(String str) {
    System.out.println(str);
  }

  public static void main(String[] args) {
    print("Result: " + calculateTotalPrice(15, .2, .08));
  }
}
