package service.rayne.boj.Bronze4;

import java.util.Scanner;

public class P19698 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int totalCow = scanner.nextInt();
    int width = scanner.nextInt();
    int height = scanner.nextInt();
    int cowSize = scanner.nextInt();

    System.out.println(Math.min((width / cowSize) * (height / cowSize), totalCow));
    scanner.close();
  }
}
