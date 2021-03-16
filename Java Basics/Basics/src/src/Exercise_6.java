//Basics - Exercise 6: Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

package src;

import java.util.Scanner;

public class Exercise_6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input first integer: ");
		int intA = scan.nextInt();
		System.out.print("Input second integer: ");
		int intB = scan.nextInt();
		System.out.println(intA + " + " + intB + " = " + (intA + intB));
		System.out.println(intA + " - " + intB + " = " + (intA - intB));
		System.out.println(intA + " * " + intB + " = " + (intA * intB));
		System.out.println(intA + " / " + intB + " = " + (intA / intB));
		System.out.println(intA + " % " + intB + " = " + (intA % intB));
		scan.close();
		
	}

}
