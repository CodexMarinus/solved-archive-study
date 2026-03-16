package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P31994 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int maxCount = 0;
      String maxClass = null;

      for (int i = 0; i < 7; i++) {
        String[] input = scanner.nextLine().split(" ");
        int inputCount = Integer.parseInt(input[1]);

        if (inputCount > maxCount) {
          maxCount = inputCount;
          maxClass = input[0];
        }
      }

      System.out.println(maxClass);
    }
  }
}
