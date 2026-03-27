package service.rayne.boj.Bronze4;

import java.util.Scanner;

public class P11121 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int testCase = Integer.parseInt(scanner.nextLine());

    for (int i = 0; i < testCase; i++) {
      String[] input = scanner.nextLine().split(" ");

      if (input[0].equals(input[1])) System.out.println("OK");
      else System.out.println("ERROR");
    }
  }
}
