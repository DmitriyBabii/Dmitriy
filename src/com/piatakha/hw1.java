package com.piatakha;

public class hw1 {
	
	public static void main(String args[]) {
	int lightspeed, days;
	
	long seconds;
	long distance;
	
	lightspeed = 186000;
	days = 1000;
	seconds = days * 24 * 60 * 60; 
	distance = lightspeed * seconds; 
	System.out.print("�� " + days);
	System.out.print(" ���� ���� ������� ����� ");
	System.out.println(distance + " ����.");
	
	}
}

