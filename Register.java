import java.util.Arrays;

public class Register implements Supermarket {
  @Override
  public int checkout(String items) {
    int countA = 0;
    int countB = 0;
    int countC = 0;
    String [] s = items.split("");
    for (int i=0; i < s.length; i++) {
      if (s[i].equals("A")) {countA = ++countA;}
      if (s[i].equals("B")) {countB = ++countB;}
      if (s[i].equals("C")) {countC = ++countC;}
    }
    //  calculate total cost of product A
    int totalCostA = countA * 20;
    //  call method calculateCostB to calculate cost/discount of product B
    int totalCostB = calculateCostB(countB);
    //  calculate total cost of product C
    int totalCostC = countC * 30;
    // calculate grand total
    int grandTotal = totalCostA + totalCostB + totalCostC;
    return grandTotal;
  }
  static int calculateCostB(int countB) {
    int totalCostB = 0;
    while (countB > 0) {
      if (countB > 5) {
        totalCostB = totalCostB + 150;
        countB = countB - 5;
        continue;
      }
      if (countB == 3 || countB == 4 || countB == 5) {
        totalCostB = totalCostB + 150;
        break;
      }
      if (countB == 1 || countB == 2) {
        totalCostB = totalCostB + (countB * 50);
        break;
      }
    }
    return  totalCostB;
  }
}

