import java.util.Scanner;
import java.util.function.Consumer;

public class Challenge3 {
  public static double calculateYearlySalary(int hoursPerWeek, double hourlyWage, int vacationDays) {
    double weeksPerYear = 365.0 / 7;
    double result = (weeksPerYear * hoursPerWeek - 8 * vacationDays) * hourlyWage;
    return Double.parseDouble(String.format("%.2f", result));
  }

  public static double calculateYearlySalary(int hoursPerWeek, double hourlyWage) {
    return calculateYearlySalary(hoursPerWeek, hourlyWage, 0);
  }

  public static void main(String[] args) {
    double res = calculateYearlySalary(40, 15.50);
    System.out.println("Result without unpaid vacationdays: " + res);

    res = calculateYearlySalary(40, 15.50, 24);
    System.out.println("Result with 24 days of unpaid vacation: " + res);
  }
}
