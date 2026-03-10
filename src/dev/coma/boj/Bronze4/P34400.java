package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P34400 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int testCase = scanner.nextInt();

      for (int i = 0; i < testCase; i++) {
        int input = scanner.nextInt() % 25;

        if (input < 17) System.out.println("ONLINE");
        else System.out.println("OFFLINE");
      }
    }
  }
}
