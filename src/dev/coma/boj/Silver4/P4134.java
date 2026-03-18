package dev.coma.boj.Silver4;

import java.util.Scanner;

public class P4134 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int testCase = scanner.nextInt();

      for (int i = 0; i < testCase; i++) {
        long input = scanner.nextLong();

        while (!isPrime(input)) input++;
        System.out.println(input);
      }
    }
  }

  private static boolean isPrime(long input) {
    if (input < 2) return false;

    for (long i = 2; i * i <= input; i++) {
      if (input % i == 0) return false;
    }

    return true;
  }
}
