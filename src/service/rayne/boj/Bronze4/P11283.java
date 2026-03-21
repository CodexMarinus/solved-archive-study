package service.rayne.boj.Bronze4;

import java.util.Scanner;

public class P11283 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			char c = scanner.nextLine().charAt(0);
			
			System.out.println(c - '가' + 1);
		}
	}
}
