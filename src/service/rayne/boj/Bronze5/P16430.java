package service.rayne.boj.Bronze5;

import java.util.Scanner;

public class P16430 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int topNum = scanner.nextInt();
      int botNum = scanner.nextInt();

      System.out.println((botNum - topNum) + " " + botNum);
    }
  }
}
