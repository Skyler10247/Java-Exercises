//Data Types - Exercise 8: Write a Java program that reads a number and display the square, cube, and fourth power.

import java.util.Scanner;

public class Exercise_8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = scan.nextDouble();
		scan.close();
		System.out.println("Squared: " + Math.pow(num, 2));
		System.out.println("Cubed: " + Math.pow(num, 3));
		System.out.println("Fourth Power: " + Math.pow(num, 4));
		
	}

}
