//Basics - Exercise 7: Write a Java program that takes a number as input and prints its multiplication table upto 10.

package src;

import java.util.Scanner;

public class Exercise_7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int intA = scan.nextInt();
		int x = 0;
		while(x <= 10) {
		
			System.out.println(intA + " * " + x + " = " + (intA * x));
			x++;
		
		}
		scan.close();

	}

}
