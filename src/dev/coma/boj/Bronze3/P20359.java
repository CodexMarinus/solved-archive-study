package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P20359 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int input = scanner.nextInt();

      int counter = 0;
      while (input % 2 == 0) {
        input /= 2;
        counter++;
      }

      System.out.println(input + " " + counter);
    }
  }
}
