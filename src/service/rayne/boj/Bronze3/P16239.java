package service.rayne.boj.Bronze3;

import java.util.Scanner;

public class P16239 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int totalKuna = scanner.nextInt();
    int projectCount = scanner.nextInt();

    int counter = 1;
    while (counter <= projectCount) {
      if (counter == projectCount) {
        System.out.println(totalKuna);
        return;
      }

      System.out.println(counter);
      totalKuna -= counter++;
    }

    scanner.close();
  }
}
