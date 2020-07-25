package com.argetlam.converter;
import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		
		// 1m = 3.28ft
		
		Scanner in = new Scanner(System.in);
		System.out.println("Type 1 for MetersToFeet, Type 2 for FeetToMeters");  
		int num1 = in.nextInt();
		double result = 0;
		double result1 = 0;
		
		if(num1 == 1) {
			System.out.println("How many meters would you like to convert?");
			int num2 = in.nextInt();
			result = num2 * 3.28;
			System.out.println(num2 + " meters is equal to " + result + " feet.");
		}
		
		else {
			System.out.println("How many feet would you like to convert?");
			int num3 = in.nextInt();
			result1 = num3 / 3.28;
			System.out.println(num3 + " feet is equal to " + result1 + " meters");
			
		}
	}

}
