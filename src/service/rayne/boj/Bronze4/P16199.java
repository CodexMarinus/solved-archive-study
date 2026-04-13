package service.rayne.boj.Bronze4;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class P16199 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    LocalDate birthDate = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    LocalDate nowDate = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

    int globalAge = Period.between(birthDate, nowDate).getYears();
    int yearAge = nowDate.getYear() - birthDate.getYear();
    int koreanAge = yearAge + 1;

    System.out.println(globalAge);
    System.out.println(koreanAge);
    System.out.println(yearAge);
    scanner.close();
  }
}
