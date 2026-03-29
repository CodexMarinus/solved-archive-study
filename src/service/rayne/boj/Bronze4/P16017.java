package service.rayne.boj.Bronze4;

import java.util.Scanner;

public class P16017 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] inputArr = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

    if (inputArr[0] >= 8 && inputArr[3] >= 8 && inputArr[1] == inputArr[2]) System.out.println("ignore");
    else System.out.println("answer");
  }
}
