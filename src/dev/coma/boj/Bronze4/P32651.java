package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P32651 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int input = scanner.nextInt();

      System.out.println((input <= 100000 && input % 2024 == 0) ? "Yes" : "No");
    }
  }
}
