package service.rayne.boj.Silver3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P15649 {
  private static List<Integer> selectList = new ArrayList<>();

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numCount = scanner.nextInt();
    int selectCount = scanner.nextInt();

    List<Integer> numList = new ArrayList<>();
    for (int i = 1; i <= numCount; i++) {
      numList.add(i);
    }

    selectNumber(numList, selectCount);
  }

  private static void selectNumber(List<Integer> numList, int selectCount) {
    if (selectList.size() >= selectCount) {
      printSelectList();
      return;
    }

    for (Integer i : numList) {
      if (selectList.contains(i)) continue;

      selectList.add(i);
      selectNumber(numList, selectCount);
      selectList.remove(i);
    }
  }

  private static void printSelectList() {
    List<String> resultList = selectList.stream().map(String::valueOf).collect(Collectors.toList());
    System.out.println(String.join(" ", resultList));
  }
}
