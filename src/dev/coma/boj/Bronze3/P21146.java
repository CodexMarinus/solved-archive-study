package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P21146 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int judgeCount = scanner.nextInt();
      int alreadyRateCount = scanner.nextInt();
      int notRateCount = judgeCount - alreadyRateCount;

      double sum = 0;
      for (int i = 0; i < alreadyRateCount; i++) {
        sum += scanner.nextInt();
      }

      System.out.println((sum + (-3 * notRateCount)) / judgeCount + " " + (sum + (3 * notRateCount)) / judgeCount);
    }
  }
}
