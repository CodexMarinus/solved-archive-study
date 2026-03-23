package service.rayne.boj.Bronze3;

import java.util.Scanner;

public class P5361 {
  private enum Price {
    BLASTER_RIFLE(350.34),
    EYE_SENSOR(230.90),
    EAR_SENSOR(190.55),
    ARM(125.30),
    LEG(180.90);

    final double price;

    Price(double price) {
      this.price = price;
    }
  }

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int testCase = scanner.nextInt();

      for (int i = 0; i < testCase; i++) {
        double sum = 0;

        for (Price p : Price.values()) {
          sum += scanner.nextInt() * p.price;
        }

        System.out.printf("$%.2f\n", sum);
      }
    }
  }
}
