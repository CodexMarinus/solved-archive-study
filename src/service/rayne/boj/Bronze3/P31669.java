package service.rayne.boj.Bronze3;

import java.util.Scanner;

public class P31669 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int teacherCount = scanner.nextInt();
      int timeCount = scanner.nextInt();
      scanner.nextLine();

      boolean[] timeArr = new boolean[timeCount];
      for (int i = 0; i < teacherCount; i++) {
        char[] input = scanner.nextLine().toCharArray();

        for (int j = 0; j < input.length; j++) {
          if (input[j] == 'O') timeArr[j] = true;
        }
      }

      for (int i = 0; i < timeArr.length; i++) {
        if (!timeArr[i]) {
          System.out.println(i + 1);
          return;
        }
      }

      System.out.println("ESCAPE FAILED");
    }
  }
}
