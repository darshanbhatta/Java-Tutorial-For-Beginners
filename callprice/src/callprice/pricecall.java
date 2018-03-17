/**

 * @author  Darshan
 * @youtube youtube.com/DarshPlanet

 */

package callprice;

import java.util.Scanner;

/*
Write a program that computes the cost of a long distance call. The cost of the call is determined
according to the following rate schedule:

1. Any call started between 8:00 Am and 6:00 PM, Monday through Friday, is billed at a rate of
4.50 per minute

2. Any call starting before 8:00 AM or after 6:00 PM, Monday through Friday, is billed at a rate
of 4.00 per minute

3. Any call started on a Saturday or Sunday is charged at a rate of 2.25 per minute

The input will consist the day of the week (Mo, Tu, We, Th, Fr, Sa, Su); the time the call started(in military time) 
and the length of the call in minutes. 

The output will be the cost of the call.

 */

public class pricecall {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		System.out.println("Welcome to the long distance call calc");
		System.out.print("Enter the day: ");
		String day = kb.nextLine();
		System.out.print("Enter the time of day: ");
		int time = kb.nextInt();
		System.out.print("Enter the time of the call: ");
		int duration = kb.nextInt();

		if (day.equals("Sa") || day.equals("Su")) {

			System.out.println("The cost of the call is " + ((double) 2.25 * duration));

		} else {

			if (time <= 8 || time >= 18) {
				System.out.println("The cost of the call is " + ((double) 4 * duration));

			} else {

				System.out.println("The cost of the call is " + ((double) 4.5 * duration));

			}

		}

	}

}
