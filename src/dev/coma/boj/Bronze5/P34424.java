package dev.coma.boj.Bronze5;

import java.util.Scanner;

public class P34424 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int peopleCount = scanner.nextInt();
      int length = scanner.nextInt();

      System.out.println((peopleCount * length) - length);
    }
  }
}
