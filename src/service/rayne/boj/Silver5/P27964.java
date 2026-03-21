package service.rayne.boj.Silver5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class P27964 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int ingCount = Integer.parseInt(scanner.nextLine());
      String[] ingArr = scanner.nextLine().split(" ");

      Set<String> ingSet = Arrays.stream(ingArr).filter(s -> s.endsWith("Cheese")).collect(Collectors.toSet());
      if (ingSet.size() >= 4) System.out.println("yummy");
      else System.out.println("sad");
    }
  }
}
