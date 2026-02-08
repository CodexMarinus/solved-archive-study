package dev.coma.boj.Silver4;

import java.util.Scanner;

public class P29700 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String[] inputSet = scanner.nextLine().split(" ");
      int inputLine = Integer.parseInt(inputSet[0]);
      int memberCount = Integer.parseInt(inputSet[2]);
      String memberSeat = "0".repeat(memberCount);

      int counter = 0;
      for (int i = 0; i < inputLine; i++) {
        String line = scanner.nextLine();

        int startIdx = 0;
        while (startIdx <= line.length() - memberCount) {
          String seatSlice = line.substring(startIdx, startIdx + memberCount);

          if (memberSeat.equals(seatSlice)) {
            counter++;
            startIdx++;
          } else {
            int jumpSize = seatSlice.lastIndexOf("1");
            startIdx += jumpSize + 1;
          }
        }
      }

      System.out.println(counter);
    }
  }
}
