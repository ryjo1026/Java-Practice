/*
 * PROJECT: Find PI to the Nth Digit
 * DESCRIPTION: Enter a number and have the program generate PI up to that many decimal places. 
 * 				Keep a limit to how far the program will go.
 * COMPLETED: 6/13/2015
 */

package Numbers;

import java.util.Scanner;

public class FindPI {

	public static void main(String[] args) {
		Scanner scanner= new Scanner (System.in);
		
		//Instantiates variable for nDigits of PI
		int nDigits=0;

		//Asks for and reads user input
		System.out.println("How many digits of PI would you like to calculate?");
		nDigits =scanner.nextInt();
		scanner.close();
		
		//Rounds the number to a decimal place determined by nDigit
		System.out.println("3." + Math.round((Math.PI-3)*Math.pow(10,nDigits)));
	}
}
