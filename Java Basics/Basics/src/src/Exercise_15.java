//Basics - Exercise 15: Write a Java program to swap two variables.

package src;

public class Exercise_15 {

	public static void main(String[] args) {
		
		int varA = 13;
		int varB = 6;
		int temp = varA;
		System.out.println("varA: " + varA + "  varB: " + varB);
		varA = varB;
		varB = temp;
		System.out.println("SWAP\nvarA: " + varA + "  varB: " + varB);
		
	}

}
