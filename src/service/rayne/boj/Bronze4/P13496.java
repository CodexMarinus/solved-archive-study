package service.rayne.boj.Bronze4;

import java.util.Scanner;

public class P13496 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int testCase = scanner.nextInt();

    for (int i = 0; i < testCase; i++) {
      int shipCount = scanner.nextInt();
      int shipSpeed = scanner.nextInt();
      int deadline = scanner.nextInt();

      int maxRange = shipSpeed * deadline;
      int money = 0;
      for (int j = 0; j < shipCount; j++) {
        int myShipRange = scanner.nextInt();
        int myMoney = scanner.nextInt();

        if (myShipRange <= maxRange) money += myMoney;
      }

      System.out.printf("Data Set %s:\n%s\n\n", i + 1, money);
    }
  }
}
