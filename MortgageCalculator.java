/*
 * PROJECT: Mortgage Calculator
 * DESCRIPTION: Calculate the monthly payments of a fixed term mortgage over given Nth terms at a given 
 * 				interest rate. Also figure out how long it will take the user to pay back the loan. 
 * 				For added complexity, add an option for users to select the compounding interval 
 * 				(Monthly, Weekly, Daily, Continually).
 * COMPLETED: 6/29/15
 */

package Numbers;

import java.util.Scanner;

public class MortgageCalculator {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		double loan;
		double interest;
		double paymentInterest;
		int term;
		int payments;
		
		//Asks for and stores loan amount
		System.out.println("What is the amount of your loan?");
		System.out.print("$");
		loan= scanner.nextDouble();
		
		//Asks for and stores interest rate on loan
		System.out.println("What is the annual interest rate on your loan?");
		interest= scanner.nextDouble();
		
		//Converts interest interest per Month
		paymentInterest= interest/12;
		
		//Asks for and stores the term in years
		System.out.println("What is the term of your loan in years?");
		term= scanner.nextInt();
		scanner.close();
		
		//Converts term to monthly payment amounts
		payments=term*12;
		
		System.out.println("");
		System.out.print("Your monthly payment is ");
		System.out.println("$"+loan*((paymentInterest*(Math.pow(1+paymentInterest,payments)))/((Math.pow(1+paymentInterest, payments))-1)));
		System.out.println("It will take you "+ Math.round(loan/(loan*((paymentInterest*(Math.pow(1+paymentInterest,payments)))/((Math.pow(1+paymentInterest, payments))-1))))+ " months to pay of your loan");
		
		

	}

}
