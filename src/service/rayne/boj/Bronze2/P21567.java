package service.rayne.boj.Bronze2;

import java.util.Scanner;

public class P21567 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long inputA = scanner.nextLong();
    long inputB = scanner.nextLong();
    long inputC = scanner.nextLong();

    String[] input = String.valueOf(inputA * inputB * inputC).split("");
    int[] countArr = new int[10];
    for (int i = 0; i < input.length; i++) {
      countArr[Integer.parseInt(input[i])]++;
    }

    for (int i : countArr) {
      System.out.println(i);
    }
  }
}
