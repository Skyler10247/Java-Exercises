//Data Types - Exercise 7: Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and 
//display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).

import java.util.Scanner;

public class Exercise_7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input distance traveled in meters: ");
		float meters = scan.nextFloat();
		System.out.print("Input time in hours minutes and seconds.\nHours: ");
		float hours = scan.nextFloat();
		System.out.print("Minutes: ");
		float minutes = scan.nextFloat();
		System.out.print("Seconds: ");
		float seconds = scan.nextFloat();
		scan.close();
		float totalSeconds = seconds + (minutes * 60) + (hours * 3600);
		float mps = meters / totalSeconds;
		float kph = (meters / 1000) / (totalSeconds / 3600);
		float mph = kph / 1.609f;
		System.out.print("Meters Per Second: " + mps + "\nKilometers Per Hour: " + kph + "\nMiles Per Hour: " + mph);
		
	}

}
