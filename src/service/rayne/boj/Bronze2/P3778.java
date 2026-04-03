package service.rayne.boj.Bronze2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P3778 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int testCase = Integer.parseInt(br.readLine());
    for (int i = 0; i < testCase; i++) {
      List<String> firstList = new ArrayList<>(Arrays.asList(br.readLine().split("")));
      List<String> secondList = new ArrayList<>(Arrays.asList(br.readLine().split("")));

      List<String> removeList = new ArrayList<>();
      for (String s : firstList) {
        if (secondList.contains(s)) {
          removeList.add(s);
          secondList.remove(s);
        }
      }

      for (String s : removeList) {
        firstList.remove(s);
      }

      firstList.remove("");
      secondList.remove("");

      bw.write(String.format("Case #%s: %s\n", i + 1, firstList.size() + secondList.size()));
    }

    bw.flush();

    br.close();
    bw.close();
  }
}
