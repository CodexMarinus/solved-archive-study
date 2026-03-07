package dev.coma.boj.Bronze4;

public class P34509 {
  public static void main(String[] args) {
    for (int i = 10; i < 100; i++) {
      if (i % 6 != 0) continue;

      if ((i % 10 == 8) || ((i / 10) % 10 == 8)) continue;

      int num = i % 10 == 0 ? i / 10 : i;
      if (Integer.parseInt(new StringBuilder(num + "").reverse().toString()) % 4 != 0) continue;

      System.out.println(i);
      return;
    }
  }
}
