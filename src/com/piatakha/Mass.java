package com.piatakha;

import java.util.Scanner;

public class Mass {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите количество звезд: ");
		int zvezda = sc.nextInt();
		System.out.println("Введите количество плюсов: ");
		int plus = sc.nextInt();
		System.out.println("Введите количество повторений в строке: ");
		int stroka = sc.nextInt();
		System.out.println("Введите количество строк: ");
		int stolb = sc.nextInt();

		for (int c = 0; c < stolb; c++) {
			
			for (int i = 0; i < stroka; i++) {
				String zvezda1 = "";
				String plus1 = "";
				
				for (int j = 0; j < zvezda; j++) {
					System.out.print(zvezda1 + "*");
				}

				for (int j = 0; j < plus; j++) {
					System.out.print(plus1 + "+");
				}
			}
		System.out.println();
		}
	}
}
