package service.rayne.boj.Bronze4;

import java.util.Scanner;

public class P34750 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int input = scanner.nextInt();

      int parentMoney = 0;
      if (input >= 1000000) parentMoney = (int) (input * 0.2);
      else if (input >= 500000) parentMoney = (int) (input * 0.15);
      else if (input >= 100000) parentMoney = (int) (input * 0.1);
      else parentMoney = (int) (input * 0.05);

      System.out.println(parentMoney + " " + (input - parentMoney));
    }
  }
}
