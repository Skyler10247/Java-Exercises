//Data Types - Exercise 6: Write a Java program to compute body mass index (BMI).

import java.util.Scanner;

public class Exercise_6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input weight in pounds: ");
		double weight = scan.nextDouble();
		System.out.print("Input height in inches: ");
		double height = scan.nextDouble();
		scan.close();
		double bmi = weight * 0.45359237 / (height * 0.0254 * height * 0.0254);
		System.out.println("Body Mass Index: " + bmi);

	}

}
