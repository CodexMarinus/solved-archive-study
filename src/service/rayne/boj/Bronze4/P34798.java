package service.rayne.boj.Bronze4;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class P34798 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      LocalTime alarmTime = LocalTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("HH:mm"));
      LocalTime wakeTime = LocalTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("HH:mm"));

      if (alarmTime.isBefore(wakeTime)) System.out.println("YES");
      else System.out.println("NO");
    }
  }
}
