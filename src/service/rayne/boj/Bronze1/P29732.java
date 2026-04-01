package service.rayne.boj.Bronze1;

import java.util.Scanner;

public class P29732 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int popularCount = scanner.nextInt();
    int vacCount = scanner.nextInt();
    int virusRange = scanner.nextInt();
    scanner.nextLine();

    String[] inputArr = scanner.nextLine().split("");
    boolean[] virusArr = new boolean[inputArr.length];

    for (int i = 0; i < inputArr.length; i++) {
      if (inputArr[i].equals("R")) {
        for (int j = Math.max(0, i - virusRange); j <= Math.min(inputArr.length - 1, i + virusRange); j++) {
          virusArr[j] = true;
        }
      }
    }

    int counter = 0;
    for (boolean result : virusArr) {
      if (result) counter++;
    }

    if (vacCount >= counter) System.out.println("Yes");
    else System.out.println("No");

    scanner.close();
  }
}
