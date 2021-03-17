//Data Types - Exercise 1: Write a Java program to convert temperature from Fahrenheit to Celsius degree.

import java.util.Scanner;

public class Exercise_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input degrees Fahrenheit: ");
		double degF = scan.nextDouble();
		scan.close();
		double degC = (5 * (degF - 32)) / 9;
		System.out.println("Degrees in Celsius: " + degC);

	}

}
