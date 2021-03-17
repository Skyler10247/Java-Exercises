//Data Types - Exercise 4: Write a Java program to convert minutes into a number of years and days.

import java.util.Scanner;

public class Exercise_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input minutes: ");
		int minutes = scan.nextInt();
		scan.close();
		int days = minutes / 1440;
		int years = days / 365;
		days = days % 365;
		System.out.println(" minutes is approximately " + years + " years and " + days + " days.");

	}

}
