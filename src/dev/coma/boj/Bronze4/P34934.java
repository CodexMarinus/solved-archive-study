package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P34934 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int testCase = Integer.parseInt(scanner.nextLine());

      String result = null;
      for (int i = 0; i < testCase; i++) {
        String[] input = scanner.nextLine().split(" ");

        if (Integer.parseInt(input[1]) == 2026) {
          result = input[0];
        }
      }

      System.out.println(result);
    }
  }
}
