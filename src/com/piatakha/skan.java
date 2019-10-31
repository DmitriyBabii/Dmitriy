package com.piatakha;

import java.util.Scanner;

public class skan {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the number: ");
		int i = sc.nextInt();
		int c = i;

		int k = (c == 0) ? 1 : 0;
		while (c != 0) {
			k++;
			c /= 10;
		}

		int nul = 1;
		for (int s = 1; s < k; s++) {
			nul *= 10;
		}

		for (int f = nul; f >= 1; f = f / 10) {
			int num = i / f % 10;
			System.out.println(num);
		}
	}
}