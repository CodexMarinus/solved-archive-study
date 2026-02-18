package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P20215 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int width = scanner.nextInt();
      int height = scanner.nextInt();

      double squareLike = width + height;
      double lineLike = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
      System.out.println(squareLike - lineLike);
    }
  }
}
