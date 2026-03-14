package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P32941 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int classCount = scanner.nextInt();
      int reservedHour = scanner.nextInt();

      int memberCount = scanner.nextInt();
      for (int i = 0; i < memberCount; i++) {
        int memberHourCount = scanner.nextInt();

        boolean canMake = false;
        for (int j = 0; j < memberHourCount; j++) {
          if (scanner.nextInt() == reservedHour) canMake = true;
        }

        if (!canMake) {
          System.out.println("NO");
          return;
        }
      }

      System.out.println("YES");
    }
  }
}
