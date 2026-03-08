package dev.coma.boj.Bronze4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P34823 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      List<Integer> inputList = new ArrayList<>();
      inputList.add(scanner.nextInt());
      inputList.add(scanner.nextInt() / 2);
      inputList.add(scanner.nextInt());

      System.out.println(Collections.min(inputList));
    }
  }
}
