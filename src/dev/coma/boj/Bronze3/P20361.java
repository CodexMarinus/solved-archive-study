package dev.coma.boj.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P20361 {
  public static void main(String[] args) throws IOException {
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
      String[] inputSet = bufferedReader.readLine().split(" ");
      int cupCount = Integer.parseInt(inputSet[0]);
      int ballPoint = Integer.parseInt(inputSet[1]);
      int swapCount = Integer.parseInt(inputSet[2]);

      for (int i = 0; i < swapCount; i++) {
        String[] inputSwap = bufferedReader.readLine().split(" ");
        if (!inputSwap[0].equals(ballPoint + "") && !inputSwap[1].equals(ballPoint + "")) continue;

        ballPoint = Integer.parseInt(inputSwap[0]) == ballPoint ? Integer.parseInt(inputSwap[1]) : Integer.parseInt(inputSwap[0]);
      }

      System.out.println(ballPoint);
    }
  }
}
