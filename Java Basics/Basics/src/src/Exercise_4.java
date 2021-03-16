//Basics - Exercise 4: Write a Java program to print the result of the following operations.
//-5 + 8 * 6, (55+9) % 9, 20 + -3*5 / 8, 5 + 15 / 3 * 2 - 8 % 3

package src;

public class Exercise_4 {

	public static void main(String[] args) {
		
		//Print equation and solutions.
		System.out.println("-5 + 8 * 6 = " + (-5 + (8 * 6)));
		System.out.println("\n(55 + 9) % 9 = " + ((55 + 9) % 9));
		System.out.println("\n20 + -3 * 5 / 8 = " + (20 + (-3 * 5 / 8)));
		System.out.println("\n5 + 15 / 3 * 2 - 8 % 3 = " + (5 + (15 / 3 * 2) - (8 % 3)));
		
	}

}
