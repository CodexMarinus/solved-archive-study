package dev.coma.boj.Bronze4;

import java.util.Arrays;
import java.util.Scanner;

public class P9085 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int testCase = scanner.nextInt();

      for (int i = 0; i < testCase; i++) {
        int numCount = scanner.nextInt();
        scanner.nextLine();

        System.out.println(Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::valueOf).sum());
      }
    }
  }
}
