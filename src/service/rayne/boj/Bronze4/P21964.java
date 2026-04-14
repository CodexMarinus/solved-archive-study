package service.rayne.boj.Bronze4;

import java.util.Scanner;

public class P21964 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String length = scanner.nextLine();
    String input = scanner.nextLine();

    System.out.println(input.substring(input.length() - 5));
    scanner.close();
  }
}
