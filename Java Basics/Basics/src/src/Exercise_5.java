//Basics - Exercise 5: Write a Java program that takes two numbers as input and display the product of two numbers.

package src;

import java.util.Scanner;

public class Exercise_5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input first integer: ");
		int intA = scan.nextInt();
		System.out.print("Input second integer: ");
		int intB = scan.nextInt();
		System.out.println(intA + " * " + intB + " = " + (intA * intB));
		scan.close();
		
	}

}
