package service.rayne.boj.Silver5;

import java.util.Scanner;

public class P28292 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();

    if (input <= 2) System.out.println(1);
    else if (input <= 5) System.out.println(2);
    else System.out.println(3);
  }
}
