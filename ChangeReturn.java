/*
 * PROJECT: Change Return
 * AUTHOR: ryjo1026
 * DESCRIPTION: The user enters a cost and then the amount of money given. The program will figure 
 * 		out the change and the number of quarters, dimes, nickels, pennies needed for the 
 * 		change.
 * COMPLETED: 7/5/15
 */

//This Program utilizes Big Decimals for currency to avoid floating point artifacts

package Numbers;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ChangeReturn {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		BigDecimal cost;
		BigDecimal payment;
		BigDecimal change;
		
		//Creates Big Decimals for the values of each coin as well as zero for use in compareTo
		BigDecimal q= new BigDecimal(".25");
		BigDecimal d= new BigDecimal(".1");
		BigDecimal n= new BigDecimal(".05");
		BigDecimal p= new BigDecimal(".01");
		BigDecimal naught= new BigDecimal("0"); //Pretty bad but I couldn't figure out an alternative

		//Creates variables to count each coin
		int quarters = 0;
		int nickels = 0;
		int dimes = 0;
		int pennies = 0;
		
		//Asks for user input for the cost and Rounds it to 2 decimal place
		System.out.println("What is the total cost?");
		cost = scanner.nextBigDecimal();
		cost= cost.setScale(2, RoundingMode.HALF_UP);

		//Asks for user input for the payment by the customer and Rounds it to 2 decimal place
		System.out.println("How much money was paid?");
		payment = scanner.nextBigDecimal();
		payment= payment.setScale(2, RoundingMode.HALF_UP);

		//Checks that the payment is greater than the cost
		if (payment.compareTo(cost) < 0)
			System.out.println("Insufficient payment for given cost");

		//calculates a single variable for the difference between cost and payment
		change = payment.subtract(cost);
		
		
		//While loop runs while there is any amount of change left. Greedy Algorithm subtracts coin values if possible
		while(change.compareTo(naught) > 0){
			if (change.compareTo(q) >= 0) {
				quarters++;
				change= change.subtract(q);
			} 
			else if (change.compareTo(d) >= 0) {
				dimes++;
				change= change.subtract(d);
			} 
			else if (change.compareTo(n) >= 0) {
				nickels++;
				change= change.subtract(n);
			} 
			else {
				pennies++;
				change= change.subtract(p);
			}
		}

		//Prints labeled output of the while loop
		System.out.println(quarters + " Quarter(s)");
		System.out.println(dimes + " Dime(s)");
		System.out.println(nickels + " Nickel(s)");
		System.out.println(pennies + " Pennies");

		//Eclipse yells at you if you don't do this
		scanner.close();
	}

}
