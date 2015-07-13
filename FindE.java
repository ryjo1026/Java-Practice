/*
 * PROJECT: Find e to the Nth Digit
 * DESCRIPTION: Enter a number and have the program generate e up to that many decimal places. 
 * 				Keep a limit to how far the program will go.
 * COMPLETED: 6/14/2015
 */

package Numbers;

import java.util.Scanner;


public class FindE {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		//Instantiates variable for nDigits of e
		int nDigits;
		
		//Asks for and reads user input
		System.out.println("How many digits of e would you like to compute?");
		nDigits= scanner.nextInt();
		scanner.close();
		
		
		//Prints out nDigits of e
		System.out.println("2."+ Math.round((Math.E-2)*Math.pow(10, nDigits)));
	}

}
