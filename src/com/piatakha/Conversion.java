package com.piatakha;

public class Conversion {

	// ������������ ���������� �����,
	
	public static void main(String args[]) {
	byte b;
	int i = 257;
	double d = 323.142;
	System.out.println("���������������� int � byte.");
	b = (byte) i;
	System.out.println("i � b " + i + " " + b) ;
	System.out.println("���������������� double � int.");
	i = (int) d;
	System.out.println("d � i " + d + " " + i);
	System.out.println("���������������� double � byte.");
	b = (byte) d;
	System.out.println("d � b " + d + " " + b);
	}
	}
	

