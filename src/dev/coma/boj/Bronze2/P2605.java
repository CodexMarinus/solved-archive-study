package dev.coma.boj.Bronze2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P2605 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int studentCount = scanner.nextInt();
      List<Integer> studentList = new ArrayList<>();

      for (int i = 0; i < studentCount; i++) {
        int position = scanner.nextInt();

        studentList.add((studentList.size() - position), (i + 1));
      }

      for (Integer num : studentList) {
        System.out.print(num + " ");
      }
    }
  }
}
