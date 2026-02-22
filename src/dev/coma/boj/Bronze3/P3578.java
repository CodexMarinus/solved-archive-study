package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P3578 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int holeCount = scanner.nextInt();

      if (holeCount == 0) {
        System.out.println(1);
        return;
      }

      if (holeCount == 1) {
        System.out.println(0);
        return;
      }

      System.out.println(("4".repeat(holeCount % 2)) + "8".repeat(holeCount / 2));
    }
  }
}
