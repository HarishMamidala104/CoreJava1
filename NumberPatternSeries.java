package Harish123;

import java.util.Scanner;

public class NumberPatternSeries {

	public static void main(String[] args) {
		int k = 0;
		Scanner Number = new Scanner(System.in);
		System.out.println("Enetr n value");
		int n = Number.nextInt();
		for (int i = 0; i <= n; ++i) {
			for (int j = 0; j <= n; ++j) {
				System.out.printf("%2d",k);
				k++;

			}
			System.out.println(" ");
			Number.close();
		}

	}

}
