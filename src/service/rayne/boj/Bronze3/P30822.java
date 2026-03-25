package service.rayne.boj.Bronze3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P30822 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      scanner.nextLine();
      char[] inputArr = scanner.nextLine().toCharArray();

      Integer[] uospcArr = new Integer[5];
      Arrays.fill(uospcArr, 0);

      for (int i = 0; i < inputArr.length; i++) {
        char c = inputArr[i];

        if (c == 'u') uospcArr[0]++;
        else if (c == 'o') uospcArr[1]++;
        else if (c == 's') uospcArr[2]++;
        else if (c == 'p') uospcArr[3]++;
        else if (c == 'c') uospcArr[4]++;
      }

      System.out.println(Collections.min(Arrays.asList(uospcArr)));
    }
  }
}
