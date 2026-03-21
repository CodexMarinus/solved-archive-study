package service.rayne.boj.Bronze4;

import java.util.Scanner;

public class P32288 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int inputLength = Integer.parseInt(scanner.nextLine());
      String[] inputArr = scanner.nextLine().split("");

      StringBuilder stringBuilder = new StringBuilder();
      for (String s : inputArr) {
        if ("I".equals(s)) stringBuilder.append(s.toLowerCase());
        else stringBuilder.append(s.toUpperCase());
      }

      System.out.println(String.join("", stringBuilder));
    }
  }
}
