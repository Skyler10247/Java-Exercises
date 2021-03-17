//Data Types - Exercise 3: Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

import java.util.Scanner;

public class Exercise_3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input integer between 0 and 1000: ");
		int num = scan.nextInt();
		scan.close();
		if(num >= 0 && num <= 1000) {
			
			char numStr[] = String.valueOf(num).toCharArray();
			int x = 0;
			int sum = 0;
			while(x < numStr.length) {
				
				sum += Integer.parseInt(String.valueOf(numStr[x])); 
				x++;
			
			}
			System.out.println("The sum of all digits in " + num + " is " + sum);
		
		} else {
			
			System.out.println("Invalid value. Exiting...");
			
		}

	}

}
