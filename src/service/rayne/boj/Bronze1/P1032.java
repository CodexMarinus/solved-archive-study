package service.rayne.boj.Bronze1;

import java.util.Scanner;

public class P1032 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int fileCount = Integer.parseInt(scanner.nextLine());

      String[] fileNameArr = scanner.nextLine().split("");

      for (int i = 1; i < fileCount; i++) {
        String[] inputArr = scanner.nextLine().split("");

        for (int j = 0; j < fileNameArr.length; j++) {
          if (!fileNameArr[j].equals(inputArr[j])) fileNameArr[j] = "?";
        }
      }

      System.out.println(String.join("", fileNameArr));
    }
  }
}
