//Basics - Exercise 12: Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

package src;

import java.util.Scanner;

public class Exercise_12 {

	public static void main(String[] args) {
		
		java.util.Scanner scan = new Scanner(System.in);
		System.out.print("Input 1st number: ");
		double num1 = scan.nextDouble();
		System.out.print("Input 2nd number: ");
		double num2 = scan.nextDouble();
		System.out.print("Input 3rd number: ");
		double num3 = scan.nextDouble();
		System.out.println("The average is: " + ((num1 + num2 + num3)/3));
		scan.close();
		
	}

}
