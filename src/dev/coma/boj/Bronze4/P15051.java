package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P15051 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int[] peopleArr = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

      int minResult = Integer.MAX_VALUE;
      for (int i = 0; i < 3; i++) {
        int sum = 0;

        for (int j = 0; j < 3; j++) {
          sum += Math.abs(i - j) * 2 * peopleArr[j];
        }

        if (minResult > sum) minResult = sum;
      }

      System.out.println(minResult);
    }
  }
}
