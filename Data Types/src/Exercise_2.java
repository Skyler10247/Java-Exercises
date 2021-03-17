//Data Types - Exercise 2: Write a Java program that reads a number in inches, converts it to meters.

import java.util.Scanner;

public class Exercise_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input inches: ");
		double inches = scan.nextDouble();
		scan.close();
		double meters = inches * 0.0254;
		System.out.println("Meters: " + meters);
		
	}

}
