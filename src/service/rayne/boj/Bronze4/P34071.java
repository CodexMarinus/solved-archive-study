package service.rayne.boj.Bronze4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P34071 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int problemCount = scanner.nextInt();
      List<Integer> probList = new ArrayList<>();

      for (int i = 0; i < problemCount; i++) {
        probList.add(scanner.nextInt());
      }

      if (Collections.min(probList).equals(probList.get(0))) System.out.println("ez");
      else if (Collections.max(probList).equals(probList.get(0))) System.out.println("hard");
      else System.out.println("?");
    }
  }
}
